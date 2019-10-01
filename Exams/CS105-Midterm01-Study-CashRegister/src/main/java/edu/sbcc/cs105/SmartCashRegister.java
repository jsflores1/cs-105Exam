package edu.sbcc.cs105;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class SmartCashRegister {

	
	private double taxRate;
	
	// Register running state instance variables
	private double registerBalance;
	private RegisterState registerState;
	private int salesTransactionCount;
	private double salesTransactionTotal;
	
	// Current transaction instance variables
	private String receipt = "";
	private double currentTransactionSubtotal;
	private double currentTransactionCashBalance;
	
	
	/**
	 * Constructor for the cash drawer
	 * 
	 * @param initialRegisterBalance The amount of cash when the register opens for business
	 * @param d 
	 */
	public SmartCashRegister(double initialRegisterBalance, double taxRate){
		
		registerBalance = initialRegisterBalance;
		this.taxRate = taxRate;
		registerState = RegisterState.Ready;
	}
	
	/**
	 * Returns the amount of cash in the cash drawer
	 * 
	 * @return amount of cash in drawer
	 */
	public double getRegisterBalance() {
		return registerBalance;
	}
	
	/**
	 * Returns the count of sales transactions since the register opened
	 * 
	 * @return count of sales transactions
	 */
	public int getSalesTransactionCount() {
		return salesTransactionCount;
	}

	/**
	 * Returns the total (sum) of sales transactions since the register opened
	 * 
	 * @return total of sales transactions
	 */
	public double getSalesTransactionTotal() {
		return salesTransactionTotal;
	}
	
	/**
	 * Returns the current sales transaction subtotal 
	 * 
	 * @return current sales transaction subtotal
	 */
	public double getCurrentTransactionTotal() {
		return currentTransactionSubtotal * (1 + taxRate);
	}

	/**
	 * Represents the sales tax amount
	 * 
	 * @return sales tax as fractional amount (e.g. 8% = .08)
	 */
	public double getTaxRate() {
		return taxRate;
	}

	
	/**
	 * Prints the receipt from the last completed sales transaction
	 * 
	 * @param printer A PrintStream object which could the standard output, a file, etc.
	 */
	public void printReceipt(PrintStream printer) {
		printer.print(receipt);
	}
	
	
	/**
	 * Represents the salesperson starting a sales transaction
	 */
	public void startSalesTransaction(){
		
		if (registerState != RegisterState.Ready){
			throw new IllegalStateException("A sales transaction is already in progress");
		}
		
		// Initialize sales transaction variables
		receipt = "";
		currentTransactionSubtotal = 0;
		currentTransactionCashBalance = 0;
		registerState = RegisterState.AwaitingItemEntry;
	}

	/**
	 * Represents the salesperson scanning in or entering a sales item through the register interface
	 * 
	 * @param description The item to be sold
	 * @param amount The amount of the item
	 */
	public void enterSalesItem(String description, double amount){
		
		if (registerState != RegisterState.AwaitingItemEntry){
			throw new IllegalStateException("The register is not in a valid state to accept a sales item");
		}
		
		// Add to the sub total
		currentTransactionSubtotal += amount;
		
		
		// Build the receipt line item
		
		String descriptionPart = "";
				
		if (description.length() > 50){
			// Take only the first 50 characters
			descriptionPart = description.substring(0, 49);
		} else if (description.length() == 50){
			descriptionPart = description;
		} else{
			
			// Pad description to the right with a string of spaces equal to 50 minus the length of the description;
			String spaces = new String( new char[50 - description.length()]).replace('\0', ' ');
			descriptionPart = description + spaces;
		}
		
		// Format the amount as currency and pad to the left with spaces.  Assume the formatted amount will never be more than 15 spaces.
		// The cash register couldn't handle that much cash anyway!
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String formattedAmount = nf.format(amount);
		String amountPart = (new String( new char[15 - formattedAmount.length()]).replace('\0', ' ')) + formattedAmount;
		
		String receiptLine = String.format("%s%s\n", descriptionPart, amountPart);
				
		receipt += receiptLine;		
	}
	
	/**
	 * Represents the salesperson hitting the subtotal key on the register interface indicating that all sales items have been entered.
	 * Returns the amount due on the transaction
	 * 
	 * @return amount due with tax
	 */
	public double subtotalTransaction(){
		
		if (registerState != RegisterState.AwaitingItemEntry){
			throw new IllegalStateException("The register is not in a valid state to accept a sales item");
		}
		
		registerState = RegisterState.AwaitingPaymentAmountEntry;
		
		return getCurrentTransactionTotal();
	}
	
	/**
	 * Represents the salesperson entering the amount of money received from the customer. This is not actually the step
	 * of putting money in the till but represents a keypad entry on the register
	 * 
	 * @param paymentAmount The amount of cash handed to the salesperson by the customer
	 * @return 
	 */
	public double enterAmountTendered(double paymentAmount){
		
		if (registerState != RegisterState.AwaitingPaymentAmountEntry){
			throw new IllegalStateException("The transaction must be subtotaled in order to enter the payment amount");
		}
		
		// Confirm the customer payment is at least the amount of the transaction
		BigDecimal customerPayment = new BigDecimal(paymentAmount);
		BigDecimal transactionTotal = new BigDecimal(getCurrentTransactionTotal());
		if (customerPayment.subtract(transactionTotal).signum() == -1){
			throw new IllegalStateException("The customer payment amount must equal or exceed the transaction amount");
		}
		
		// Open the cash drawer
		registerState = RegisterState.AwaitingPayment;
		
		BigDecimal amountDue = customerPayment.subtract(transactionTotal);
		
		return amountDue.doubleValue();
	}
	
	/**
	 * Represents the salesperson putting cash / coins into cash drawer
	 * 
	 * @param amount The amount added to the drawer
	 */
	public void addCashToDrawer(double amount){
		
		if (registerState != RegisterState.AwaitingPayment){
			throw new IllegalStateException("The cash drawer must be open in order to add cash.");
		}
		
		currentTransactionCashBalance += amount;
	}
	
	/**
	 * Represents the salesperson removing cash from the drawer
	 * 
	 * @param amount The amount removed
	 */
	public void removeCashFromDrawer(double amount){
		
		if (registerState != RegisterState.AwaitingPayment){
			throw new IllegalStateException("The cash drawer must be open in order to remove cash.");
		}
		
		currentTransactionCashBalance -= amount;
	}
	
	/**
	 * Closing the cash drawer completes the sales transaction
	 * 
	 */
	public void closeCashDrawer(){
		
		if (registerState != RegisterState.AwaitingPayment){
			throw new IllegalStateException("The cash drawer is not currently open.");
		}
		
		// Keep a watchful eye on the salesperson!
		double epsilon = .001;
		double currentTransactionTotal = getCurrentTransactionTotal();
		double cashBalance = currentTransactionTotal - currentTransactionCashBalance;		
		if (Math.abs(cashBalance) > epsilon){
			throw new IllegalStateException("Hold on there a moment!  The amount of cash added or removed from the drawer is either too much or too little");
		}
		
		// Completing the sales transaction includes
		// 1 - Incrementing the sales transaction count
		// 2 - Adding the current transaction sum to the total
		// 3 - Resetting the current transaction total to zero
		// 4 - Resetting the register state to Ready for the next transaction
		// We do not reset the receipt because we want to print it (possibly multiple times)
		
		salesTransactionCount++;
		salesTransactionTotal += currentTransactionSubtotal;
		currentTransactionSubtotal = 0;
		registerState = RegisterState.Ready;
	}
	
	/**
	 * Cancels an in-progress sales transaction
	 */
	public void cancelSalesTransaction(){
		
		// We can cancel in any state except ready
		if (registerState == RegisterState.Ready){
			throw new IllegalStateException("No sales transaction in progress");
		}
		
		currentTransactionSubtotal = 0;
		registerState = RegisterState.Ready;
	}
}

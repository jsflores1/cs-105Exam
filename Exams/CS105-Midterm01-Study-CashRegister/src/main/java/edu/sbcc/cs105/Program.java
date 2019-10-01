package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {
		
		// Comment or uncomment method calls to see various aspects of this guide
		
		demonstrateValidSalesTransaction();
		
		//demonstrateInvalidSalesTransactionWithInvalidAmountTendered();
		
		//demonstrateInvalidSalesTransactionWithInvalidCashDrawerOperations();
		
		//demonstrateInvalidSalesTransactionWithInvalidStateOperation();
	}

	private static void demonstrateValidSalesTransaction() {
		
		SmartCashRegister register = new SmartCashRegister(100, .0825);
		
		register.startSalesTransaction();
		
		register.enterSalesItem("Toothpaste", 3.99);
		register.enterSalesItem("Beer", 10.99);		
		
		double transactionTotal = register.subtotalTransaction();
		
		double amountTendered = 50;
		double cashDue = register.enterAmountTendered(amountTendered);		
		register.addCashToDrawer(amountTendered);		
		register.removeCashFromDrawer(cashDue);
		
		register.closeCashDrawer();
		
		register.printReceipt(System.out);
	}
	
	private static void demonstrateInvalidSalesTransactionWithInvalidAmountTendered() {
		
		SmartCashRegister register = new SmartCashRegister(100, .0825);
		
		register.startSalesTransaction();
		
		register.enterSalesItem("Toothpaste", 3.99);
		register.enterSalesItem("Beer", 10.99);
		
		
		double transactionTotal = register.subtotalTransaction();
		
		double amountTendered = 5;
		double cashDue = register.enterAmountTendered(amountTendered);
		
		register.addCashToDrawer(amountTendered);
		
		double amountToRemove = cashDue;
		register.removeCashFromDrawer(amountToRemove);
		
		register.closeCashDrawer();
		
		register.printReceipt(System.out);
	}


	private static void demonstrateInvalidSalesTransactionWithInvalidCashDrawerOperations() {
		
		SmartCashRegister register = new SmartCashRegister(100, .0825);
		
		register.startSalesTransaction();
		
		register.enterSalesItem("Toothpaste", 3.99);
		register.enterSalesItem("Beer", 10.99);
		
		
		double transactionTotal = register.subtotalTransaction();
		
		double amountTendered = 50;
		double cashDue = register.enterAmountTendered(amountTendered);
		
		register.addCashToDrawer(amountTendered);
		
		// A little income augmentation. Don't tell!
		double amountToRemove = 500;
		register.removeCashFromDrawer(amountToRemove);
		
		register.closeCashDrawer();
		
		register.printReceipt(System.out);
	}
	
	private static void demonstrateInvalidSalesTransactionWithInvalidStateOperation() {
			
			SmartCashRegister register = new SmartCashRegister(100, .0825);
			
			register.removeCashFromDrawer(100);
	}

}

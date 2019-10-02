package edu.sbcc.cs105;

import edu.sbcc.cs105.EzTaxCalculator;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        
        TaxFiler taxFiler = new TaxFiler(TaxFilingStatus.Single, false, 75000d, 500d, 0d, 10500d);
		EzTaxCalculator calc = new EzTaxCalculator(taxFiler);
        System.out.printf("You earned %d and paid %d in taxes. Your liability is %d and you still owe %d",
            (int)taxFiler.getTotalIncome(),
            (int)taxFiler.getTaxWithheld(),
            (int)calc.getTaxLiability(),
            (int)calc.getTaxesOwed()
        );
    }
}
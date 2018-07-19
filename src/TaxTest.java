//Uses the tax class to print a formated table of taxable income values for each filing status between $50K and $60K
public class TaxTest {
	
	public static void main(String args[]){
		
		//2001 tax tables for $50,000-$60,000 for all four statuses
		Tax[] tax01 = new Tax[44];
		int[][] brackets01 = {
				{27050, 65550, 136750, 297350},
				{45200, 109250, 166500, 297350},
				{22600, 54625, 83250, 148675},
				{36250, 93650, 151650, 297350}	
		};
		double[] rates01 = {0.15, 0.275, 0.305, 0.355, 0.391};
		double taxableIncome01 = 50000;
		
		System.out.println("Taxable Income\tSingle filers\t  Married Jointly\t Married Separately\t Head of Household\n");
		System.out.println("2001\n");
		for(int i = 0; i < tax01.length; i++) {
			tax01[i] = new Tax(i % 4, brackets01, rates01, taxableIncome01);
			if(i % 4 == 0) {
				System.out.print(tax01[i].getTaxableIncome() + " \t");
			}
			System.out.print(tax01[i].getTax(i % 4, taxableIncome01) + "  \t\t");
			if(i % 4 == 3){
				System.out.println();
				taxableIncome01 += 1000;
			}
		}
		
		//2009 tax tables
		Tax[] tax09 = new Tax[44];
		int[][] brackets09 = {
				{8350, 33950, 82250, 171550, 372950},
				{16700, 67900, 137050, 208850, 372950},
				{8350, 33950, 68525, 104425, 186475},
				{11950, 45500, 117450, 190200, 372950}
		};
		double[] rates09 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		double taxableIncome09 = 50000;
		
		System.out.println("\n2009\n");
		for(int i = 0; i < tax01.length; i++) {
			tax09[i] = new Tax(i % 4, brackets09, rates09, taxableIncome09);
			if(i % 4 == 0) {
				System.out.print(tax09[i].getTaxableIncome() + " \t");
			}
			System.out.print(tax09[i].getTax(i % 4, taxableIncome09) + "  \t\t");
			if(i % 4 == 3){
				System.out.println();
				taxableIncome09 += 1000;
			}
		}
	}
}

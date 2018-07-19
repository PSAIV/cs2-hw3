
public class Tax {
	
	//Fields
	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	
	
	//Default Constructor
	Tax() {
		
	}
	
	//Constructor
	Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
		setFilingStatus(filingStatus);
		setBrackets(brackets);
		setRates(rates);
		setTaxableIncome(taxableIncome);
	}
	
	//FilingStatus getter/setter
	public int getFilingStatus() {
		return filingStatus;
	}
	
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	
	//Brackets getter/setter
	public int[][] getBrackets() {
		return brackets;
	}
	
	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}
	
	//Rates getter/setter
	public double[] getRates() {
		return rates;
	}
	
	public void setRates(double[] rates) {
		this.rates = rates;
	}
	
	//TaxableIncome getter/setter
	public double getTaxableIncome() {
		return taxableIncome;
	}
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	
	//Derived Method
	public double getTax(int status, double income) {
		
		double tax = 0;
		for(int i = 0; i < brackets[status].length; i++) {
			if(income > brackets[status][i]) {
				tax += brackets[status][i] * rates[i];
			}
			else {
				income -= brackets[status][i-1];
				tax += income * rates[i];
				break;
			}
		}
		return tax;
	}

}

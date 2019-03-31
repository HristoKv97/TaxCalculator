/**
 * A program made for BOGOFF , which helps them investigate the effectsof the tax
 * system they are proposing. The program calculates the gross income, the tax 
 * and the net income after deducting the taxes.
 * @author Hristo Galabov Kovachev (Student Number : 160359378)
 * Date : 10/11/2016
 */


public class TaxCalculator {
	 int tax; // Taxes payable
	 double grossIncome; //Input child's income
	 int netIncome; // Net income


	
	

	public int TaxPayable(int grossIncomes){
		
	
	Math.round(grossIncome); 
	grossIncome = (int)grossIncome;
	
	
		if( grossIncomes < 0 ){
			System.out.println("Income can't be negative");
		}
		//System.out.print("Tax payable:");
		//income less than  £100
		if ( grossIncomes <= 100 ){
			tax = (int)(grossIncomes*0);
				
		}
		//income between  £101 and  £150
		if ( grossIncomes >= 101  && grossIncomes <= 150 ){
			tax = (int)((grossIncomes-100)*0.1);		
		}
		//income between  £151 and  £200
		if ( grossIncomes >= 151 && grossIncomes<=200 ){
			tax = (int)((grossIncomes-150)*0.2 + 50*0.1);	
		}
		//income between  £201 and  £300
		if ( grossIncomes >= 201 && grossIncomes <= 300 ){
			tax = (int)((grossIncomes-200)*0.4 + 50*0.2 + 50*0.1);		
		}
		//income between  £301 and  £400
		if ( grossIncomes >= 301 && grossIncomes <= 400){
			tax = (int)((grossIncomes-300)*0.6 + 100*0.4 + 50*0.2 + 50*0.1);  
		}
		//income over £401
		if ( grossIncomes >= 401){
			tax = (int)((grossIncomes-400)*1.2 + 100*0.6 + 100*0.4 + 50*0.2 + 50*0.1);			
		}
		return tax;
		
	}
	
	
	// Net income after deducting the taxes
	
	public int IncomeLeft(int grossIncome){
		netIncome = (int)grossIncome - TaxPayable(grossIncome); 
	     return netIncome;
	
	}   
}
	
	


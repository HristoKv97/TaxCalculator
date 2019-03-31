
;
public class TaxChart extends TaxCalculator{
	
 private int[] grossIncomes;
 private  TaxCalculator taxCalculator;
	
	public TaxChart(int[] IncomeArr) {
		
	   taxCalculator = new TaxCalculator();
	   grossIncomes = IncomeArr;
		
		
		
	}
	
	public  void draw(){
		
		// Making a loop for drawing bars for Net Income and Tax 
		for (int i=0; i<grossIncomes.length; i++){
			
		Bar netIncomeBar = new Bar();
		
		netIncomeBar.changeColour(Colour.YELLOW);
	    netIncomeBar.changeSize(5, taxCalculator.IncomeLeft(grossIncomes[i])/4);
	    netIncomeBar.moveHorizontal(grossIncomes[i]/4 );
	    netIncomeBar.moveVertical(230 - taxCalculator.IncomeLeft(grossIncomes[i])/4);
	    netIncomeBar.makeVisible();
	    
	    Bar taxBar = new Bar();
	    
	   
	    taxBar.changeColour(Colour.RED);
	    taxBar.changeSize(5, taxCalculator.TaxPayable(grossIncomes[i])/4);
	    taxBar.moveHorizontal(grossIncomes[i]/4);
	    taxBar.moveVertical(230 - (taxCalculator.IncomeLeft(grossIncomes[i])/4) - (taxCalculator.TaxPayable(grossIncomes[i])/5));
	    taxBar.makeVisible();
		}
		
	                 	}
	// Method for drawing yAxis and yAxis
	public  void yAxis(){
		
		Bar yAxis = new Bar();
		yAxis.makeVisible();
		yAxis.changeColour(Colour.BLACK);
		yAxis.changeSize(230, 2);	
		
		yAxis.moveVertical(230);
	}
	
    public  void xAxis(){
    	Bar xAxis = new Bar();
    	xAxis.makeVisible();
    	xAxis.changeColour(Colour.BLACK);
    	xAxis.changeSize(2, 260);
    	
    	xAxis.moveVertical(-20);
    }
	
	/* Method for printing table with 
    Gross Income , Net Income and Tax using the TaxCalculator */
	public void printTable(){
		System.out.println("Gross Income\tNet Income\tTax");
		
		for(int i=0; i<grossIncomes.length; i++){
			System.out.println((grossIncomes[i]) + "\t" + "\t"+  taxCalculator.IncomeLeft(grossIncomes[i]) + "\t"+ "\t"+taxCalculator.TaxPayable(grossIncomes[i]));
			
		}
		
	}
			
       

		
		
	}
      
	


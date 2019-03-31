
public class BogOff {
		
	public static void taxTables(){
		//Creating array for incomes
		int[] incomeArr = { 25, 50 ,100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375,
							400, 425, 450,500,550};
		
		
		TaxChart taxchart = new TaxChart(incomeArr);
		
		taxchart.xAxis();
		taxchart.yAxis();
		taxchart.draw();
		taxchart.printTable();
	}
		
	

	public static void main(String[] args) {
		
		taxTables();

	}

}

package v1;


public class Test7_20 {
	
	static double[][] sales;
	

	public static void main(String[] args) {
		
		sales = new double[4][5];
		
		
		// Rows (X) are the four employeeID
		// Columns (Y) represent product ID
		// Together the graph displays the total amount of sales for each product sold by each employee
		
		/*
		 *			       Product 1	Product	2	Product	3	Product	4	Product	5	Salesperson total
		 * Salesmen1
		 * Salesmen2
		 * Salesmen3
		 * Salesmen4
		 * Product Total
		 * 
		 * 
		 */
		displayOutput(sales);
		Slip s1 = new Slip(0, 0, 100.00);

		submitSlip(sales, s1);
		submitSlip(sales, new Slip(1, 4, 400.00));
		//System.out.printf("%.2f\n", sales[0][0]);
		
		displayOutput(sales);
		
		
		
	}
	
	public static void displayOutput(double[][] s)
	{
		System.out.print("                  ");
		System.out.printf("%s%15s%15s%15s%15s\n","Product 1","Product 2","Product 3","Product 4","Product 5");
		System.out.printf("%s%11.2f%15.2f%15.2f%15.2f%15.2f\n","Salesperson 1",s[0][0],s[0][1],s[0][2],s[0][3],s[0][4]);
		System.out.printf("%s%11.2f%15.2f%15.2f%15.2f%15.2f\n","Salesperson 2",s[1][0],s[1][1],s[1][2],s[1][3],s[1][4]);
		System.out.printf("%s%11.2f%15.2f%15.2f%15.2f%15.2f\n","Salesperson 3",s[2][0],s[2][1],s[2][2],s[2][3],s[2][4]);
		System.out.printf("%s%11.2f%15.2f%15.2f%15.2f%15.2f\n","Salesperson 4",s[3][0],s[3][1],s[3][2],s[3][3],s[3][4]);
		
		System.out.println();
	}
	
	
	
	public static void submitSlip(double[][] s, Slip slip)
	{
		switch(slip.getEmployeeID())
		{
		case 0:

			switch(slip.getProductID())
			{
			case 0:
				s[0][0] = slip.getProductSales();
				break;
			case 1:
				s[0][1] = slip.getProductSales();
				break;
			case 2:
				s[0][2] = slip.getProductSales();
				break;
			case 3:
				s[0][3] = slip.getProductSales();
				break;
			case 4:
				s[0][4] = slip.getProductSales();
				break;
			}	//end product switch for employee 0
		break;
		case 1:
			switch(slip.getProductID())
			{
			case 0:
				s[1][0] = slip.getProductSales();
				break;
			case 1:
				s[1][1] = slip.getProductSales();
				break;
			case 2:
				s[1][2] = slip.getProductSales();
				break;
			case 3:
				s[1][3] = slip.getProductSales();
				break;
			case 4:
				s[1][4] = slip.getProductSales();
				break;
			}
			
		}
		
	}

}

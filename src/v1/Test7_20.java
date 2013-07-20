package v1;

import java.util.*;


public class Test7_20 {
	
	static double[][] sales;
	static List <Slip> slipList = new ArrayList<Slip>();
	

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
		slipList.add(new Slip(0, 0, 100.00));
		slipList.add(new Slip(0, 1, 100.00));
		slipList.add(new Slip(0, 2, 100.00));
		slipList.add(new Slip(0, 3, 100.00));
		slipList.add(new Slip(0, 4, 100.00));
		slipList.add(new Slip(1, 0, 100.00));
		slipList.add(new Slip(1, 1, 100.00));
		slipList.add(new Slip(1, 2, 100.00));
		slipList.add(new Slip(1, 3, 100.00));
		slipList.add(new Slip(1, 4, 100.00));
		slipList.add(new Slip(2, 0, 100.00));
		slipList.add(new Slip(2, 1, 100.00));
		slipList.add(new Slip(2, 2, 100.00));
		slipList.add(new Slip(2, 3, 100.00));
		slipList.add(new Slip(2, 4, 100.00));
		slipList.add(new Slip(3, 0, 100.00));
		slipList.add(new Slip(3, 1, 100.00));
		slipList.add(new Slip(3, 2, 100.00));
		slipList.add(new Slip(3, 3, 100.00));
		slipList.add(new Slip(3, 4, 100.00));


		for(Slip n: slipList)
			submitSlip(sales, n);
		
		
		displayOutput(sales);
		
		
		
	}
	
	public static double totalColumn(double[][] s, int column)
	{
		double total = 0.0;
		for(int counter = 0; counter < 4; counter++)
		{
			total += s[counter][column];
		}
		return total;
	}
	
	public static double totalRow(double[][] s, int row)
	{
		double total = 0.0;
		for(double sp : s[row])
		{
			total += sp;
		}
		return total;
	}
	
	public static void displayOutput(double[][] s)
	{
		ArrayList<Double> salesPersonTotal = new ArrayList<Double>();
		
		salesPersonTotal.add(totalRow(s,0));
		salesPersonTotal.add(totalRow(s,1));
		salesPersonTotal.add(totalRow(s,2));
		salesPersonTotal.add(totalRow(s,3));

		
		double product1Total = totalColumn(s,0);
		double product2Total = totalColumn(s,1);
		double product3Total = totalColumn(s,2);
		double product4Total = totalColumn(s,3);
		double product5Total = totalColumn(s,4);
		
		double totalSales = 0.0;
		
		for(double sp : salesPersonTotal)
		{
			totalSales += sp;
		}
		
		
		System.out.print("                  ");
		System.out.printf("%s%15s%15s%15s%15s%15s\n","Product 1","Product 2","Product 3","Product 4","Product 5","Total Sales");
		System.out.printf("%s%11.2f%15.2f%15.2f%15.2f%15.2f%15.2f\n","Salesperson 1",s[0][0],s[0][1],s[0][2],s[0][3],s[0][4],salesPersonTotal.get(0));
		System.out.printf("%s%11.2f%15.2f%15.2f%15.2f%15.2f%15.2f\n","Salesperson 2",s[1][0],s[1][1],s[1][2],s[1][3],s[1][4],salesPersonTotal.get(1));
		System.out.printf("%s%11.2f%15.2f%15.2f%15.2f%15.2f%15.2f\n","Salesperson 3",s[2][0],s[2][1],s[2][2],s[2][3],s[2][4],salesPersonTotal.get(2));
		System.out.printf("%s%11.2f%15.2f%15.2f%15.2f%15.2f%15.2f\n","Salesperson 4",s[3][0],s[3][1],s[3][2],s[3][3],s[3][4],salesPersonTotal.get(3));
		System.out.printf("%s%13.2f%15.2f%15.2f%15.2f%15.2f%15.2f\n","Total Sales",product1Total,product2Total,product3Total,product4Total,product5Total,totalSales);
		
		System.out.println();
	}
	
	
	
	public static void submitSlip(double[][] s, Slip slip)
	{
		s[slip.getEmployeeID()][slip.getProductID()] += slip.getProductSales();
	}

}

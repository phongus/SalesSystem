package v1;


public class Slip 
{
	private int employeeID;
	private int productID;
	private double productSales;
	
	public Slip()
	{
		setEmployeeID(0);
		setProductID(0);
		setProductSales(0.0);
	}
	
	public Slip(int e, int p, double s)
	{
		setEmployeeID(e);
		setProductID(p);
		setProductSales(s);
	}
	
	public void setEmployeeID(int e)
	{
		employeeID = e;
	}
	
	public void setProductID(int p)
	{
		productID = p;
	}
	
	public void setProductSales(double s)
	{
		productSales = s;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public int getProductID()
	{
		return productID;
	}
	
	public double getProductSales()
	{
		return productSales;
	}
	
	public String toString()
	{
		return ("Employee ID " + employeeID + " Product ID " + productID + " productSales " + productSales);
	}

}

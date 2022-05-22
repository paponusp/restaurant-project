package classes;

import java.lang.*;

public class FastFood extends Order
{
	private double rate;
	
	public FastFood()
	{
		super();
		System.out.println("FF-E");
	}
	public FastFood(int orderNumber, String itemName, int quantity, double rate)
	{
		super(orderNumber, itemName, quantity);
		System.out.println("FF-P");
		this.rate = rate;
	}

	public void setRate(double rate){this.rate = rate;}
	public double getrate(){return rate;}
	
	public void showDetails()
	{
		System.out.println("Order Number : " + this.getOrderNumber());
		System.out.println("Item Name : " + this.getItemName());
		System.out.println("Quantity  : " + this.getQuantity());
		System.out.println("Rate: "+ rate);
	}
}
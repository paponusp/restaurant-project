package classes;

import java.lang.*;

public class SoftDrink extends Order
{
	private int price;
	
	public SoftDrink()
	{
		super();
		System.out.println("SD-E");
	}
	public SoftDrink(int orderNumber, String itemName, int quantity, int price)
	{
		super(orderNumber, itemName, quantity);
		System.out.println("SD-P");
		this.price = price;
	}
	
	public void setPrice(int price){this.price = price;}
	public int getPrice(){return price;}
	
	public void showDetails()
	{
		System.out.println("Order Number : " + this.getOrderNumber());
		System.out.println("Item Name : " + this.getItemName());
		System.out.println("Quantity : " + this.getQuantity());
		System.out.println("Price : "+ price);
	}
}
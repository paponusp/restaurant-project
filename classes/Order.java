package classes;

import java.lang.*;
import interfaces.OrderOperations;

public abstract class Order implements OrderOperations
{	
	private int orderNumber;
    private String itemName;
	private int quantity;

	public Order()
	{
		System.out.println("Empty-Order");
	}
	public Order(int orderNumber, String itemName, int quantity)
	{
		System.out.println("Parameterized-Order");
		this.orderNumber = orderNumber;
		this.itemName = itemName;
		this.quantity = quantity;
	}
		
	public void setOrderNumber(int orderNumber){ this.orderNumber = orderNumber; }
	public void setItemrName(String itemName){	this.itemName = itemName; }
	public void setQuantity(int quantity){	this.quantity = quantity; }
	
	public int getOrderNumber(){ return orderNumber; }
	public String getItemName(){ return itemName; }
	public int getQuantity(){ return quantity;	}
	
	public abstract void showDetails();
	
	public boolean addItem(int amount)
	{
		boolean flag = false;
		if(amount>0)
		{
			quantity = quantity + amount;
			flag = true;
		}
		return flag;
	}
	public boolean removeItem(int amount)
	{
		boolean flag = false;
		if(amount>0 && amount<=quantity)
		{
			quantity = quantity - amount;
			flag = true;
		}
		return flag;
	}
}
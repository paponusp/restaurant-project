package classes;

import java.lang.*;
import interfaces.CustomerOperations;


public class Customer implements CustomerOperations
{
	private int id;
	private String name;
	private Order orders[] = new Order[20];
		
	public Customer()
	{
		System.out.println("E-Customer");
	}
	public Customer(int id, String name)
	{
		System.out.println("P-Customer");
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id){this.id = id;}
	public void setName(String name){this.name = name;}
	
	public int getId(){return id;}
	public String getName(){return name;}
	
	public void showDetails()
	{
		System.out.println("*********************************");
		System.out.println("Customer ID: " + id);
		System.out.println("Customer Name: " + name);
		System.out.println();
	}
	
	public boolean insertOrder(Order o)
	{
		boolean flag = false;
		for(int i=0; i<orders.length; i++)
		{
			if(orders[i] == null)
			{
				orders[i] = o;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeOrder(Order o)
	{
		boolean flag = false;
		for(int i=0; i<orders.length; i++)
		{
			if(orders[i] == o)
			{
				orders[i] = null;
				flag = true;
				break;
			}
		}
		return flag;	
	}
	public void showAllOrders()
	{
		System.out.println("////////////////////");
		for(int i=0; i<orders.length; i++)
		{
			if(orders[i] != null)
			{
				orders[i].showDetails();
				System.out.println();
			}
		}
	}
	public Order searchOrder(int orderNumber)
	{
		Order o = null;
		for(int i = 0; i<orders.length; i++)
		{
			if(orders[i] != null)
			{
				if(orders[i].getOrderNumber() == orderNumber)
				{
					o = orders[i];
					break;
				}
			}
		}
		return o;
	}
}
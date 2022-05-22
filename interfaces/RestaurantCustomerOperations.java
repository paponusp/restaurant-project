package interfaces;

import java.lang.*;
import classes.Customer;

public interface RestaurantCustomerOperations
{
	boolean insertCustomer(Customer c);
	boolean removeCustomer(Customer c);
	Customer searchCustomer(int id);
	void showAllCustomers();
}
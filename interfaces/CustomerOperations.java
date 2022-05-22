package interfaces;
import java.lang.*;
import classes.Order;


public interface CustomerOperations
{
	boolean insertOrder(Order o);
	boolean removeOrder(Order o);
	Order searchOrder(int orderNumber);
	void showAllOrders();
}
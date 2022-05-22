import java.lang.*;
import java.util.Scanner;
import fileio.*;
import classes.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Restaurant r = new Restaurant();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-------------------------------------------");
		System.out.println("WelCome to UMA Restaurant");
		System.out.println("-------------------------------------------");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Customer Order Management");
			System.out.println("\t4. Check Order ");
			System.out.println("\t5. Exit");
			System.out.println();
			
			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Employee Management");
					System.out.println("-------------------------------------------");
					System.out.println();
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					System.out.println();
					
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Employee");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(r.insertEmployee(e1))
							{
								System.out.println("Employee " + e1.getEmpId() + " has been Inserted");
							}
							else
							{
								System.out.println("Employee " + e1.getEmpId() + " can NOT be Inserted");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Employee");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							System.out.print("Enter Employee ID for removing: ");
							String empId2 = sc.next();
							
							Employee e2 = r.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("### Employee Found for removing ###");
								if(r.removeEmployee(e2))
								{
									System.out.println("Employee " + e2.getEmpId() + " has been Removed");
								}
							}
							else
							{
								System.out.println("### Employee NOT Found and can NOT be removed ###");
							}
							System.out.println();
							break;
								
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Employee");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							System.out.print("Enter Employee ID for searching: ");
							String empId3 = sc.next();
							
							Employee e3 = r.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("### Employee Found ###");
								System.out.println("Employee ID: " + e3.getEmpId());
								System.out.println("Employee Name: " + e3.getName());
								System.out.println("Employee Salary: " + e3.getSalary());
							}
							else
							{
								System.out.println("### Employee NOT Found ###");
							}
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Employees");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							r.showAllEmployees();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							System.out.println();
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Inavlid Option...");
							System.out.println("-------------------------------------------");
							System.out.println();
							break;
					}
					
					break;
					
				case 2:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Existing Customer");
					System.out.println("\t3. Search a Customer");
					System.out.println("\t4. Show All Customers");
					System.out.println("\t5. Go Back");
					System.out.println();
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Customer");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							System.out.print("Enter Customer ID: ");
							int id1 = sc.nextInt();
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
							
							Customer c1 = new Customer(id1, name1);
							
							if(r.insertCustomer(c1))
							{
								System.out.println("Customer " + c1.getId() + " has been Inserted");
							}
							else
							{
								System.out.println("Customer " + c1.getId() + " can NOT be Inserted");
							}
							System.out.println();
							break;
							
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove a Customer");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							break;
								
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search a Customer");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Customers");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							r.showAllCustomers();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							System.out.println();
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Inavlid Option...");
							System.out.println("-------------------------------------------");
							System.out.println();
							break;
					}
					
					break;
					
				case 3:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer-Order Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Order for a Customer");
					System.out.println("\t2. Remove Existing Order for a Customer");
					System.out.println("\t3. Search an Order for a Customer");
					System.out.println("\t4. Show All Orders of a Customer");
					System.out.println("\t5. Go Back");
					System.out.println();
					
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();
					
					
					switch(option3)
					{
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Order for a Customer");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							System.out.print("Enter Customer ID: ");
							int id1 = sc.nextInt();
							
							Customer c1 = r.searchCustomer(id1);
							
							if(c1 != null)
							{
								System.out.println("### Valid Customer ###");
								System.out.println("Which type of Order do you want?");
								System.out.println("\t1. FastFood Order");
								System.out.println("\t2. SoftDrink Order");
								System.out.println("\t3. Go Back");
								System.out.println();
								
								System.out.print("Your Type: ");
								int type = sc.nextInt();
								
								Order o = null;
								
								if(type == 1)
								{
									System.out.println("-------------------");
									System.out.println("Creating FastFood order");
									System.out.println("-------------------");
									System.out.println();
									
									System.out.print("Enter Order Number : ");
									int on = sc.nextInt();
									System.out.print("Enter Item Name : ");
									String in = sc.next();
									System.out.print("Enter Order Quantity : ");
									int oq = sc.nextInt();
									System.out.print("Enter Order Rate : ");
									double or = sc.nextDouble();
									
									FastFood ff = new FastFood(on, in, oq, or);
									
									o = ff;
								}
								else if(type == 2)
								{
									System.out.println("-------------------");
									System.out.println("Creating SoftDrink Order");
									System.out.println("-------------------");
									System.out.println();
									
									System.out.print("Enter Order Number : ");
									int on = sc.nextInt();
									System.out.print("Enter Item Name : ");
									String in = sc.next();
									System.out.print("Enter order Quantity : ");
									int oq = sc.nextInt();
									System.out.print("Enter Item Price : ");
									int ip = sc.nextInt();
									
									SoftDrink sd = new SoftDrink(on, in, oq, ip);
									
									o = sd;
								}
								else if(type == 3)
								{
									System.out.println("-------------------");
									System.out.println("Going Back...");
									System.out.println("-------------------");
								}
								else
								{
									System.out.println("-------------------");
									System.out.println("Invalid Type");
									System.out.println("-------------------");
								}
								
								if(o != null)
								{
									if(c1.insertOrder(o))
									{
										System.out.println("Order " + o.getOrderNumber() + " has been Inserted for " + c1.getId());
									}
									else
									{
										System.out.println("Order " + o.getOrderNumber() + " can NOT be Inserted for " + c1.getId());
									}
								}
							}
							else
							{
								System.out.println("### Invalid Customer ###");
							}
							System.out.println();							
							break;
							
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Order for a Customer");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							break;
								
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Order for Customer");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Orders of a Customers");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							System.out.print("Enter Customer ID: ");
							int id4 = sc.nextInt();
							
							Customer c4 = r.searchCustomer(id4);
							
							if(c4 != null)
							{
								System.out.println("### Valid Customer ###");
								c4.showDetails();
								c4.showAllOrders();
							}
							else
							{
								System.out.println("### Invalid Customer ###");
							}
							System.out.println();
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							System.out.println();
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Inavlid Option...");
							System.out.println("-------------------------------------------");
							System.out.println();
							break;
					}
					break;
					
				case 4:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose check Order");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Add Item");
					System.out.println("\t2. Remove Item");
					System.out.println("\t3. Show All Activity");
					System.out.println("\t4. Go Back");
					System.out.println();
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();
					
					
					switch(option4)
					{
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to add more item");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							System.out.print("Enter Customer ID : ");
							int id1 = sc.nextInt();
							
							Customer c1 = r.searchCustomer(id1);
							
							if(c1 != null)
							{
								System.out.println("### Valid Customer ###");
								
								System.out.print("Enter Order Number : ");
								int on = sc.nextInt();
								
								Order o = c1.searchOrder(on);
								
								if(o != null)
								{
									System.out.println("### Valid Order ###");
									System.out.println();
									
									System.out.println("Current Quantity : " + o.getQuantity());
									
									System.out.print("Enter Add Item ");
									int am = sc.nextInt();
									
									if(o.addItem(am))
									{
										System.out.println("## Add Item Successfull ##");
										System.out.println("New Quantity : " + o.getQuantity());
										frwd.writeInFile(c1.getId() + " has added " + am + " item in order " + o.getOrderNumber());
									}
									else
									{
										System.out.println("### Inavlid Order ###");
									}
								}
								else
								{
									System.out.println("### Invalid Order ###");
								}
							}
							else
							{
								System.out.println("### Invalid Customer ###");
							}
							System.out.println();
							break;
							
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to remove item");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							System.out.print("Enter Customer ID : ");
							int id2 = sc.nextInt();
							
							Customer c2 = r.searchCustomer(id2);
							
							if(c2 != null)
							{
								System.out.println("### Valid Customer ###");
								
								System.out.print("Enter Order Number : ");
								int on = sc.nextInt();
								
								Order o = c2.searchOrder(on);
								
								if(o != null)
								{
									System.out.println("### Valid Order ###");
									System.out.println();
									
									System.out.println("Current Quantity : " + o.getQuantity());
									
									System.out.print("Enter Remove Item : ");
									int am = sc.nextInt();
									
									if(o.removeItem(am))
									{
										System.out.println("## Remove Item Successfull ##");
										System.out.println("New Quantity : " + o.getQuantity());
										frwd.writeInFile(c2.getId() + " has removed " + am + " item from order " + o.getOrderNumber());
									}
									else
									{
										System.out.println("### Inavlid Order ###");
									}
								}
								else
								{
									System.out.println("### Invalid Order ###");
								}
							}
							else
							{
								System.out.println("### Invalid Customer ###");
							}
							System.out.println();
							break;
								
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Activity");
							System.out.println("-------------------------------------------");
							System.out.println();
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							System.out.println();
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Inavlid Option...");
							System.out.println("-------------------------------------------");
							System.out.println();
							break;
					}
					
					break;
					
				case 5:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
					
					break;
					
				default:
				
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice....");
					System.out.println("-------------------------------------------");
					break;
			}
		}		
	}
}
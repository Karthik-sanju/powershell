

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

	public class Grocery {
		
		static String mobileNumber;
		static String dateOfPurchase;
		static LinkedList<Customer> customers = new LinkedList<>();
		static LinkedList<Groceries> groceries = new LinkedList<>();
		static LinkedList<Transaction> transactions= new LinkedList<>();
		private int groceryId;
		private String name;
		private String price;
		
		static void addCustomerDetails() {

			    Scanner sc = new Scanner(System.in);

			    System.out.print("Enter customer id: ");
			    int customerId = sc.nextInt();
			    System.out.print("Enter customer name: ");
			    String name = sc.next();
			    System.out.print("Enter customer city: ");
			    String city = sc.next();
			    System.out.print("Enter customer mobileNumber: ");
			    String mobileNumber = sc.next();
			    Customer customer =new Customer(customerId,name,city,mobileNumber );
			    customers.add(customer);
			    
			}
		static void addGroceryDetails(){
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Enter grocery id: ");
		    int groceryId = sc.nextInt();
		    System.out.print("Enter grocery name: ");
		    String name = sc.next();
		    System.out.print("Enter grocery price: ");
		    int price = sc.nextInt();
		   Groceries grocery =new Groceries(groceryId,name,price);
		   groceries.add(grocery);
		    
		}
		static void addTransactionDetails() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Enter transaction id: ");
		    int transactionId = sc.nextInt();
		    System.out.print("Entergrocery id : ");
		    int groceryId = sc.nextInt();
		    System.out.print("Enter customer id: ");
		    int customerId = sc.nextInt();
		    System.out.print("Enter dateOfPurchase: ");
		    String dateOfPurchase = sc.next();
		    Transaction transaction =new Transaction(transactionId, groceryId,customerId,dateOfPurchase);
		    transactions.add(transaction);
		    }
	    static void viewCustomerDetails() {
			Scanner sc = new Scanner(System.in);
			
		    System.out.print("Enter customer id: ");
		    int customerId = sc.nextInt();
		    for(Customer c: customers) {
		    	if(c.customerId == customerId) {
		    	System.out.println("Name: " + c.name +"  city: " + c.city + "  mobileNumber: "+ c.mobileNumber);
		    	return;
		    	}
		    	}
}
		static void viewGroceryDetails() {
			Scanner sc = new Scanner(System.in);

		    System.out.print("Enter groceryId: ");
		    int groceryId = sc.nextInt();
		        for(Groceries g: groceries) {
		    	if(g.groceryId == groceryId) {
		    	System.out.println("id: "+g.groceryId   +"Name: " + g.name +"  price: " + g.price);
		    	return;
		    	}
		    	}
		    
		  
		}
	    static void viewTransactionDetails() {
	    	Scanner sc = new Scanner(System.in);

		    System.out.print("Enter TransactionId: ");
	    	 int TransactionId = sc.nextInt();
			    for(Transaction t: transactions) {
			    	if(t.transactionId == TransactionId) {
			    	System.out.println("groceryid: " + t.groceryId  +"  customerId: " +t.customerId + "   dateOfPurchase: "+  t.dateOfPurchase);
			    	return;
			    	}
			    	}
		
		}

		public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    while (true) {
	    	System.out.println("******************************************************");
	    	System.out.println("   Welcome to the Grocery Shop Management system ");
	    	System.out.println("******************************************************");
	        System.out.println("1. Add customer details ");
	        System.out.println("2. Add grocery details ");
	        System.out.println("3. Add transaction details ");
	        System.out.println("4. View customer details ");
	        System.out.println("5. View grocery details ");
	        System.out.println("6. View transaction details ");
	        System.out.println("7. Exit ");
	        System.out.print("Enter your choice: ");
	         int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	               addCustomerDetails();
	                break;
	            case 2:
	                addGroceryDetails();
	                break;
	            case 3:
	            	addTransactionDetails();
	                break;
	            case 4:
	            	 viewCustomerDetails();
	                break;
	            case 5:
	            	viewGroceryDetails();
	                break;
	            case 6:
	               viewTransactionDetails();
	                break;
	            case 7:
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    }
		}
}

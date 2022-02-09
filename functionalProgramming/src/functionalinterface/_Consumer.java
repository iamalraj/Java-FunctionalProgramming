package functionalinterface;

import java.util.function.Consumer;
import java.util.function.BiConsumer;



public class _Consumer {

	public static void main(String[] args) {
		
		Customer c=new Customer("Alex","0809088099");
		
		//Calling normal function
		greetCustomer(c);
		
		//Calling method using implementation using Consumer functional interface
		greetCustomerConsumer.accept(c);
		
		//Calling BiConsumer
		greetCustomerConsumer2.accept(c,true);

	}
	// Normal Function 
	static void greetCustomer(Customer customer) {
		System.out.println("Hello "+customer.customerName+
				", thanks for registering your number "+customer.customerPhone);
	}
	
	//Consumer Functional Interface
	static Consumer<Customer>greetCustomerConsumer = customer -> 
		System.out.println("Hello "+customer.customerName+
			", thanks for registering your number "+customer.customerPhone);
		
		
	//BiConsumer - 2 parameters Customer and Boolean:hidePhone
	static BiConsumer<Customer,Boolean>greetCustomerConsumer2 = (customer,hidePhone) -> 
		System.out.println("Hello "+customer.customerName+
			", thanks for registering your number "+ 
				(hidePhone ? "**********" : customer.customerPhone));	
		
	
	static class Customer{
		
		private final String customerName;
		private final String customerPhone;
	
		public Customer(String customerName, String customerPhone) {
			this.customerName = customerName;
			this.customerPhone = customerPhone;
		}
	}

}

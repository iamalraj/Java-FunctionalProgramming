package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		
		//For Normal Function
		System.out.println(dbConnectionURL());
		
		//For Supplier Functional Interface
		System.out.println(dbConnectionURLSupplier.get());
	}
	//Normal Function
	static String dbConnectionURL() {
		return "jdbc://localhost:5432/users";
	}
	//Supplier
	static Supplier<String>dbConnectionURLSupplier = () 
			-> "jdbc://localhost:5432/users";
}

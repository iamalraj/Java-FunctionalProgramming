package callbackandothers;

import java.util.function.Consumer;

public class Callbacks {

	public static void main(String[] args) {
		
		//Consumer
		hello("John","Montana", value -> {System.out.println("No lastName provided for "+value);});
		
		//Runnable - No arguments
		hello2("John",null, () -> {System.out.println("No lastName provided");});

	}

	// Using consumer
	static void hello(String firstName, String lastName, Consumer<String> callback) {
		System.out.println(firstName);
		if(lastName!=null) {
			System.out.println(lastName);			
		}
		else {
			callback.accept(firstName);
		}
	}
	
	//Using runnable without taking arguments
	static void hello2(String firstName, String lastName, Runnable callback) {
		System.out.println(firstName);
		if(lastName!=null) {
			System.out.println(lastName);			
		}
		else {
			callback.run();
		}
	}
}
// callback is a function passed as argument in another function
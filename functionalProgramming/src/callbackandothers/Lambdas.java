package callbackandothers;

import java.util.function.BiFunction;

public class Lambdas {

	public static void main(String[] args) {
		
		BiFunction<String, Integer, String> upperCaseName = (name,age) ->{
			//logic
			if(name.isBlank()) {
				throw new IllegalArgumentException("");
			}
			System.out.println(age);
			return name.toUpperCase();
		};

		System.out.println(upperCaseName.apply("Alex", 20));
	}

}

//added in java 8
//method without name
//takes in parameters and return value

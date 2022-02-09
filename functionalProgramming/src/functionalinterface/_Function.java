package functionalinterface;

import java.util.function.Function;
import java.util.function.BiFunction;


public class _Function {

	public static void main(String[] args) {
		//function example1
		int incNum = incrementByOneFunction.apply(10);
		System.out.println(incNum);
		//function example2
		int mulNum = multiplyBy10Function.apply(incNum);
		System.out.println(mulNum);
		
		//chaining function to a new function use addThen
		Function<Integer, Integer>addAndMultiply = incrementByOneFunction.andThen(multiplyBy10Function);
		int addAndMul = addAndMultiply.apply(mulNum);
		System.out.println(addAndMul);
		
		//BiFunction example
		int addMul = incrementAndMultiplyBifunction.apply(10, 10);
		System.out.println(addMul);
	}
	//Function 1
	static Function<Integer,Integer>incrementByOneFunction = number -> number + 1;
	//Function 2
	static Function<Integer,Integer>multiplyBy10Function = number -> number * 10;
	//BiFunction
	static BiFunction<Integer,Integer,Integer>incrementAndMultiplyBifunction = 
			(number1,number2) -> (number1+1)*number2;

}

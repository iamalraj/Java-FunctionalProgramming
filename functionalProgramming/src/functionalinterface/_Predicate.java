package functionalinterface;
import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		
		//For Normal Function
		System.out.println(isValid("08088099012"));
		System.out.println(isValid("080880990"));
		
		//For Predicate functional interface
		System.out.println(isValidPredicate.test("08088099012"));
		System.out.println(isValidPredicate.test("080880990"));

	}
    
	// Normal Function
	static boolean isValid(String phone) {
		return phone.startsWith("08")&&phone.length()==11;
	}
	
	//Predicate Functional Interface
	static Predicate<String>isValidPredicate = phone -> 
	phone.startsWith("08")&&phone.length()==11;
	
	
}

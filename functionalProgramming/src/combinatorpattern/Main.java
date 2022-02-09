package combinatorpattern;

import static combinatorpattern.CustomerRegistrationValidator.*;
import java.time.LocalDate;
import combinatorpattern.CustomerRegistrationValidator.ValidationResult;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(
				"Alice",
				"alice@gmail.com",
				"+919544305078",
				LocalDate.of(2000, 1, 1)
				);
		
		//CustomerValidatorService validator = new CustomerValidatorService();
		//System.out.println(validator.isValid(customer));
		
		//Using combinator pattern
		//chaining functions in a clean fashion
		ValidationResult result = isEmailValid()
			.and(isPhoneValid())
			.and(isAdult())
			.apply(customer);
		
		// to add more validations add the new implementation in the interface and chain the validation logic the same way the above 3 validations are chained
		// these functions are not run until .apply is used
		
		System.out.println(result);
		
		if (result!=ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
		
	}

}

package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
	
	public boolean isEmailValid(String email) {
		return email.contains("@");
	}
	
	public boolean isPhoneValid(String phone) {
		return phone.startsWith("+9");
	}
	
	public boolean isAdult(LocalDate dob) {
		return Period.between(dob,LocalDate.now()).getYears()>18;
	}
	
	public boolean isValid( Customer customer) {
		return isEmailValid(customer.getEmail())&&isPhoneValid(customer.getPhone())&&isAdult(customer.getDob());
	}

}

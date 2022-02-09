package imperative;

import java.util.*;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
	public static void main(String[] args) {

		List<Person>people = List.of(
				new Person ("John", MALE),
				new Person ("Maria", FEMALE),
				new Person ("Aisha", FEMALE),
				new Person ("Alex", MALE),
				new Person ("Alice", FEMALE)
				);
		
		//Imperative Approach
		System.out.println("This is from imperative approach :");
		List<Person>females=new ArrayList<>();
		for(Person person : people) {
			if(FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		for(Person female : females) {
			System.out.println(female);
		}
		
		//Declarative Approach
		System.out.println("This is from declarative approach :");

		people.stream()
		.filter(person -> MALE.equals(person.gender))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
	static class Person {
		private final String name;
		private final Gender gender;
		
		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;	
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
		
	}
		enum Gender{
			MALE,
			FEMALE
	}

}

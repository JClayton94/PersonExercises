package exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class PersonMain {

	static ArrayList<Person> personArray = new ArrayList<Person>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Person Josh = new Person("Josh", 24, "Software Engineer");

		Person Josh2 = new Person("Josh2", 25, "Dude");

		Person Josh3 = new Person("Josh3", 20000, "Freestyle rapper");

		personArray.add(Josh);
		personArray.add(Josh2);
		personArray.add(Josh3);

		for(Person person : personArray) {

			System.out.println(person.allVars());

		}
		
		if(nameSearch()) {
			
			System.out.println("Person is in table!");
			
		} else {
			
			System.out.println("Person is not in table!");
			
		}


	}

	public static boolean nameSearch() {

		System.out.println("Enter name: ");
		String name = sc.nextLine();

		for(Person person : personArray) {

			if(person.getName().equals(name)) {
				return true;
			}

		}
		return false;
	}
}

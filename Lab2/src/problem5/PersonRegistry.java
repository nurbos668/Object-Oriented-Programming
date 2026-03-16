package problem5;

import java.util.*;

public class PersonRegistry {
	private List<Person> people;
	
	public PersonRegistry() {
		this.people = new ArrayList<>();
	}
	
	public void addPerson(Person p) {
		people.add(p);
	}
	
	public void removePerson(Person p) {
		if (!people.remove(p)) {
			System.out.println("Not found");
		}
	}
	
	public List<Person> getPeopleWithPets() {
		List<Person> result = new ArrayList<>();
		for (Person p : people) {
			if (p.hasPet()) {
				result.add(p);
			}
		}
		return result;
	}
	
	public List<Person> getPeopleWithoutPets() {
		List<Person> result = new ArrayList<>();
		for (Person p : people) {
			if (!p.hasPet()) {
				result.add(p);
			}
		}
		return result;
	}
	
	public void printAll() {
		System.out.println("\n");
		for (Person p : people) {
			System.out.println(p);
		}
	}
}

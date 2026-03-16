package problem5;

import java.util.Objects;

public abstract class Person {
	private String name;
	private int age;
	private Animal pet;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Animal getPet() {
		return this.pet;
	}
	
	public void assignPet(Animal pet) {
		if (pet == null) {
			System.out.println("Failed: null pet");
			return;
		}
		
		if (!canHavePet(pet)) {
			System.out.println(name + " can't have a " + pet.getClass().getSimpleName());
			return;
		}
		
		if (this.pet != null) {
			System.out.println("Already has a pet");
			return;
		}
		
		this.pet = pet;
		pet.setOwner(this);
		System.out.println(name + " now owns " + pet.getName());		
	}
	
	public void removePet() {
		this.pet = null;
	}
	
	public boolean hasPet() {
		if (this.pet != null) {
			return true;
		}
		else return false;
	}
	
	public abstract String getOcupation();
	
	public String getName() {
		return this.name;
	}
	
	public boolean canHavePet(Animal pet) {
		return true;
	}
	
	public void leavePetWith(Person p) {
		if (pet == null) {
			System.out.println(name + " doesn't have a pet");
			return;
		}
		
		if (!p.canHavePet(pet)) {
			System.out.println(p.name + " can't take care of a pet");
			return;
		}
		
		if(p.hasPet()) {
			System.out.println(p.name + " already has a pet");
			return;
		}
		System.out.println(name + " leaves " + pet.name + " with " + p.name);
		p.assignPet(pet);
		this.pet = null;
	}
	
	public void retrievePet(Person p) {
		Animal temp = p.getPet();
		if(!temp.getOgOwner().equals(this)) {
			System.out.println("This pet doesn't belong to " + name);
		}
		p.removePet();
		this.assignPet(temp);
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + " | Age: " + this.age + " | Pet: " + this.pet;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Person other = (Person) obj;
	    return age == other.age && 
	           Objects.equals(name, other.name) && 
	           Objects.equals(pet, other.pet);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age, pet);
	}
}

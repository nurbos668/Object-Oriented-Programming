package problem5.copy;

import java.util.Objects;

public class Dog extends Animal{
	private String breed;
	
	public Dog(String name, int age) {
		super(name, age);
		this.breed = "Mixed";
	}
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public String getSound() {
		return "Woooof woof";
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override 
	public boolean equals(Object  obj) {
		if (!super.equals(obj)) return false;
		Dog other = (Dog) obj;
		return Objects.equals(breed, other.breed);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(super.hashCode(), breed);
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", Breed: " + this.breed;
	}
}

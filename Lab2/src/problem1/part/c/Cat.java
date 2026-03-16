package problem1.part.c;

import java.util.*;

public class Cat extends Animal{
	private String breed;
	
	public Cat(String name, int age, String breed) {
		super(name, age);
		this.setBreed(breed);
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.breed == ((Cat)obj).breed) {
			return true;
		}
		else return false;
	}
	
	public String toString() {
		return super.toString() + " | Breed: " + this.breed;
	}
	
	public int hashCode() {
		return Objects.hash(super.getName(), super.getAge(), breed);
	}

}

package problem5.copy;

import java.util.Objects;

public class Fish extends Animal {
	private String water;
	
	public Fish(String name, int age) {
		super(name, age);
		this.water = "fresh";
	}
	
	public Fish(String name, int age, String water) {
		super(name, age);
		this.water = water;
	}

	@Override
	public String getSound() {
		return "Bubble buble";
	}
	
	public String getWater() { 
		return this.water;
	}
	
	@Override 
	public boolean equals(Object  obj) {
		if (!super.equals(obj)) return false;
		Fish other = (Fish) obj;
		return Objects.equals(water, other.water);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(super.hashCode(), water);
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", Type of water: " + this.water;
	}	
}

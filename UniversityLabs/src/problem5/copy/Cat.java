package problem5.copy;

import java.util.Objects;

public class Cat extends Animal {
	private String color;

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	@Override
	public String getSound() {
		return "Meow meow";
	}
	
	public String getColor() {
		return this.color;
	}
	
	@Override 
	public boolean equals(Object  obj) {
		if (!super.equals(obj)) return false;
		Cat other = (Cat) obj;
		return Objects.equals(color, other.color);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(super.hashCode(), color);
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", Color: " + this.color;
	}

}

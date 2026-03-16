package problem5.copy;

import java.util.Objects;

public class Bird extends Animal{
	private boolean canFly;
	
	public Bird(String name, int age) {
		super(name, age);
		this.canFly = true;
	}
	
	public Bird(String name, int age, boolean c) {
		super(name, age);
		this.canFly = c;
	}
	
	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	@Override
	public String getSound() {
		return "Chirik chirik";
	}

	
	@Override 
	public boolean equals(Object  obj) {
		if (!super.equals(obj)) return false;
		Bird other = (Bird) obj;
		return canFly == other.canFly;
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(super.hashCode(), canFly);
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", Can fly: " + this.canFly;
	}


}

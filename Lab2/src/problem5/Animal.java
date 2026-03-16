package problem5;

import java.util.Objects;

public abstract class Animal {
	protected String name;
	protected int age;
	protected Person owner;
	protected Person ogOwner;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		this.owner = null;
		this.ogOwner = null;
	}
	
	public abstract String getSound();
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public Person getOwner() {
		return this.owner;
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
		if (owner != null && ogOwner == null) {
			this.ogOwner = owner;
		}
	}
	
	public Person getOgOwner() {
		return this.ogOwner;
	}
	
	
	@Override 
	public boolean equals(Object  obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Animal other = (Animal) obj;
		return age == other.age && Objects.equals(this.name, other.name) && Objects.equals(this.ogOwner, other.ogOwner);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(name, age, ogOwner);
	}
	
	@Override 
	public String toString() {
		return getClass().getSimpleName() + " " + name + " " + age + ", Sound: " + getSound() + (owner != null ? ", Owned by " + owner.getName() : ", No owner");
	
	}
}

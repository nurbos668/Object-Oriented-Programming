package problem1.part.c;

import java.util.*;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return this.name + " | " + this.age;
	}
	
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	
	public boolean equals(Object obj) {
		if (this.hashCode() == obj.hashCode()) {
			return true;
		}
		else return false;
	}
}

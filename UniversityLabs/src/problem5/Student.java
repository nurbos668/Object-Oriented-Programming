package problem5;

import java.util.Objects;

public class Student extends Person {
	private String major; 
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override
	public String getOcupation() {
		return "Student: " + this.major;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override 
	public boolean equals(Object  obj) {
		if (!super.equals(obj)) return false;
		Student other = (Student) obj;
		return Objects.equals(this.major, other.major);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(super.hashCode(), major);
	}
	
	@Override 
	public String toString() {
		return super.toString() + " | Major: " + this.major;
	}

}

package problem5.copy;

import java.util.Objects;

public class Employee extends Person{
	private String job;

	public Employee(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}

	@Override
	public String getOcupation() {
		return "Employee: " + this.job;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	@Override 
	public boolean equals(Object  obj) {
		if (!super.equals(obj)) return false;
		Employee other = (Employee) obj;
		return Objects.equals(this.job, other.job);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(super.hashCode(), job);
	}
	
	@Override 
	public String toString() {
		return super.toString() + " | Job: " + this.job;
	}
}

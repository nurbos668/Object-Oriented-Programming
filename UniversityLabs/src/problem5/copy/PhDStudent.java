package problem5.copy;

import java.util.Objects;

public class PhDStudent extends Person {
	private String researchTopic; 
	
	public PhDStudent(String name, int age, String researchTopic) {
		super(name, age);
		this.researchTopic = researchTopic;
	}

	@Override
	public String getOcupation() {
		return "PhDStudent: " + this.researchTopic;
	}
	
	public boolean canHavePet(Animal pet) {
		if (pet instanceof Dog) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String getTopic() {
		return this.researchTopic;
	}
	
	public void setTopic(String researchTopic) {
		this.researchTopic = researchTopic;
	}
	
	@Override 
	public boolean equals(Object  obj) {
		if (!super.equals(obj)) return false;
		PhDStudent other = (PhDStudent) obj;
		return Objects.equals(this.researchTopic, other.researchTopic);
	}
	
	@Override 
	public int hashCode() {
		return Objects.hash(super.hashCode(), researchTopic);
	}
	
	@Override 
	public String toString() {
		return super.toString() + " | Topic: " + this.researchTopic;
	}
}

package problem2;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable {
	private int studentId;
	
	
	public Student(String name, int age, int id) {
		super(name, age);
		studentId = id;
	}


	@Override
	public void move() {
		System.out.println("Student is moving");
	}


	@Override
	public void retakeExam() {
		System.out.println("Student is retaking");
	}


	@Override
	public void eatPizza() {
		System.out.println("Student is eating");
	}
	
	
}

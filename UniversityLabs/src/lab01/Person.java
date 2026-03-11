package lab01;

public class Person {
	
	static int personNumber;
	private final int personId;
	
	private String name;
	private int age;
	private Gender gender;
	
	{
		personNumber++;
		personId = personNumber;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age, Gender gender) {
		this(name);
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return(name);
	}
	
	public int getAge() {
		return(age);
	}
	
	public Gender getGender() {
		return(gender);
	}
	
	public int getId() {
		return(personId);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}

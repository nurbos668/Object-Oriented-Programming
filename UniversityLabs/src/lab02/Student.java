package lab02;

public class Student {
	
	private String name;
	private int id;
	private int yearOfStudy;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Nurbo = new Student("Nurbolsyn", 34985);
		System.out.println(Nurbo.getName());
		System.out.println(Nurbo.getId());
		Nurbo.incrementYear();
		System.out.println(Nurbo.getYearOfStudy());

	}
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		this.yearOfStudy = 1;
	}
	
	public String getName() {
		return(name);
	}
	
	public int getId() {
		return(id);
	}
	
	public void incrementYear() {
		this.yearOfStudy++;
	}
	
	public int getYearOfStudy() {
        return yearOfStudy;
    }

}

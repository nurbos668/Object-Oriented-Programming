package lab01.problem04;

public class Course {
	
	private String name;
	private String description;
	private int creditsNum;
	private String prerequisits;
	
	public Course(String name, String description, int credistNum, String prerequisits) {
		this.name = name;
		this.description = description;
		this.creditsNum = creditsNum;
		this.prerequisits = prerequisits; 
	}
	
	public String getName() {
		return(name);
	}
	
	public String getDescription() {
		return(description);
	}

}

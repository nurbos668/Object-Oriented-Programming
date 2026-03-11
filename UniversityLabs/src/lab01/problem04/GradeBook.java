package lab01.problem04;

import practise02.Student;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class GradeBook {
	Scanner scanner = new Scanner(System.in);
	
	private Course course;
	private List<Student> students;
	private HashMap<String, Double> grades;
	
	public GradeBook(Course course, List<Student> students) {
		this.course = course;
		this.students = students;
		this.grades = new HashMap<>();
	}
	
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for " + this.course.getDescription() + " " + this.course.getName() + "!");
		
		System.out.println("Please, input grades for students:");
		for(Student s : students) {
			System.out.println("Student " + s.getName() + ": " );
			Double grade = scanner.nextDouble();
			grades.put(s.getName(), grade);
		}
	}
	
	public void displayGradeReport() {
		System.out.println("Class average is: " + determineClassAverage());
		System.out.println("Lowest grade is: " + getLowestGrade());
		System.out.println("Highest grade is: " + getHighestGrade());
		
		System.out.println(outputBarChat());
	}
	
	public String outputBarChat() {
		StringBuilder res = new StringBuilder();
		res.append("Grades distribution:\n");
		
		String[] ranges = {"00-09", "10-19", "20-29", "30-39", "40-49",
                "50-59", "60-69", "70-79", "80-89", "90-99", "100"};
		
		int rangeIndex = 0;
		for(String range : ranges) {
		    res.append(range).append(": ");
		    for(double grade : grades.values()) {
		        if(rangeIndex == 10) { // последний диапазон - 100
		            if(grade == 100) res.append("*");
		        } else {
		            if(grade >= rangeIndex * 10 && grade <= rangeIndex * 10 + 9) {
		                res.append("*");
		            }
		        }
		    }
		    res.append("\n");
		    rangeIndex++;
		}
		
		return(res.toString());
	}
	
	public double determineClassAverage() {
		double classAverage = 0;
		int studentsNum = 0;
		
		for(HashMap.Entry<String, Double> entry : grades.entrySet()) {
			classAverage += entry.getValue();
			studentsNum += 1;
		}
		
		return(classAverage / studentsNum);
	}
	
	public double getLowestGrade() {
		double lowestGrade = 100;
		
		for(HashMap.Entry<String, Double> entry : grades.entrySet()) {
			double x = entry.getValue();
			if(x < lowestGrade) lowestGrade = x;
			}
		
		return lowestGrade;
	}
	
	public double getHighestGrade() {
		double highestGrade = 0;
		
		for(HashMap.Entry<String, Double> entry : grades.entrySet()) {
			double x = entry.getValue();
			if(x > highestGrade) highestGrade = x;
			}
		
		return highestGrade;
	}
	
	public void displayStudents() {
		for(HashMap.Entry<String, Double> entry : grades.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}

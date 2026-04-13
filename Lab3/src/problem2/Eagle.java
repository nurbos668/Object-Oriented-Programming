package problem2;

public class Eagle implements Flyable {

	 @Override
	 public void move() {
	     System.out.println("Eagle is moving...");
	 }
	
	 @Override
	 public void fly() {
	     System.out.println("Eagle is flying high!");
	 }
}

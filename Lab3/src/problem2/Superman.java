package problem2;

public class Superman implements Runnable, Flyable {

	 @Override
	 public void move() {
	     System.out.println("Superman is moving...");
	 }
	
	 @Override
	 public void run() {
	     System.out.println("Superman is running at super speed!");
	 }
	
	 @Override
	 public void fly() {
	     System.out.println("Superman is flying through the sky!");
	 }
}
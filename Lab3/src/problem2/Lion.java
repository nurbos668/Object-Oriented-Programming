package problem2;

public class Lion implements Runnable {
	private String name;
	
	public Lion(String name) {
		this.name = name;
	}
	
	@Override
	public void move() {
		System.out.println("Lion " + name + " is moving");
	}

	@Override
	public void run() {
		System.out.println("Lion " + name + " is running");
	}
	
}

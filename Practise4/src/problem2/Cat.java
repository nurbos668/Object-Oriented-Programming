package problem2;

public class Cat implements CanHavePizza {
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void eatPizza() {
		System.out.println("Cat is eating the pizza");
	}
}

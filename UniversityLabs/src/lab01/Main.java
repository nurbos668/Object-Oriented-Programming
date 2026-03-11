package lab01;

import lab01.problem05.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragonLaunch dragon2 = new DragonLaunch();
		
		dragon2.kidnap(new Person("Anna", 19, Gender.GIRL));
		dragon2.kidnap(new Person("Alex", 20, Gender.BOY));
		dragon2.kidnap(new Person("Kate", 21, Gender.GIRL));
		dragon2.kidnap(new Person("Bob", 22, Gender.BOY));
		System.out.println(dragon2.willDragonEatOrNot()); // 0
		
	}

}

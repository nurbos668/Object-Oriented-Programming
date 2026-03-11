package lab01.problem05;

import java.util.Vector;

import lab01.Gender;
import lab01.Person;

public class DragonLaunch {
	
	private Vector<Person> people;
	
	{
		people = new Vector<Person>();
	}
	
	public void kidnap(Person p) {
		people.add(p);
	}
	
	public String willDragonEatOrNot() {
		int count = 0;
		for(Person p : people) {
		    if(count > 0 && 
		       people.get(count-1).getGender() == Gender.BOY && 
		       p.getGender() == Gender.GIRL) {
		        count--;
		    } else {
		        people.set(count, p);
		        count++;
		    }
		}
		
		if(count > 0) {
		    return "The dragon will eat " + count + " people!";
		} else {
		    return "The dragon won't eat - everyone vanished!";
		}
	}
}

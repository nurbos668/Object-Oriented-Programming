package problem4;

import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee>, Cloneable {

	private double bonus;
	private Vector<Employee> team;
	
	
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
		team = new Vector<Employee>();
	}


	
	public double getBonus() {
		return bonus;
	}




	public void setBonus(double bonus) {
		this.bonus = bonus;
	}




	public Vector<Employee> getTeam() {
		return team;
	}




	public void setTeam(Vector<Employee> team) {
		this.team = team;
	}




	public void addEmployee(Employee emp) {
		team.add(emp);
	}
	
	public void deleteEmployee(Employee emp) {
		team.remove(emp);
	}

	@Override
	public String toString() {
		return "Manager [name=" + getName() + ", team=" + team + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bonus, team);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return Double.doubleToLongBits(bonus) == Double.doubleToLongBits(other.bonus)
				&& Objects.equals(team, other.team);
	}

	@Override
	public int compareTo(Employee o) {
		int res = super.compareTo(o);
		
		if (res == 0 && o instanceof Manager) {
			Manager otherManager = (Manager) o;
            res = Double.compare(this.bonus, otherManager.getBonus());
		}
		
		return res;
	}
	
	
	@Override
	public Manager clone() throws CloneNotSupportedException {
		Manager cloned = (Manager) super.clone();
		
		if (team != null) {
		    cloned.team = (Vector<Employee>) team.clone();
		}
		
		return cloned;
	}
	
}

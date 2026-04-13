package problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	
	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
	}


	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public String getInsuranceNumber() {
		return insuranceNumber;
	}


	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}


	@Override
	public String toString() {
		return "Employee [ " + super.toString() + " salary=" + salary + ", hireDate=" + hireDate + ", insuranceNumber=" + insuranceNumber + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(hireDate, insuranceNumber, salary);
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
		Employee other = (Employee) obj;
		return Objects.equals(hireDate, other.hireDate) && Objects.equals(insuranceNumber, other.insuranceNumber)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}


	@Override
	public int compareTo(Employee o) {
		return Double.compare(salary, o.getSalary());
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		
		if (hireDate != null) {
		    cloned.hireDate = (Date) hireDate.clone();
		}
		
		return cloned;
	}
	
	
}

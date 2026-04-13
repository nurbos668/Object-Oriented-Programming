package problem4;

import java.util.Comparator;

public class DateComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
	    if (e1.getHireDate() == null && e2.getHireDate() == null) return 0;
	    if (e1.getHireDate() == null) return -1;
	    if (e2.getHireDate() == null) return 1;
	    return e1.getHireDate().compareTo(e2.getHireDate()); // ✅
	}
	
}

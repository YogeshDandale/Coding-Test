package Camparator;

import java.util.Comparator;

public class BySortId  implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o1.getEid()-o2.getEid();
	}

	
	
	
}

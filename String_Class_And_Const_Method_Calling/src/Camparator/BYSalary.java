package Camparator;

import java.util.Comparator;

public class BYSalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEsalary().compareTo(o2.getEsalary());
	}

}

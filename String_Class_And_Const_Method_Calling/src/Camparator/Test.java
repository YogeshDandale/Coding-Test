package Camparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Test {

	
		public static void main(String[] args) {
			Employee e=new Employee();
			e.setEid(11);
			e.setEname("jaya");
			e.setEsalary(9844.555);
			
			Employee e1=new Employee();
			e1.setEid(10);
			e1.setEname("maya");
			e1.setEsalary(5544.555);
			
			Employee e2=new Employee();
			e2.setEid(22);
			e2.setEname("aya");
			e2.setEsalary(15544.555);
			
			
			Set<Employee>ss=null;
			System.out.println("--------Select-------\n"
					 +"1.Emplyee Id Short \n"
						+"2.Employee name sort\n"
							+"3.Employee salary ");
					
					System.out.println("Enter your choice");
					Scanner sc=new Scanner(System.in);
					
					int ch=sc.nextInt();
					if(ch==1)
					{
						ss=new TreeSet<Employee>(new BySortId());
					}
					if(ch==2)
					{
						ss=new TreeSet<Employee>(new ByName());
					}
					if(ch==3)
					{
						ss=new TreeSet<Employee>(new BYSalary());
					}
			ss.add(e);
			ss.add(e1);
			ss.add(e2);
			 
			
			for (Employee emp : ss) {
				System.out.println(emp.getEid());
				System.out.println(emp.getEname());
				System.out.println(emp.getEsalary());
			}
			
			
		}
	
}

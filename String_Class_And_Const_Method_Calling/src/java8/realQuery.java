package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.lang.model.element.Element;

public class realQuery {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
		//find the greatest salary of employe
		
			Optional<Employee> max = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
			System.out.println("Max Salary : "+max);
//		//find how many male and famale
			
			Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
			System.out.println("Employee Name :"+map);
//	
				//deptment print distinct
			
			employeeList.stream().map(Employee:: getDepartment).distinct().forEach(System.out::println);

			//What is the average age of male and female employees?
			
			Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
			System.out.println(collect);
	
			//Get the details of highest paid employee in the organization?
			
			String string = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).toString();
			System.out.println(string);
			
			//Get the names of all employees who have joined after 2015?
			
			 employeeList.stream().filter( e->e.getYearOfJoining() >2015).map(Employee::getName).forEach(System.out::println);;
			//System.out.println("Employee jioning after 2015:"+list);
			 
			 //Count the number of employees in each department?

			 Map<String, Long> map2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
			 
			 System.out.println(map2);
			 
			 //What is the average salary of each department?
			
			 Map<String, Double> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
			 System.out.println(collect2);
			 
			 
			 //Get the details of youngest male employee in the product development department?
			 
			 Optional<Employee> min = employeeList.stream().filter(e->e.getDepartment()=="Product Development" && e.getGender()=="Male" ).min(Comparator.comparing(Employee::getAge));
			 System.out.println(min);
			 
			 
			 //Who has the most working experience in the organization?
			 
			 Optional<Employee> findFirst = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
			 System.out.println(findFirst);
			 
			 //How many male and female employees are there in the sales and marketing team?
			 
			 Map<String, Long> collect3 = employeeList.stream().filter(e->e.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
			 System.out.println(collect3);
			 
			 //What is the average salary of male and female employees?
			 Map<String, Double> map3 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
			 System.out.println(map3);
			 
			 //Who is the oldest employee in the organization? What is his age and which department he belongs to?
			 Optional<String> map4 = employeeList.stream().max(Comparator.comparing(Employee::getAge)).map(Employee::getDepartment);
			 System.out.println(map4);
			 
			 //List down the names of all employees in each department?
			/// employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Employee::getName));
			 
			 

			 
	}
	
}

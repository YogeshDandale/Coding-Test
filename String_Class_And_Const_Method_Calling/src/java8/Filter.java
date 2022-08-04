package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		//filter even no
		List<Integer> list = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(list);
		
		//filter sorted no
		
	//	List<Integer>list2=l.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
//				System.out.println(list2);
//				for (Integer i : list2) {
//						System.out.println(i);	
//				}
		//count how many employee
//			long count = l.stream().count();
//			System.out.println(count);
//			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
//			
//		l.stream().distinct().forEach(System.out::println);
//			
	}
}

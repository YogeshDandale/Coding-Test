package LogicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortingArray {
	public static void main(String []args) {
		
		//int a[]= {1,7,8,6,11,28,10};
		
	
		//second aaproach
		Set<Integer>s=new TreeSet<>(Arrays.asList(2,8,7,6,5,8,5,4,2,1,2,3,4));
	
		s.stream().sorted().forEach(System.out::println);;
		//System.out.println(list);
		System.out.println(s);
		
	}

}

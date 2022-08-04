package java88;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class Predicat {

	public static void main(String[] args) {
		
//		Predicate<Integer>p=(t)->{
//			if(t%2==0) {
//				return true;
//			}else {
//				return false;
//			}
//		};
		Predicate<Integer>p=(t)-> t%2==0;  
		System.out.println(p.test(8));
		
		List<Integer>l=Arrays.asList(2,3,4,6);
		l.stream().filter(t-> t%2==0).forEach(t-> System.out.println("predicate :"+t));
	}
}

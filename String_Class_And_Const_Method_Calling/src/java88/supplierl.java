package java88;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class supplierl  {

//	public static void main(String[] args) {
//		Supplier<String >s=new supplierl();
//		System.out.println(s.get());
//	}
//
//	@Override
//	public String get() {
//	
//		return "Suplleir returm";
//	}
	public static void main(String[] args) {
//		Supplier<String >s=	()->{
//			return "Suplleir returm";	
//		};
//		System.out.println(s.get());
//		
//		
		List<String>l=Arrays.asList("a","b","c");
		System.out.println(l.stream().findAny().orElseGet(()->{
			return "Suplleir returm";	
		}));
	}
}

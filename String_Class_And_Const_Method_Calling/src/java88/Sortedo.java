package java88;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Sortedo {

	public static void main(String[] args) {
		
		List<Integer>l=Arrays.asList(7,8,3,2,3,4,6);
		l.stream().sorted().forEach(b->System.out.println(b));
		//l.stream().sorted((o1,o2)->o1.getdata()-o2.getdata()).forEach(System.out::println);
		
		
		
		
		Map<String,Integer >c=new HashMap<String,Integer >();
		c.put("sghdf",1);
		c.put("sghrdf",2 );
		c.put( "sdhb",6);
		c.put( "agesrhdd",54);
		
//		List<Entry<String, Integer>>e=new ArrayList<>(c.entrySet());
//			Collections.sort(e,new Comparator<Entry<String, Integer>>() {
//
//				@Override
//				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//					
//					return o1.getKey().compareTo(o2.getKey());
//				}
//			});
//			
//			for (Entry<String, Integer> entry : e) {
//				System.out.println(entry.getKey()+":"+entry.getValue());
//			}
		
		//second aprroach
		
//		List<Entry<String, Integer>>e=new ArrayList<>(c.entrySet());
//		Collections.sort(e,( o1,  o2)-> {return o1.getKey().compareTo(o2.getKey());});
//		
//		
//		for (Entry<String, Integer> entry : e) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		//third apo
		c.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		c.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	
	}
}

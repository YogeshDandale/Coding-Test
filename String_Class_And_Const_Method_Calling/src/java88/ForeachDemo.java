package java88;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachDemo {

	public static void main(String[] args) {
		List<String>l=Arrays.asList("afas","bafs","casv");
		
		l.stream().forEach(t->System.out.println(t));
		
		//map
		Map<Integer, Character>c=new HashMap<Integer, Character>();
		c.put(1, 'a');
		c.put(2, 'b');
		c.put(6, 'c');
		c.put(54, 'd');
		c.entrySet().stream().forEach(o->System.out.println(o));
		   
	}
}

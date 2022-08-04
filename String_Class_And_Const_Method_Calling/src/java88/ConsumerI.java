package java88;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerI {

	public static void main(String[] args) {
//		Consumer<Integer>c=(t)->{
//			System.out.println("Consumer: "+t);
//		};
//		c.accept(50);
		
		List<Integer>l=Arrays.asList(2,3,4,6);
		l.stream().forEach(t-> System.out.println("consumer :"+t));
	}
}

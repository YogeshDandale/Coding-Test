package LogicString;

import java.util.*;


public class A {

	public static void main(String[] args) {
		
		String s="RambhauPatilshobha";
		String s1 = "big black bug bit a big black a a dog on his big black nose";
				//char[] cs = s.toCharArray();
				String[] split = s1.split(" ");
				int count = 0;
				String rev="";
			Map<Character, Integer>m=new HashMap<Character, Integer>();
			for (int i = 0; i < split.length; i++) {
				
				count=1;
				for (int j = i+1; j < split.length; j++) {
					
					if(split[i].equals(split[j])) {
						count++;
						split[j] ="0";
					}
				}
				if(count>1 && split[i] !="0") {
					System.out.println(split[i]+":"+count);
				}
			}
			
			
		
	}
}
	

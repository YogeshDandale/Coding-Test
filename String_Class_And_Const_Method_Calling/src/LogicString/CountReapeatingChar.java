

package LogicString;


import java.util.HashMap;
import java.util.Set;

public class CountReapeatingChar 
{
	public static void main(String[] args)
	{
		
		String str = "abcabcaaad";

		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for (int i = 0; i <= str.length()- 1; i++) 
		{
			char c= str.charAt(i);   //b
			
			if (mp.containsKey(c)) 
			{
				mp.put(c, mp.get(c) + 1);
			} 
			else
			{
				mp.put(c, 1);
			}

		}
           Set<Character> keys = mp.keySet(); //[a, b, c, d]
		
		//print occurence of each char
		for (Character key : keys) 
		{	
			System.out.println(key +": "+ mp.get(key));
		}
		
		//print only duplicate element
		for (Character key : keys) 
		{
			if(mp.get(key)>1) {
				System.out.println(key +": "+ mp.get(key));
			}
		}
		
		System.out.println("a: "+ mp.get('a'));
		
	}

		
		
	}

			package LogicArray;

import java.util.Arrays;
import java.util.HashSet;

public class FindCommonNo {

	public static void main(String[] args)
    {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
 
        HashSet<String> set = new HashSet<String>();
 
        for (int i = 0; i < s1.length; i++)
        {
            for (int j = 0; j < s2.length; j++)
            {
                if(s1[i].equals(s2[j]))
                {
                    set.add(s1[i]);
                }
            }
        }
 	
        System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]
	
		//second Ex
	  Integer[] i1 = {1, 2, 3, 4, 5, 4};
 
        Integer[] i2 = {3, 4, 5, 6, 7, 4};
 
        HashSet<Integer> set1 = new HashSet<>();
 
        for (int i = 0; i < i1.length; i++)
        {
            for (int j = 0; j < i2.length; j++)
            {
                if(i1[i]==(i2[j]))
                {
                    set1.add(i1[i]);
                }
            }
        }
 
        System.out.println(set1);     
//Output : [3, 4, 
    }
}

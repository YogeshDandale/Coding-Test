package LogicString;

import java.util.HashMap;

  
public class findrepetatingcharactor
{    
	 public static void main(String[] args)
    {
		 
		 String s="adkmabssieabxb";
        //Creating a HashMap containing char as a key and occurrences as a value
         
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
         
        //Converting inputString to char array
         
        char[] strArray = s.toCharArray();
         
        //Checking each char of strArray
         
        for (char c : strArray)
        {
            if(map.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
                 
                map.put(c, map.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //adding this char in charCountMap with 1 as it's value
                 
                map.put(c, 1);
            }
        }
         
        //checking for first non-repeated character
         
        for (char c : strArray)
        {
            if (map.get(c) == 1)
            {
                System.out.println("First Non-Repeated Character In '"+s+"' is '"+c+"'");
                 
                break;
            }
        }
         
        //checking for first repeated character
         
        for (char c : strArray)
        {
            if (map.get(c) > 1)
            {
            	
                System.out.println("First Repeated Character In '"+s+"' is '"+c+"' :"+map.get(c));
                 
                
            }
        }
    }
     
   
   
}
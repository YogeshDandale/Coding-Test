package LogicString;

import java.util.Iterator;

public class FindWhiteSpace {

	public static void main(String[] args) {
		
		String str="acd d d d f";
		int count =0;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c==' ')
			{
				count++;
			}
		}
		System.out.println("White Space :"+count);
	}
}

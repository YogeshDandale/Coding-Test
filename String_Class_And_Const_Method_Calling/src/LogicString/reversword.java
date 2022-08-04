package LogicString;
public class reversword{
	
	public static void main(String[] args) 
	{
		
		String str="Wellcome To Cjc";  //origanal string

		String[] word=str.split(" "); //spit into word
		
		String revString="";
		
		
		
		for (String w:word)
		{
		String revword="";
			for (int i = w.length() -1; i >=0; i--)
				{
			revword=revword+w.charAt(i);
				}
			revString=revString+revword+" ";
			
		}
				System.out.print(revString);
	}
}

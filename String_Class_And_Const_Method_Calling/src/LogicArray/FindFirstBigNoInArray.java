package LogicArray;

public class FindFirstBigNoInArray {

	public static void main(String[] args) {
		
int n[]= {10,20,50,30,99};
		
		
		int large=n[0];
		System.out.println(n[0]);
		System.out.println(n[1]);
		int small=n[0];
		int secondlarge=n[1];
		
		for(int i=0;i<n.length;i++)
		{
			
			
			if(n[i]>large)
			{
				System.out.println("int"+n[i]);
				secondlarge=large;
				large=n[i];
			}
			else if(n[i]<small)
			{
				small=n[i];
			}
		}
	
		System.out.println(small);
		System.out.println(large);
		System.out.println(secondlarge);
		
	}
}

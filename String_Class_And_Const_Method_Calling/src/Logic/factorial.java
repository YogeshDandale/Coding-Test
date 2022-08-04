package Logic;

public class factorial
{
	public static void main(String[] args) {
		
		int num=4;
		int fac=1;
		for(int i=num;i>=1;i--)
		{
			fac=fac*i;
		}
		
		System.out.println(fac);
	}

}

package Try;

public class tryfinallyreturn {

	public int m1()
	{
	try
	{

	int x=30;
	int z=10/0;
	System.out.println("Try Star");
	return x;
	}
	catch (Exception e) {
		int x=60;
		return x;
		
	}
//	finally
//	{
//	int x=50;
//	System.out.println("catch Star"+x);
//	return x;
//	}
	}
	public static void main(String args[])
	{
	System.out.println("Main Star");
	tryfinallyreturn d=new tryfinallyreturn();
	int x=d.m1();
	System.out.println(x);
	}

}

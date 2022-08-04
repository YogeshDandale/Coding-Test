package ExceptionHierachi.inheritance;

public class B extends A
 {
	
	public void m1( String s)
	{
		System.out.println("hii");
	}
public void m22(Object a )	{
		
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
		
		A b=new B();
		//b.m1(null );
		b.m22(null);
	}
 }

package ConstMathodCalling;

public class B  extends A{
	String s1;
	String s2;
	char c;
	
	public B( String s1)
	 {
	this("sui",'a');
		System.out.println("String b");
	}
	public B(String s2, char y) 
	{
		super(10,20);
		System.out.println("s c");
	}
	public void m2()
	{
		m3();
		System.out.println("bm2");
	}
	public void m3()
	{
	
		System.out.println("bm3");
	}

}
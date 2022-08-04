package ConstMathodCalling;

public class C extends B {
	
	long l1;
	long l2;
	
	public C(long l1,long l2)
	 {
		super("fgh");
	
		System.out.println(" l l");
	}
	public void m4()
	{
		m5();
		System.out.println("cm4");
	}
	public void m5()
	{
		m6();
		System.out.println("cm6");
	}
	public void m6()
	{
		this.m2();
		System.out.println("cm6");
	}
	

}


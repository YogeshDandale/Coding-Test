package ConstructorMethod;

public class C extends B {

	long l1;
	long l2;
	
	public C(long l1,long l2)
	{
		super("AAAAAD",'s');
		System.out.println(" C const");
	}
	public void n4()
	{
		this.n5();
		System.out.println("n4 c");
	}
	public void n5()
	{
		this.n6();
		System.out.println("n5 c");
	}
	public void n6()
	{
		System.out.println("n6 c");
	}
	
	public static void main(String[] args) {
		C c=new C(1456l,64565l);
		
		c.n4();
		
	}
	
}

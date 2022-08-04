package Const_M_calling;

public class C extends B {
	

	
	public C(String s)
	 {
		
		
		this.m2(455);
		System.out.println(s);
	}
	public C(long l)
	 {
		super(10.5f);
		System.out.println(l);
	}
	public void m2(int z)
	{
		B b=new B();
		System.out.println(z);
	}

	

}


package ConstructorMethod;

public class B extends A {
	String s1;
	String s2;
	char c;
	
	public B(String s2 ,char c)
	{
		this.n2();
		this.n3();
		this.s2=s2;
		this.c=c;
	}
	public void n2()
	{
		System.out.println("n2 B");
	}
	public void n3()
	{
		System.out.println("n3..B");
	}
	public B()
	{
		
	}
	
}

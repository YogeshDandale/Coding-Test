package ConstructorMethod;

public class A {

	int  x;
	int y;
	
	public A()
	{
		this(10,10);
		System.out.println("Const A");
		
	}
	public A(int x,int y)
	{
		this.n1();
		this.x=x;
		this.y=y;
		System.out.println(" int A int A");
		
	}
	public void n1()
	{
		System.out.println("N1 A");
	}
}

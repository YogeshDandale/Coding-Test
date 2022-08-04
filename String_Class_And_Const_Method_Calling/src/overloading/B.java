package overloading;

import java.io.IOException;

public class B extends A
 {
	
	
public String m22( ) 	{
		
		System.out.println("Hello");
		
		return "hi b";
	}
	
	
	public static void main(String[] args)  {
		
		A b=new B();
		
		b.m22();
	}
 }

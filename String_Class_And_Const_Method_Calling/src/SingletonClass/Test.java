package SingletonClass;

public class Test {
	  private  static Test t=new Test();
	  private Test()
	  {
		  
	  }
	  public static Test getTest()
	  {
		  return t;
	  }
	  public static void main(String[] args) {
		
		  Test t1=Test.getTest();
		  Test t2=Test.getTest();
		  System.out.println(t.toString());
		  System.out.println(t1.toString());
		  System.out.println(t2.toString());
	}
	
}

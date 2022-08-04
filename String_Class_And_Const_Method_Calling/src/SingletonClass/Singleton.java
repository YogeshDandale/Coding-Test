package SingletonClass;

public class Singleton implements Cloneable{
	
	private  static Singleton a=new Singleton();
	private Singleton() {
		
	}
	public static Singleton getB() {
		return a;
	}
	@Override
	protected Singleton clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return a;
	}


}

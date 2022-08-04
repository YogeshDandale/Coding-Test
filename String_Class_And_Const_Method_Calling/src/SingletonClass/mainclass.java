package SingletonClass;

public class mainclass {
	
	public  static void main (String [] args) throws CloneNotSupportedException {
		
		Singleton a1=Singleton.getB();
		Singleton a2=Singleton.getB();
		System.out.println(a1.toString());
		System.out.println(a1.toString());

		Singleton b = (Singleton)Singleton.getB().clone();
		System.out.println(b);
	}

}

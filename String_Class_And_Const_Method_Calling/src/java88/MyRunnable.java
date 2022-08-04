package java88;

public class MyRunnable {

	public static void main(String[] args) {
		
		Runnable r=()-> {
			System.out.println("Susp");
		};
		r.run();
		}
	}


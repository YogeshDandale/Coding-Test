package Logic;

public class A {
	public static void main(String[] args) {
		

		int a=100;
		int b=1;
		int c=0;
	
		for (int i = 1; i < a; i++) {
			boolean is=true;
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					is=false;
					break;
				}
			}
			if(is) {
				System.out.println(i);
			}
		}
		
		System.out.println(c);
		
	}
}

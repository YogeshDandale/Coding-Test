package LogicString;

public class Palledromm {

	public static void main(String[] args) {
		
		String s="aba";
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("it is pallodram");
		}else {
			System.out.println("it is not pallodram");
		}
	}
}

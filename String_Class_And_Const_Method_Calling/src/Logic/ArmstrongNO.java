package Logic;

public class ArmstrongNO {

	public static void main(String[] args) {
		
	int a=153;
	int sum=0;
	for (int i = a; i >0; i=i/10) {
		
		int rem=i%10;
		sum=sum+(rem*rem*rem);
	}
	
	if(a==sum) {
		System.out.println("Armstrong no"+sum);	
	}
	
	}
}

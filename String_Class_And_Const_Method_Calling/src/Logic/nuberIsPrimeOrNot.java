package Logic;

import java.util.Scanner;

public class nuberIsPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No:");
		int n=sc.nextInt();
		int count =0;
		
		if(n>1) {
			
			for (int i = 1; i <=n; i++)
			{
				if(n%i==0) {
					count++;
				}
				
				
			}
			if(count==2) {
				System.out.println(n+" : Is Primary No");
			}
			else {
				System.out.println(n+": Is not Primary No");
			}
		}
	}
}

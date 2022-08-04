package Logic;

public class PrintFrimeNO {

	public static void main(String[] args) {

		int a = 100;
		
		 for (int i=1; i < a; i++)
		 {
		  boolean isPrime = true;
		  //check to see if the number is prime
		  for (int j=2; j < i ; j++)
		 {
		  if (i % j == 0)
		 {
		  isPrime = false;
		  break;
		 }
		 }
		  // print the number
		  if (isPrime)
		  System.out.print (i + " ");
		 }
		 }
		 }
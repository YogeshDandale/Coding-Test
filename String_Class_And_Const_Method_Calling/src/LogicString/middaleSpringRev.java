package LogicString;

public class middaleSpringRev {
	
		public static void main(String[] args) {
			

			String str = "abc xyz abc1 xyz1"; 

			String[] ar = str.split(" "); //[abc xyz abc1 xyz1]

			for (int i = 0; i <= ar.length - 1; i++) 
			{
						  
				if (i % 2 != 0)
				{
					String s1 = ar[i];  //abc
					ar[i] = reverseString(s1);   //re initialization of string info for even index
				
				}

			}
			
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i]+" ");
			}
			
		}

		public static String reverseString(String inp) {
			String rev = "";
			for (int i = inp.length() - 1; i >= 0; i--) {
		      		rev = rev + inp.charAt(i);
			}
			return rev;
		}
	}



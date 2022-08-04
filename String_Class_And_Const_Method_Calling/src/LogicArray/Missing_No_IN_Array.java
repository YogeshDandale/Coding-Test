package LogicArray;

public class Missing_No_IN_Array {

	public static void main(String[] args) {
		int ar[] = {7, 2, 1, 5, 7, 3 };

		for (int i = 0; i < ar.length-1 ; i++) 
		{
			for (int j = ar[i] + 1; j < ar[i + 1]; j++) 
			{
				System.out.println(j);
			}
		}
	}

}

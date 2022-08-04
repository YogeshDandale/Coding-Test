package LogicString;

public class removeSpecialCharactor {

	public static void main(String[] args) {
		
		String s="ascff@!@&*~efijg";
		String all = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(all);
	}
}

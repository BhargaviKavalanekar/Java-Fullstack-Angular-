package String;

public class Insert_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("It is used to  at the specified index location");
		
		str.insert(14, "Insert text");
		
		System.out.println(str.toString());

	}

}

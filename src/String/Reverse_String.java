package String;

public class Reverse_String {

	public static void main(String[] args) {
		
		StringBuffer b = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println("Original String:-"+b);
		b.reverse();
		System.out.println("Reversed String:-"+b);

	}

}

package String;

public class Reverse_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder b = new StringBuilder("This method returns the reversed object on which it was called");
		
		System.out.println("Original String:-" +b.toString());
		
		b.reverse();
		
		//StringBuilder revstr=str.reverse();
		//System.out.println("Reversed String:-" revstr.toString());
		
		System.out.println("Reversed String:-" +b.toString());
	}

}

package String;

public class Q3_Operations {

	public static void main(String[] args) {
		
		String s= new String("Java String refers to collection of String which is stored in heap memory.");
		String s1= new String("java String refers to collection of String which is stored in heap memory.");
		
		System.out.println(s.toLowerCase()); //Converted string to lowercase
		
		System.out.println(s.toUpperCase());//Converted string to Uppercase
		
		//Replace 'a' with '$'
		System.out.println(s.replace('a','$'));
		
		//Check the string for word 'collection'
		if( s.contains("collection")) {
			
			System.out.println("String contains the word collection");
			
		}
		else {
			
			System.out.println("String does not contain the given word ");
			
		}
		
		//Check whether the two strings s and s1 are equal
		
		if(s.equals(s1)) {
			
			System.out.println("Strings s and s1 are equal ");
			
		}
		else {

			System.out.println("Strings s and s1 are not equal ");
			
		}
		
		//Check whether the two strings s and s1 are equal (ignore the case)
		
		if(s.equalsIgnoreCase(s1)) {
					
			System.out.println("Strings s and s1 are equal ");
					
		}
		else {

			System.out.println("Strings s and s1 are not equal ");
					
		}
		
		//Check whether the two strings s and s1 are equal (ignore the case)
		
		if(s.compareTo(s1)==1) {
							
			System.out.println("Strings s and s1 are equal ");
							
		}
		else {

			System.out.println("Strings s and s1 are not equal ");
							
		}
	

	}

}

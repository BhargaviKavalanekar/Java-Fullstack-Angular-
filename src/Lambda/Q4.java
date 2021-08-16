package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		
		List<String> name=new ArrayList<>();
		name.add("Bhargavi");
		name.add("Roose");
		name.add("Pooja");
	
		System.out.println("Before "+name);
		name.removeIf(P -> (P.length()%2==1));
		System.out.println("After : "+name);

	}

}

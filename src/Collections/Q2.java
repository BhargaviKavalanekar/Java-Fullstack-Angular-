package Collections;

import java.util.Set;
import java.util.TreeSet;

public class Q2 {

	public static void main(String[] args) {
		
		Set<String> p=new TreeSet<>();
		
		p.add("Red");
		p.add("Blue");
		p.add("Dark blue");
		p.add("Yellow");
		p.add("Black");
		p.add("wine");
		p.add("Green");
		p.add("White");
		p.add("Orange");
		p.add("Pink");
		
		p.add("Pink");        //trying to add duplicate value but cannot add as it is a set
		System.out.println(p);

	}

}

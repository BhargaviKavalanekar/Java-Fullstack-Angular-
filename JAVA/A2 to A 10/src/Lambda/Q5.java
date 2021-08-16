package Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Q5 {

	public static void main(String[] args) {
		
		//First letter of each word is printed
		List<String> name=new ArrayList<>();
		name.add("Bhargavi");
		name.add("Roose");
		name.add("Pooja");
		
		StringBuffer  b=new StringBuffer("");
		Consumer<List<String>> modify= list -> {
			Iterator<String> it=list.iterator();
			while(it.hasNext()) {
				String str=it.next();
				b.append(str.charAt(0));
			}	
		};
		
		modify.accept(name);
		
		System.out.println(b);
	}

}

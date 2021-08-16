package Lambda;

import java.util.HashMap;
import java.util.Map;

public class Q7 {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<Integer,String>();  
		  m.put(1,"Bhargavi");  
		  m.put(2,"Sameep");  
		  m.put(3,"Kavalanekar"); 
		  
		  System.out.println(m);
		  
		  StringBuilder b=new StringBuilder("");
		  
		  for(Map.Entry c:m.entrySet()) {
			  
			  b.append(c.getKey());
			  b.append(c.getValue());
		  }
		  System.out.println(b);

	}

}

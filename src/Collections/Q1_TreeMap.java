package Collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

import Collections.Contact.gender;

public class Q1_TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Long,Contact> list=new TreeMap<>(Collections.reverseOrder());
		
		gender g1=gender.male;
		gender g2=gender.female;
		
		list.put((long) 20012000,new Contact("Bhargavi","bhargavi.kavalanekar.com",g2));
		list.put((long) 12715678,new Contact("Anshu","anshu@gmail.com",g1));
		list.put((long) 21238444,new Contact("Prajakta","pk@gmail.com",g2));
		
           
		Set<Long> keys = list.keySet();
        
        System.out.println("Printing all keys of TreeMap");
        
        //Using foreach loops
        for(Long key : keys){
            System.out.println( key );
        }
        System.out.println("Printing all values of TreeMap");
        for(Long value:list.keySet())
        {
        	System.out.println(list.get(value));
        }
        System.out.println("Printing all pairs");
        
        System.out.println(list);


	}

}

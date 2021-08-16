package Collections;

import java.util.LinkedList;

public class Q4_Date {

	public static void main(String[] args) {
		
		
		LinkedList<date> list=new LinkedList<>();
		list.add(new date(23,12,2000));// a) to check it is a leap year
		
		
        
		System.out.println("Your date of birth is "+date.getMonth()+"-"+date.getDay()+"-"+date.getYear());
		
		{
		if(date.getYear()%4==0)
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
		}
          
		list.add(new date(23,12,2001));  // b) to check it is not a leap year
		System.out.println("Your date of birth is "+date.getMonth()+"-"+date.getDay()+"-"+date.getYear()); 
		
		{
		if(date.getYear()%4==0)
		{
			System.out.println("It was a leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
		}
		

	}

}

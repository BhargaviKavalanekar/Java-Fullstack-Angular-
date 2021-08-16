package Lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String> {
	   public String apply(String str) {
	      return str.toLowerCase();
	   }
	}
	public class Q6 {

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int n = 5;

			// Declaring the ArrayList with
			// initial size n
			ArrayList<String> a= new ArrayList<String>(n);

			a.add("BK");
	       	a.add("ROO");
	        a.add("SONALI");
	     	a.add("RIYA");
	        a.add("POOJA");
	      	
	      	System.out.println(a);
	  		a.replaceAll((UnaryOperator<String>) new Op());
			
	       
			for (int i = 0; i < a.size(); i++)
				System.out.print(a.get(i) + " ");
		}
		
	}

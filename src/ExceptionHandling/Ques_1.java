package ExceptionHandling;

import java.util.Scanner;

public class Ques_1 {

	public static void main(String[] args) {
		
				try {
					
					int a,b,c;
					
					Scanner s=new Scanner(System.in);
					
					System.out.println("Enter the 1st number: ");
					a=s.nextInt();
					
					System.out.println("Enter the 2nd number: ");  // If we take second number as 0 then it is runtime exception
					b=s.nextInt();
					
					c=a/b;
					
					System.out.println("Result is : "+c);
					c=s.nextInt();
				
					
				}
				catch(ArithmeticException e)
				{
					System.out.println("Value of denominator cannot be zero ");
					e.printStackTrace();
				}
				
				System.out.println("This is runtime exception ");

			}

	}


import java.util.Scanner;

public class SimpleAndCompound {

	public static void main(String[] args) {
		
		 float a;
         double t;
         float r;
         double simpleinterest,compoundinterest;
         
         
         Scanner c=new Scanner(System.in);
         System.out.println("Enter the value of p");
         a=c.nextFloat();
         System.out.println("Enter the value of r");
         r=c.nextFloat();
         System.out.println("Enter the value of t");
         t=c.nextDouble();
         
         simpleinterest=(a*t*r)/100;
         System.out.println("The simple interest is" + simpleinterest);
         
         compoundinterest=a*Math.pow(1.0+r/100.0,t)-a;
         System.out.println("The compound interest is"+ compoundinterest);
	}

}

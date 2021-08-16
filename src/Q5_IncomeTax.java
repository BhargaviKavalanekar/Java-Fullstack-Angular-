import java.util.Scanner;

public class Q5_IncomeTax {

	public static void main(String[] args) {
		
		// Income tax
		 double CTC,tax_amt;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the income");
         CTC=s.nextDouble();
         if(CTC>0 && CTC <180000)
         {
         	tax_amt=0;
         	System.out.println("The tax amount is"+ tax_amt);
         }
         else if(CTC>181001 && CTC<=300000)
         {
         	tax_amt=0.1*CTC;
         	System.out.println("The tax amount is"+ tax_amt);
         }
         else if(CTC>300001 && CTC<=500000)
         {
         	tax_amt=0.2*CTC;
         	System.out.println("The tax amount is"+ tax_amt);
         }
         else if(CTC>500001 && CTC<=1000000)
         {
         	tax_amt=0.3*CTC;
         	System.out.println("The tax amount is"+ tax_amt);
         }
         else {
         	System.out.println("Not valid");
         }

	}

}

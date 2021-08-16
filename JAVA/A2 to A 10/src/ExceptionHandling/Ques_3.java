package ExceptionHandling;

import java.util.Scanner;

class InsufficientBalaceException extends Exception{
	
}
class IllegalBankTranscationException extends Exception{
	
	}

public class Ques_3 {

	public static void main(String[] args) {
		
		Savings sav=new Savings();
		double amt;
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the withdraw amount: ");
		str=s.next();
		System.out.println("Enter Amount : ");
		amt=s.nextInt();
		if(str.equals("deposit")) {
			sav.deposit(amt);
		}
		else if(str.equals("withdraw")) {
			sav.withdraw(amt);
		}
		else {
			System.out.println("Choose correct option");
		}
		
	}

}
class Savings{
	double balance=2500;
	void deposit(double amt) {
		balance+=amt;
		System.out.println("Amount Added Successfully!!");
		System.out.println("Balance : "+balance);
		
	}
	void withdraw(double amt) {
		try {
			if(amt>balance) {
				throw new InsufficientBalaceException();
				
			}
			else if(amt<0) {
				throw new IllegalBankTranscationException();
			}
			else {
				balance-=amt;
				System.out.println("Transaction Successfull!!");
				System.out.println("Balance : "+balance);
			}
		}
		catch(InsufficientBalaceException ie) {
			System.out.println("No Sufficient Balance!!");
			
		}
		catch(IllegalBankTranscationException ile) {
			System.out.println("Not a Valid Amount!");			
		}
		
		
	}
	
}

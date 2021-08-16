import java.util.Scanner;

class bank{
	public int amount(int amt) {
		return 0;
	}
}
class Savings extends bank{
	int amt;
	
	public int amount(int amt){
		
		this.amt=amt;
		return amt;
	}
}
class Current extends bank{
	int amt;
	public int amount(int amt) {
		this.amt=amt;
		return amt;
	}
}

public class Question3 {
  public static void main(String args[]){
	  Savings s=new Savings();
	  Current c=new Current();
	  
	  Scanner sc=new Scanner(System.in);
	  int savings=sc.nextInt();
	  int current=sc.nextInt();
	  
	  int sum=s.amount(savings)+c.amount(current);

	  System.out.println("Total amount of cash in the bank is :"+sum);
  }
}
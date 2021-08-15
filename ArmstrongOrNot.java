import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :  ");
        num = sc.nextInt();
        
		int rem=0;
		int c=0;
		int d=num;
		
		
		while(num>0) {
			rem=num%10;
			c=c+(rem*rem*rem);
			num=num/10;
		
			
		}
		
		if(d==c) {
		
		System.out.println("the number is Armstrong");
		}
		else {
			System.out.println("the number is not Armstrong");
					}

	}

}

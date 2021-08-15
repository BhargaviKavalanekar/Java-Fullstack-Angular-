import java.util.Scanner;

public class ArmstrongNo_Range {

	public static void main(String[] args) {
		int n, a, b, i, rem, temp, count=0;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the starting range :  ");
        a = sc.nextInt();
        System.out.print("Enter the last number:  ");
        b = sc.nextInt();
		
       
        for(i=a+1; i<b; i++)
        {
            temp = i;
            n = 0;
            while(temp != 0)
            {
                rem = temp%10;
                n = n + rem*rem*rem; // 1^3+5^3+3^3
                temp = temp/10;
            }
            if(i == n)
            {
                if(count == 0)
                {
                    System.out.print("Armstrong Numbers Between the Given Interval are : \n");
                }
                System.out.print(i + "  ");
                count++;
            }
        }
        if(count == 0)
        {
            System.out.print("Armstrong Number not Found between the Given Interval.");
        }

	}

}

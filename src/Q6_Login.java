import java.util.Scanner;

public class Q6_Login {

	public static void main(String[] args) {
		
		int attempts=0;
		String username="Bhargavi";
		String password="bk999";
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter your username:");
			String u=scan.next();
			System.out.println("Enter your Password:");
			String p=scan.next();
			
			if(username.equals(u) && password.equals(p)) {
				System.out.println("WELCOME...!");
				break;
			}
			else {
				attempts++;
				System.out.println("Please enter correct username and password");
				System.out.println("Number of attempts left:"+(3-attempts));
			}
			if(attempts==3) {
				System.out.println("Please contact your Admin...");
				break;
			}
		}
            
	}

}

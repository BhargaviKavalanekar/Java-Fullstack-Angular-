package Lambda;

interface FunctionalInterface{
	public int perform(int a,int b);
	}
public class Q1_Arithmetic {

	public static void main(String[] args) {
		
		//Addition Operation
		
		FunctionalInterface a1=(a,b)->(a+b);
		System.out.println("Addition is "+a1.perform(100, 200));
		
		//Subtraction Operation
		FunctionalInterface s=(a,b)->(a-b);
		System.out.println("Subtraction is "+s.perform(200, 10));
		
		//Multiplication operation
		FunctionalInterface m=(a,b)->(a*b);
		System.out.println("Multiplication is "+m.perform(5, 10));
		
		//Division opeartion
		FunctionalInterface d=(a,b)->(a/b);
		System.out.println("Division is "+d.perform(20, 5));

	}

}
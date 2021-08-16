abstract class A      //abstract cannot be final so making it final will give u an error
{
	 abstract void show();
}

abstract class B extends A
{
     public void show()
	{
		System.out.println("hi");
	}
}
class C extends A
{
    void show() {              // method overriding 
	System.out.println("hello");
	}
}
public class Question4 {

	public static void main(String[] args) {
		
           C obj=new C();
           obj.show();
	}
}

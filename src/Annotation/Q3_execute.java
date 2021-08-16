package Annotation;

import java.lang.reflect.Method;

@interface Execute
{
	int Sequence();
}

class Annotation
{
	@Execute(Sequence=2)
	public void method1()
	{
		System.out.println("Method : 1");
	}
	
	@Execute(Sequence=1)
	public void method2()
	{
		System.out.println("Method : 2");
	}
	
	@Execute(Sequence=3)
	public void method3()
	{
		System.out.println("Method : 3");
	}
}


public class Q3_execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Annotation a= new Annotation();
		Method[] m= a.getClass().getMethods();
		
		for (Method method: m)
		{
			Execute e= method.getAnnotation(Execute.class);
			
			if (e!=null)
			{
				try
				{
					method.invoke(a);
					System.out.println(e);
				}
				
				catch(Exception x)
				{
					x.printStackTrace();
				}
			}
		}

	}

}

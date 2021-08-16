package Annotation;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface Test{
	String b();}
class G{
	@Test (b= "G method")
	public void good() {
		System.out.println("Good Evening" );
	}
}

public class Q1_Test {

	public static void main(String[] args) {
		G obj=new G();
		obj.good();
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(Test.class);
		Test t=(Test)an;
		System.out.println(t.b());
		}
	}



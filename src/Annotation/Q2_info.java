package Annotation;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface info{
	int AuthorID();
	String Author();
	String Supervisor();
	String Date();
	String Time();
	int Version();
	String Description();
	
}
@info(
		AuthorID=123,
		Author="Bhargavi",
		Supervisor="Riya",
		Date="10-12-2020",
		Time="17:00",
		Version=6,
		Description="Excellent")
class information
{
	int AuthorID;
	String Author;
	String Supervisor;
	String Date;
	String Time;
	int Version;
	String Description;
	public information(int AuthorID,String Author,String Supervisor,String Date,String Time,int Version,String Description)
	{
		this.AuthorID=AuthorID;
		this.Author=Author;
		this.Supervisor=Supervisor;
		this.Date=Date;
		this.Time=Time;
		this.Version=Version;
		this.Description=Description;
	}
}
public class Q2_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		information obj=new information(0, null, null, null, null, 0, null);
		Class c=obj.getClass();
		Annotation an=c.getAnnotation(info.class);
		info i=(info)an;
		System.out.println("AuthorId : "+i.AuthorID());
		System.out.println("Author : "+i.Author());
		System.out.println("Supervisor : "+i.Supervisor());
		System.out.println("Date : "+i.Date());
		System.out.println("Time : "+i.Time());
		System.out.println("Version : "+i.Version());
		System.out.println("Description : "+i.Description());

	}

}

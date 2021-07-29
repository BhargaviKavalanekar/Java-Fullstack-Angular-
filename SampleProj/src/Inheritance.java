import java.beans.Statement;
import java.util.Scanner;

class Person{
	
	String name;
	Scanner scan=new Scanner(System.in);
	
	public void acceptDetails() {
		System.out.println("Enter the name");
		name=scan.next();
		
	}
	public void displayDetails() {
		System.out.println("Name: "+name);
		}
}

class Employee extends Person{
	
	int eid;
	
	public void acceptEmpDetails() {
		System.out.println("Enter Emp  id");
		eid=scan.nextInt();
		
	}
	public void displayEmpDetails() {
		System.out.println("Eid: "+eid);
		
	}
}
class Student extends Person{
	
    int sid;
	
	public void acceptStudentDetails() {
		System.out.println("Enter Student id");
		sid=scan.nextInt();
		
	}
	public void displayStudentDetails() {
		System.out.println("Sid: "+sid);
		
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.acceptDetails();
		e.acceptEmpDetails();
		e.displayDetails();
		e.displayEmpDetails();
		
		
		Student s=new Student();
		s.acceptDetails();
		s.acceptStudentDetails();
		s.displayDetails();
		s.displayStudentDetails();

	}

}

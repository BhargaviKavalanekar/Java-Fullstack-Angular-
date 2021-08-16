package Collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class Employee implements Comparable<Employee>{
	private int empid;
	private String empname;
	private String empdept;
	private int empsalary;
	public Employee(int empid, String empname, String empdept, int empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.empsalary = empsalary;
	}
	
	public int getempId() {
		return empid;
	}

	public String getempName() {
		return empname;
	}

	public String getempDept() {
		return empdept;
	}

	public int getempSalary() {
		return empsalary;
	}

	@Override
	public String toString() {
		return "\nEmployee Id=" + empid + ",\nEmployee Name=" + empname + ", "
        		+ "\nEmployee Salary=" + empdept + ","
        				+ "\nEmployee Department=" + empsalary + "\n ";
	}

	@Override
	public int compareTo(Employee e) {
		int r= this.empid-e.empid;
		if(r==0) {
			r= this.empname.compareTo(e.empname);
		}
		if(r==0)
			r= this.empdept.compareTo(e.empdept);
		if(r==0)
			r= this.empsalary-e.empsalary;
		return r;
	}
}

class IdComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getempId()-e2.getempId();
	}
	
}

class NameComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int r= e1.getempName().compareTo(e2.getempName());
		if(r==0)
			r= e1.getempId()-e2.getempId();
		return r;
	}
	
}

class DeptComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int r= e1.getempDept().compareTo(e2.getempDept());
		if(r==0)
			r= e1.getempId()-e2.getempId();
		return r;
	}
	
}

class SalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		int r= e1.getempSalary()-e2.getempSalary();
		if(r==0)
			r= e1.getempId()-e2.getempId();
		return r;
	}
	
}

public class Q3_Treeset {

	public static void main(String[] args) {
		
		Set<Employee> employees;
		Scanner sc= new Scanner(System.in);
		System.out.println("a) ID\nb) Name\nc) Department\nd) Salary");
		System.out.println("Enter your choice");
		String c= sc.next();
		
		if(c.compareTo("a")==0)
			employees= new TreeSet<>(new IdComparator());
		else if(c.compareTo("b")==0)
			employees= new TreeSet<>(new NameComparator());
		else if(c.compareTo("c")==0)
			employees= new TreeSet<>(new DeptComparator());
		else if(c.compareTo("d")==0)
			employees= new TreeSet<>(new SalaryComparator());
		else {
			System.out.println("Invalid Option\n");
			employees= new TreeSet<>();
		}
		
		employees.add(new Employee(1, "Karan","System testing",70000));
        employees.add(new Employee(4, "Pooja","Business",56000));
        employees.add(new Employee(3, "lima","IT",90000));
        employees.add(new Employee(2, "Chandani","Business",97760));
        employees.add(new Employee(4, "Amitava","SDE",78000));
		
		for(Employee e: employees)
			System.out.println(e);
		sc.close();

}
}
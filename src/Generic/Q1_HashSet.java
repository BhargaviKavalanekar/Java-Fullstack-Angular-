package Generic;

import java.util.HashSet;
import java.util.Set;


public class Q1_HashSet {

	public static void main(String[] args) {
		
		Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Bhargavi", 750000,"SDE"));
        employees.add(new Employee(2, "Jennie",49000,"Business"));
        employees.add(new Employee(3, "Lisa",700000,"CS"));
        employees.add(new Employee(4, "Rose",19200,"Health"));
        employees.add(new Employee(4, "Jung",435678,"IT"));
        
        System.out.println(employees);
    	

	}
}




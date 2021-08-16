package Generic;

public class Employee {
	
	    private int empId;
	    private String empName;
	    private int empSalary;
	    private String empDept;
	    
	    public Employee(int empId, String empName, int empSalary, String empDept) {  //Constructors using field
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
			this.empDept = empDept;
		}
	    
		public int getEmpId() {   // getter and setter
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(int empSalary) {
			this.empSalary = empSalary;
		}
		public String getEmpDept() {
			return empDept;
		}
		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}

		
		@Override //to string 
	    public String toString() { return "Q1_Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept="
		  + empDept + "]"; }
		
		 public int hashCode() {
		        return this.empId;
		    }

		  
		public boolean equals(Object obj) {
		 Employee employee = (Employee) obj;
		 
		   if (employee.empId == this.empId) {
			   
		         employee.setEmpName(this.empName);
		         return true;
		 } else {
		            return false;
		        }
		    }
		
		public void displayDetails() {
        	System.out.println("This is employee");
    	}

		  

}

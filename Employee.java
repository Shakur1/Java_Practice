package Practice;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	 // This is the constructor of the class Employee
	public Employee(String name){
		this.name=name;
		
	}
	// Assign the age of the Employee  to the variable age.
	public void empAge(int empAge){
		age=empAge;
		
	}
	
	 /* Assign the designation to the variable designation.*/
	public void designation(String empDesig){
		designation=empDesig;
	}
	
	 /* Assign the salary to the variable	salary.*/
	public void empSalary(double empSalary){
		salary=empSalary;
	}
	
	 /* Print the Employee details */
	public void employeeDetail(){
		System.out.println("Employee age is: "+age);
		System.out.println("Employee name is :" + name);
		System.out.println("Employee designation is :" + designation);
		System.out.println("Employee salary is :" + salary);
		
	}

}

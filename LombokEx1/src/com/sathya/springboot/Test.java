package com.sathya.springboot;

public class Test {

	public static void main(String[] args) {
		// constructor injecting the values
		Employee employee=new Employee(101,"pooji",657.89);
		System.out.println(employee);
		
		//setters are injecting the value
		Employee emp=new Employee();
		emp.setEmpId(111);
		emp.setEmpName("Poojitha");
		emp.setEmpSalary(50000.79);
		System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpSalary());
		
	}

}

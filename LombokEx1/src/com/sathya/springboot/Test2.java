package com.sathya.springboot;

public class Test2 {

	public static void main(String[] args) {
		Employee2 employee2=Employee2.builder()
				.empId(1002)
				.empName("kavya")
				.empSalary(60000.9)
				.build();
		System.out.println(employee2);
	}

}

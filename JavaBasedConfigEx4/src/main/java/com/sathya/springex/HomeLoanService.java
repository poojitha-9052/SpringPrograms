package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class HomeLoanService implements LoanService 
{

	@Override
	public void LoanInfo() {
		System.out.println("your Loan Details are....");
		System.out.println("2 LPA");
		
	}

}

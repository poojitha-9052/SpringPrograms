package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
	private HomeLoanService homeloanService;
	private RealStateService realstateService;
	
	public HomeLoanService getHomeloanService() {
		return homeloanService;
	}
	@Autowired
	public void setHomeloanService(HomeLoanService homeloanService) {
		this.homeloanService = homeloanService;
	}
	public RealStateService getRealstateService() {
		return realstateService;
	}
	@Autowired
	public void setRealstateService(RealStateService realstateService) {
		this.realstateService = realstateService;
	}
	
	public void details()
	{
		homeloanService.LoanInfo();
		realstateService.realstateInfo();
	}

}

package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class RealStateService implements StateService
{

	@Override
	public void realstateInfo() {
		System.out.println("welcom to realstate Service");
		}

}

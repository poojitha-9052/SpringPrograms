package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService
{

	@Override
	public void message() {
		System.out.println("check your EmailId");
		System.out.println("you will get updates");
		
	}

}

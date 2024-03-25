package com.sathya.springex;

public class GreetingImpl implements Greeting 
{

	@Override
	public void greet() {
		System.out.println("Welcome to spring classes");
		System.out.println("This is first Spring example");	
	}
	public GreetingImpl()
	{
		System.out.println("Greeting constructor::object created");
	}

}

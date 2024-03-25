package com.sathya.springex;

public class GreetingImpl implements Greeting 
{

	@Override
	public void greet() {
		System.out.println("Welcome to SathyaTech");
		System.out.println("This is first Spring example of JavaBased");	
	}
	public GreetingImpl()
	{
		System.out.println("Greeting constructor::object created");
	}

}

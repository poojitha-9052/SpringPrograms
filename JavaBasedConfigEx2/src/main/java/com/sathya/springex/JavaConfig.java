package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("poojitha");
		person.setEmail("poojitha@gmail.com");
		return person;
		}

	@Bean
	public Person person2()
	{
		Person person2=new Person();
		person2.setName("kavya");
		person2.setEmail("kavya@gmail.com");
		return person2;
		}

	@Bean
	public Person person3()
	{
		Person person3=new Person();
		person3.setName("mahesh");
		person3.setEmail("mahesh@gmail.com");
		return person3;
		}



}

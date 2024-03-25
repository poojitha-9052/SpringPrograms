package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Doctor doctor()
	{
		Doctor doctor=new Doctor(123,"Kavya");
		return doctor;
		
	}

	@Bean
	public Pharmacy pharmacy()
	{
		Pharmacy pharmacy=new Pharmacy("locode","Hyderabad");
		return pharmacy;
		
	}
	@Bean
	public Patient patient()
	{
		Patient patient=new Patient("poojitha",17,doctor(),pharmacy());
		return patient;
		
	}
	

}

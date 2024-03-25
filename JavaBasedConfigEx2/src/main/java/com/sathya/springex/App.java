package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
         System.out.println("Greeting constructor::object is created");
         System.out.println("*********");
         
         //get the bean
         Person person=context.getBean("person1",Person.class);
         person.personInfo();
         
         Person person2=context.getBean("person2",Person.class);
         person2.personInfo();
         
         Person person3=context.getBean("person3",Person.class);
         person3.personInfo();  
    }
}

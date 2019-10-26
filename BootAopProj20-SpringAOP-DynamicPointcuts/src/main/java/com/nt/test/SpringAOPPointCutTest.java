package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.AirthmeticOperations;

@SpringBootApplication
@Import(AppConfig.class)
public class SpringAOPPointCutTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AirthmeticOperations proxy=null;
		//create IOC container
		ctx=SpringApplication.run(SpringAOPPointCutTest.class, args);
		//get Proxy object
		proxy=ctx.getBean("pfb",AirthmeticOperations.class);
		//invoke the method
		System.out.println("sum=="+proxy.sum(100,200));
		System.out.println(".........");
		System.out.println("sub=="+proxy.sub(100,200));
		System.out.println(".........");
		System.out.println("mul=="+proxy.mul(100,200));
		System.out.println(".........");
		System.out.println("mul=="+proxy.mul(1000,2000));
		System.out.println(".........");
		System.out.println("div=="+proxy.div(100,200));
		System.out.println(".........");

       //close contianer
		((AbstractApplicationContext) ctx).close();
	}//main
}//class

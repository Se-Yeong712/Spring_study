package com.myspring.step4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로부터 객체를 요청(Lookup)한다.
		System.out.println("tv1객체 생성");
		TV tv1 = (TV) factory.getBean("tv");
		tv1.powerOn();
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.powerOff();
		
		System.out.println("tv2객체 생성");
		TV tv2 = (TV) factory.getBean("tv");
		
		factory.close();	
	}
}

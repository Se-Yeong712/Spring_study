package com.myspring.step10;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext3.xml");

		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Properties addressList = bean.getAddressList();
		/*
		 * for(String key : addressList.stringPropertyNames()) {
		 * System.out.println(String.format("키 : %s, 값 : %s",key,
		 * addressList.get(key))); 
		 * }
		 */
		// 또는

		
		 for(Object key : addressList.keySet()) {
		 System.out.println(String.format("키 : %s, 값 : %s",key,addressList.getProperty((String)key))); 
		 }
		 

		factory.close();

	}

}
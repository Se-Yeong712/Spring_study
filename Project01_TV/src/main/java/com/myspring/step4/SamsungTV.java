package com.myspring.step4;

public class SamsungTV implements TV{
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(step4) 객체생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원켠다");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---전원끈다");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다");
	}
	
}

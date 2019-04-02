package com.myspring.step4;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(step1) 객체생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(step2) 객체생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(step3) 객체생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원켠다 (가격 : "+price+")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---전원끈다");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}

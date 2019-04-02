package com.myspring.step3;

public class SamsungTV implements TV{
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(step1) 객체생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(step2) 객체생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===> SamsungTV(step3) 객체생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원켠다");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---전원끈다");
	}
	
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
	
}

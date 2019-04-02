package com.myspring.step1;

public class TVUser {

	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		LgTV lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.turnOff();
		lgtv.soundUp();
		lgtv.soundDown();
	}
}

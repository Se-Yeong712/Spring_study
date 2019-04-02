package com.myspring.step2;

public class TVUser {

	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}

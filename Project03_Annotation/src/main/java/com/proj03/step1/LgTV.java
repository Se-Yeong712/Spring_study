package com.proj03.step1;

import org.springframework.stereotype.Component;

//클래스 선언 부분에 @Component를 설정하여 스프링컨테이너는 해당 클래스트를 bean으로 생성관리함
//해당 클래스에 기본생성자가 있어야 컨테이너가 객체 생성 가능
@Component("tv") 
public class LgTV implements TV{

	public LgTV() {
		System.out.println("===> LgTV(step1) 객체 생성");
	}
	public void powerOn() {
		System.out.println("LgTV---전원켠다.");
	}
	public void powerOff() {
		System.out.println("LgTV---전원끝다.");
	}
	public void volumeUp() {
		System.out.println("LgTV---소리 울린다.");
	}
	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
	}
	
	
}

package kr.ac.kopo.day15.inter01;

public class SamsungTV {
	private boolean power;
	
	public SamsungTV() {
		System.out.println("삼성TV 구매 완료");
	}
	
	public void turnOn() {
		System.out.println("전원 ON");
	}
	public void turnOff() {
		System.out.println("전원 OFF");
	}
	public void channelUp() {
		System.out.println("채널 Up...");
	}
	public void channelDown() {
		System.out.println("채널 Down...");
	}
	public void soundUp() {
		System.out.println("음량 Up...");
	}
	public void soundDown() {
		System.out.println("음량 Down...");
	}
	public void mute() {
		System.out.println("음소거중...");
	}
}

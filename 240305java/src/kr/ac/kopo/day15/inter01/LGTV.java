package kr.ac.kopo.day15.inter01;

public class LGTV {
	private boolean power;
	private int channelNo;
	private int volumeSize;
	
	public LGTV() {
		power = false;
		channelNo = 3;
		volumeSize = 7;
		System.out.println("LGTV 구매완료...");
	}
	
	
	public void powerOn() {
		System.out.println("powerOn...");
	}
	public void powerOff() {
		System.out.println("powerOff...");		
	}
	public void channelUp() {
		System.out.println("channelUp...");
	}
	public void channelDown() {
		System.out.println("channelDown...");
	}
	public void volumeUp() {
		System.out.println("volumeUp...");
	}
	public void volumeDown() {
		System.out.println("volumeDown...");
	}
}

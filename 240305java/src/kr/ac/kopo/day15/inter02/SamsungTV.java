package kr.ac.kopo.day15.inter02;
public class SamsungTV implements TV {

	public SamsungTV() {
		System.out.println("삼성TV 구매완료");
	}
	
	@Override
	public void powerOn() {
		System.out.println("전원 ON");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 OFF");
	}

	@Override
	public void soundUp() {
		System.out.println("음량 UP");
	}

	@Override
	public void soundDown() {
		System.out.println("음량 DOWN");
	}

	@Override
	public void channelUp() {
		System.out.println("채널 UP");
	}

	@Override
	public void channelDown() {
		System.out.println("채널 DOWN");
	}

	@Override
	public void mute() {
		System.out.println("음소거");
	}

}

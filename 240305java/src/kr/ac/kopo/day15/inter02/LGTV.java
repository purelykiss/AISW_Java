package kr.ac.kopo.day15.inter02;

public class LGTV implements TV{

	private boolean power;
	private int channelNo;
	private int volumeSize;
	private boolean mute;
	
	
	public LGTV() {
		System.out.println("LGTV를 구매하셨습니다");
		power = false;
		channelNo = 3;
		volumeSize = 7;
	}
	
	public void info() {
		System.out.println("현재 채널: " + channelNo
				+ ", 음량: " + volumeSize);
	}
	
	@Override
	public void powerOn() {
		power = true;
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		info();
	}

	@Override
	public void soundUp() {
		if(volumeSize < MAX_VOLUME_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void soundDown() {
		if(volumeSize > MIN_VOLUME_SIZE)
			volumeSize--;
		info();
	}

	@Override
	public void channelUp() {
		System.out.println("채널을 올립니다");
		channelNo++;
		info();
	}

	@Override
	public void channelDown() {
		System.out.println("채널을 내립니다");
		channelNo--;
		info();
	}

	@Override
	public void mute() {
		System.out.println("음소거 중입니다");
		channelNo = MIN_VOLUME_SIZE;
		info();
	}
	
}

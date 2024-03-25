package kr.ac.kopo.day15.inter02;

public class UserMain {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelDown();
		tv.channelUp();
	}
}

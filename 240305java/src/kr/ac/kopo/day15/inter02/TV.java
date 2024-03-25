package kr.ac.kopo.day15.inter02;

public interface TV {
	int MIN_VOLUME_SIZE = 0;
	int MAX_VOLUME_SIZE = 50;
	
	void powerOn();
	void powerOff();
	void soundUp();
	void soundDown();
	void channelUp();
	void channelDown();
	void mute();
}

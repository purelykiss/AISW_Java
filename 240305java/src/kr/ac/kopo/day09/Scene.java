package kr.ac.kopo.day09;

public interface Scene {
	public String getID();
	public void activate();
	public void onStart();
	public void onEnd();
}

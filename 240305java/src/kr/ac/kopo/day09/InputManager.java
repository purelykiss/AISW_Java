package kr.ac.kopo.day09;

import java.util.Scanner;

public class InputManager {
	public static InputManager instance;
	private Scanner sc;
	
	private InputManager() {
		sc = new Scanner(System.in);
	}
	
	public static void createInstance() {
		if(instance == null)
			instance = new InputManager();
	}
	
	public String nextLine() {
		return sc.nextLine();
	}
	
	public int nextInt() {
		return Integer.parseInt(sc.nextLine());
	}
	
	public void close() {
		sc.close();
	}
	
}

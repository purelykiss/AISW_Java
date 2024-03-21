package kr.ac.kopo.day13;

import java.util.Random;

public abstract class Shape {
	final int MIN_RAN = 1;
	final int MAX_RAN = 10;
	
	private String name;
	private Random rd;
	
	private Shape() {
		rd = new Random();
	}
	protected Shape(String name) {
		this();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int randomNum() {
		return rd.nextInt(MIN_RAN, MAX_RAN);
	}
	
	public abstract void calculateArea();
}

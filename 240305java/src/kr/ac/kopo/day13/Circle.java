package kr.ac.kopo.day13;

import java.util.Random;

public class Circle extends Shape{
	final double PI = 3.141592;
	
	public Circle() {
		super("원");
	}

	@Override
	public void calculateArea() {
		int radius = randomNum();
		double area = PI * radius * radius;
		System.out.printf("반지름 %d일 떄 원의 넓이는 %.6f이다.\n", radius, area);
	}

}

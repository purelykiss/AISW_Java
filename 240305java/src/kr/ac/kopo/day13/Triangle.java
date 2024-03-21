package kr.ac.kopo.day13;

import java.util.Random;

public class Triangle extends Shape{
	public Triangle() {
		super("삼각형");
	}

	@Override
	public void calculateArea() {
		int base = randomNum();
		int height  = randomNum();
		double area = (double)base * height / 2;
		System.out.printf("밑변 %d, 높이 %d일 때 삼각형의 넓이는 %f이다.\n", base, height, area);
	}

}

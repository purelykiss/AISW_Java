package kr.ac.kopo.day13;

import java.util.Random;

public class Rectangle extends Shape{
	public Rectangle() {
		super("직사각형");
	}

	@Override
	public void calculateArea() {
		int width = randomNum();
		int height = randomNum();
		int area = width * height;
		System.out.printf("가로 %d, 세로 %d일 때 직사각형의 넓이는 %d이다.\n", width, height, area);
	}

}

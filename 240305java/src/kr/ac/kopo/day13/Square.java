package kr.ac.kopo.day13;

import java.util.Random;

public class Square extends Shape{
	public Square() {
		super("정사각형");
	}

	@Override
	public void calculateArea() {
		int width = randomNum();
		int area = width * width;
		System.out.printf("너비가 %d인 정사각형의 넓이는 %d이다.\n", width, area);
	}

}

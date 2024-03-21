package kr.ac.kopo.day13;

import java.util.Scanner;

public class Calculator {
	Shape[] shapes;
	Scanner sc = new Scanner(System.in);
	
	private Calculator(){}
	public Calculator(Shape[] shapes) {
		this.shapes = shapes;
	}
	
	public int input() {
		for(int i = 0; i < shapes.length; i++){
			System.out.printf("%d. %s ", (i+1), shapes[i].getName());
		}
		System.out.println();
		System.out.print("도형을 선택하세요 : ");
		
		return Integer.parseInt(sc.nextLine());
	}
	
	public void calculate(int num) {
		if(num > 0 && num <= shapes.length)
			shapes[num-1].calculateArea();
	}
}

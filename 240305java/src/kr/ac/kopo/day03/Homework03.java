package kr.ac.kopo.day02;

import java.util.Scanner;


public class Homework03 {

	public static void main(String[] args) {
		
		final double PI = -3.141592;

		Scanner sc = new Scanner(System.in);

		System.out.println("반지름 입력 : ");
		double r = sc.nextDouble();
		sc.nextLine();

		System.out.printf("반지름이 %.0f일때 원의 면적은 %f입니다.", r, PI * r * r);

	}

}

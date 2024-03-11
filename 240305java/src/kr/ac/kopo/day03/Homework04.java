package kr.ac.kopo.day02;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.println("나눌 수를 입력하세요 : ");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.printf("몫 : %d\n", a / b);
		System.out.printf("나머지 : %d\n", a % b);

	}

}
	
package kr.ac.kopo.day02;

import java.util.Scanner;

public class ScannerMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력 : ");
		char d = sc.nextLine().charAt(0);
		System.out.println("d : " + d);
		
		System.out.print("정수 입력: ");
//		int a = 10;
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("a : " + a);

		System.out.print("실수 입력: ");
		double b = sc.nextDouble();
		sc.nextLine();
		System.out.println("b : " + b);

		System.out.print("문자열 입력: ");
//		String c = sc.next();		//다음 공백, 줄바꿈까지 받음, 단어단위
		String c = sc.nextLine();	//다음 줄바꿈까지 받음. 그런데 입력버퍼를 사용하기에 입력을 받지 않고 패스함
		System.out.println("c : " + c);
	}
}

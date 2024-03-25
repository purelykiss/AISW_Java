package kr.ac.kopo.day15;

import java.util.Scanner;

public class ExceptionMain06 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("짝수입력: ");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {
			throw new OddException("입력된 정수 " + num + "은 홀수입니다.");
		}
		
		System.out.println("출력: " + num);
	}
}

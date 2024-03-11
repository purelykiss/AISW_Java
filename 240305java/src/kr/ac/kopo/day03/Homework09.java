package kr.ac.kopo.day02;

import java.util.Scanner;

public class Homework09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수 입력 : " );
		int book = sc.nextInt();
		sc.nextLine();
		
		if(book == 0) {
			System.out.println("보유하고 있는 책 없음");
		}else if(book<0) {
			System.out.println("잘못입력했습니다");
		}
		else if(book == 1) {
			System.out.println(book + " book");
		}else {
			System.out.println(book + " books");
			
		}
	}	
}
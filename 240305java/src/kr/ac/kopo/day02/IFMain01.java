package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 보유하고 있는 책권수 입력 : 1
 * 1 book
 * 
 * 보유하고 있는 책권수 입력 : 4
 * 4 books
 */

public class IFMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("보유하고 있는 책 권수 입력 : ");
		int book = sc.nextInt();
		
		System.out.print(book + " book");
		
	}
}

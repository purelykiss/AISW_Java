package kr.ac.kopo.day02;

import java.util.Scanner;


public class Homework05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double won = 1092.50;

		System.out.println("달러를 입력하세요 : ");
		int dollars = sc.nextInt();
		sc.nextLine();

		System.out.printf("원화 : %.2f원\n", won * dollars);

	}

}

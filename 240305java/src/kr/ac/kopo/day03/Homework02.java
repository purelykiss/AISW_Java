package kr.ac.kopo.day03;

import java.util.Scanner;


public class Homework02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�ʸ� �Է� : ");
		int sec = sc.nextInt();
		sc.nextLine();

		int hour = sec / (60*60);
		int min = sec % (60*60) / 60;
		int s = sec % 3600 % 60;
		System.out.printf("%d�� : %d�ð� %d�� %d��\n",sec,hour,min,s);

	}

}


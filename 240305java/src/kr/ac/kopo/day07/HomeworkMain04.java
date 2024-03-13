package kr.ac.kopo.day07;

import java.util.Scanner;

public class HomeworkMain04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];	//[0] ~ [4, score.length-1]
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "\'s score : ");
			score[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("< PRINT >");
		System.out.println("--------------------------");
	}
}

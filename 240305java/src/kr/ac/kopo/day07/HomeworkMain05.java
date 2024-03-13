package kr.ac.kopo.day07;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMain05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int [5];
		
		for(int i = 0; i < nums.length; ) {	
			System.out.print("num" + (i+1) + " : ");
			nums[i] = sc.nextInt();
			if(nums[i] % 2 == 0) {
				i++;
			}
		}
		/*
		for(int i = 0; i < nums.length; i++) {	
			System.out.print("num" + (i+1) + " : ");
			nums[i] = sc.nextInt();
			if(nums[i] % 2 == 1) {
				i--;
			}
		}
		*/
		/*
		for(int i = 0; i < nums.length; i++) {
			do {
				System.out.print("num" + (i+1) + " : ");
				nums[i] = sc.nextInt();
			}while(nums[i] % 2 == 1);
		}
		*/
		
		System.out.println("< PRINT >");
		System.out.println(Arrays.toString(nums));
	}
}

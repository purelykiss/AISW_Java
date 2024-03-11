package kr.ac.kopo.day05;

import java.util.Scanner;

/*
 * 1's 정수 입력 : 23
 * 2's 정수 입력 : 15
 * 3's 정수 입력 : 83
 * 
 * < PRINT > 
 * 23 15 83
 */

public class ArrayMain01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int [] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "\'s num : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		/*
		System.out.print("1\'s num : ");
		int num = sc.nextInt();
		
		System.out.print("2\'s num : ");
		int num2 = sc.nextInt(); 
		
		System.out.print("3\'s num : ");
		int num3 = sc.nextInt(); 
		
		System.out.println(num + " " + );
		*/
	}
}

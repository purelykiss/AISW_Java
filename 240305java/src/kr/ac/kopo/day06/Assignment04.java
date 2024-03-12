package kr.ac.kopo.day06;

import java.util.Scanner;

/*
 4. 짝수를 5개 입력받아 출력하는 코드 작성
	num1 : 24
	num2 : 95
	num2 : 67
	num2 : 68
	num3 : 12
	num4 : 78
	num5 : 3
	num5 : 1
	num5 : 125
	num5 : 34

	< PRINT >
	24 68 12 78 34
 */
public class Assignment04 {
	public static void main(String[] args) {
		final int NUM_OF_INPUT = 5;
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[NUM_OF_INPUT];
		
		//입력
		for(int i = 0; i < input.length; i++) {
			while(true) {	//조건에 맞을때까지 입력 반복
				System.out.print("num" + (i+1) + " : ");
				input[i] = Integer.parseInt(sc.nextLine());
				if(input[i] > 0 && input[i] % 2 == 0) {	//조건: 짝수일 경우
					break;
				}
			}
		}
		
		//출력
		System.out.println("< PRINT >");
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		
		sc.close();
		System.out.println();
	}
}

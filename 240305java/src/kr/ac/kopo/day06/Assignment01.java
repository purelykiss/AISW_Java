package kr.ac.kopo.day06;

import java.util.Scanner;

/*
 * 1. 총 10개의 정수를 입력받아 다음과 같이 출력하세요
	num1 : 23
	num2 : 4
	num3 : 7
	num4 : 11
	num5 : 64
	num6 : 82
	num7 : 22
	num8 : 62
	num9 : 22
	num10 : 91

	< 짝수 >
	4	64	82	22	62	22
	짝수의 총합 : XX
	< 홀수 >
	23	7	11	91
	홀수의 총합 : XX
 */
public class Assignment01 {
	public static void main(String[] args) {
		final int INPUT_LENGTH = 10;
		
		Scanner sc = new Scanner(System.in);
		int[] input = new int[INPUT_LENGTH];
		int[] evenNum = new int[INPUT_LENGTH];
		int[] oddNum = new int[INPUT_LENGTH];
		int evenIndex = 0;	//evenNum의 index를 체크하기 위함
		int oddIndex = 0;	//oddNum의 index를 체크하기 위함
		int evenSum = 0;
		int oddSum = 0;
		
		//입력
		for(int i = 0; i < INPUT_LENGTH; i++) {
			System.out.printf("num%d : ", i+1);
			input[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println();	
		System.out.println();	//2줄 띄움
		
		//짝수 체크
		for(int num : input) {
			if(num != 0 && num % 2 == 0) {
				evenNum[evenIndex] = num;	//짝수 배열에 짝수 넣기
				evenSum+=num;				//짝수 총합 계산
				evenIndex++;				//다음 인덱스 가르키기 + 결과물은 총 길이가 될 것임.
			}
		}
		
		//홀수 체크
		for(int num : input) {
			if(num != 0 && num % 2 == 1) {
				oddNum[oddIndex] = num;		//홀수 배열에 짝수 넣기
				oddSum+=num;				//홀수 총합 계산
				oddIndex++;					//다음 인덱스 가르키기 + 결과물은 총 길이가 될 것임.
			}
		}
		
		//출력
		System.out.println("< 짝수 >");
		for(int i = 0; i < evenIndex; i++) {	//이전에 evenIndex에 배열 자체의 length와 별개로 자체적인 length가 들어감
			System.out.printf("%d\t", evenNum[i]);	//배열 안의 수 나열
		}
		System.out.println();
		System.out.println("짝수의 총합 : " + evenSum);		//미리 계산한 합
		
		System.out.println("< 홀수 >");
		for(int i = 0; i < oddIndex; i++) {		//이전에 evenIndex에 배열 자체의 length와 별개로 자체적인 length가 들어감
			System.out.printf("%d\t", oddNum[i]);	//배열 안의 수 나열
		}
		System.out.println();
		System.out.println("홀수의 총합 : " + oddSum);		//미리 계산한 합
		
		sc.close();
	}
}

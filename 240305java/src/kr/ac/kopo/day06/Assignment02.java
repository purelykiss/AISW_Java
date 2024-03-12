package kr.ac.kopo.day06;

import java.util.Random;

/*
   2. 0 ~ 99 사이의 임의!의 정수를 5개 받아와 다음과 같이 출력
	< PRINT >
	93 5 10 57 36
	
	< REVER >
	63 75 1 50 39
 */
public class Assignment02 {
	public static void main(String[] args) {
		final int MIN_RANDOM_RANGE = 0;
		final int MAX_RANDOM_RANGE = 99;
		final int ARRAY_CNT = 5;
		
		Random rd = new Random();
		int[] randomNum = new int[ARRAY_CNT];
		int[] reverseNum = new int[ARRAY_CNT];
		
		//랜덤한 숫자 생성
		for(int i = 0; i < randomNum.length; i++) {
			randomNum[i] = rd.nextInt(MIN_RANDOM_RANGE, MAX_RANDOM_RANGE);
		}
		
		//생성한 숫자 출력
		System.out.println("< PRINT >");
		for(int num : randomNum) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();
		
		//배열과 숫자를 역순으로 변경
		for(int i = 0; i < randomNum.length; i++){
			//타겟인 randomNum[i]를 십의 자리와 일의 자리로 분리 
			int tensDigit = randomNum[i] / 10;
			int onesDigit = randomNum[i] % 10;
			//배열의 인덱스를 역순으로, 숫자도 역순으로 변경
			reverseNum[ARRAY_CNT - 1 - i] = onesDigit * 10 + tensDigit;
		}
		
		//변경된 배열을 출력
		System.out.println("< REVER >");
		for(int num : reverseNum) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();
	}
}

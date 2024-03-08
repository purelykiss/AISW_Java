package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 6. 369게임
	20 ~ 120 사이의 숫자를 입력 : 42
	
	< 1 ~ 42 사이의 369게임 >
	1	//일반적인 경우
	2
	짝	//3, 6, 9가 들어간 만큼
	...
	뽀뽀숑	//10의 배수일 때, num / 10만큼 뽀, 뒤에 숑
	...
	짝뽀뽀뽀숑	//우선순위 : 짝 > 뽀숑
 */
public class Assignment06 {
	public static void main(String[] args) {
		final int MIN_RANGE = 20;
		final int MAX_RANGE = 120;
		final String AT_369 = "짝";
		final String AT_10_MULTIPLE_FRONT = "뽀";
		final String AT_10_MULTIPLE_END = "숑"; 
		
		int inputMAXRange;
		int curNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.printf("%d ~ %d 사이의 숫자를 입력 : ", MIN_RANGE, MAX_RANGE);
		inputMAXRange = Integer.parseInt(sc.nextLine());
		if(inputMAXRange < MIN_RANGE || inputMAXRange > MAX_RANGE) {	//예외시 종료
			sc.close();
			return;
		}
		
		//출력
		System.out.printf("< 1 ~ %d 사이의 369게임 >\n", inputMAXRange);
		
		for(curNum = 1; curNum <= inputMAXRange; curNum++) {
			//백의 자리 분리
			int hundredDigit;
			if(curNum >= 100) {
				hundredDigit = curNum%100;
			}else {
				hundredDigit = 0;
			}
			//십의 자리 분리
			int tenDigit;
			if(curNum >= 10) {
				tenDigit = (curNum - 100*hundredDigit) / 10;
			}else {
				tenDigit = 0;
			}
			//일의 자리 분리
			int oneDigit = curNum % 10;
			
			//짝 체크
			int clap = 0;
			if(hundredDigit != 0 && hundredDigit % 3 == 0){
				clap++;
			}
			if(tenDigit != 0 && tenDigit % 3 == 0 ) {
				clap++;
			}
			if(oneDigit != 0 && oneDigit % 3 == 0 ) {
				clap++;
			}
			
			//뽀숑 체크
			int Pposyong = 0;
			if(curNum % 10 == 0) {
				Pposyong = curNum / 10;
			}
			
			if(clap == 0 && Pposyong == 0) {		//통상의 경우
				System.out.println(curNum);
			}else {
				for(int i = 0; i < clap; i++) {		//짝이 뽀숑보다 먼저오므로 먼저 입력
					System.out.print(AT_369);
				}
				for(int i = 0; i < Pposyong; i++) {
					System.out.print(AT_10_MULTIPLE_FRONT);
				}
				if(Pposyong > 0){
					System.out.print(AT_10_MULTIPLE_END);
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}

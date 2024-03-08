package kr.ac.kopo.day04;

import java.util.Scanner;

/*
  1. 단을 입력받아 해당 구구단을 출력하는 코드를 작성
  2 - 9 : 7
  *** 7단 ***
  7 * 1 = 7
  7 * 2 = 14
  7 * 3 = 21
  ...
  7 * 9 = 63
 */
public class Assignment01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum;
		
		//입력부
		System.out.print("2 - 9 : ");
		inputNum = Integer.parseInt(sc.nextLine());
		
		//조건분기
		if(!(inputNum <= 9 && inputNum >= 2)) {	//조건: 2와 9사이 값이 아닌 경우
			sc.close();
			return;		//문제에 따로 조건이 없으니,
		}				//예외가 발생할 경우 종료하도록 했습니다
		
		//구구단
		System.out.printf("*** %d단 ***\n", inputNum);	//제목
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, inputNum * i); //7 * 1 = 7
		}
		
		sc.close();
	}
}

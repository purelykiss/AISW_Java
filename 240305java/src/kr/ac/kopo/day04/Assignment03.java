package kr.ac.kopo.day04;

import java.util.Scanner;

/*
 3. 시작단과 종료단을 입력받아 구구단 출력
  시작단 : 4
  종료단 : 7
  
  *** 4단 ***
  4 * 1 = 4
  ...
  7 * 9 = 63
  ------------------------------
  시작단 : 7
  종료단 : 4
  
  *** 4단 ***
  4 * 1 = 4
  ...
  7 * 9 = 63  
 */
public class Assignment03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputStart;
		int inputEnd;
		
		System.out.println("시작단 : ");
		inputStart = Integer.parseInt(sc.nextLine());
		System.out.println("종료단 : ");
		inputEnd = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		//입력 오류 분기
		if(!(inputStart <= 9 && inputStart >= 2)
				|| !(inputEnd <= 9 && inputEnd >= 2)) {
			sc.close();
			return;
		}
		
		//시작단이 종료단보다 더 클 경우 숫자 정렬
		if(inputStart > inputEnd) {
			int tmp = inputStart;
			inputStart = inputEnd;
			inputEnd = tmp;
		}
		
		//구구단 출력
		for(int i = inputStart; i <= inputEnd; i++) {	//단수
			//제목
			System.out.printf("*** %d단 ***\n", i);	
			
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
		
		sc.close();
	}
}

package kr.ac.kopo.day04;

import java.util.Random;
import java.util.Scanner;

/*
 5. 1 ~ 100사이의 랜덤함 숫자를 컴퓨가 알고있고, 사용자가 그 숫자를 맞추는 프로그램 작성
   단, 기회는 6번 
   
   1 - 100 : 48
   48보다 작은수 입니다
   기회는 총 5번 남았습니다

   ...
   
   31 - 38 : 32
   32보다 큰수입니다
   기회는 총 0번 남았습니다
   아쉽습니다. 기회를 다 소진하셨습니다
   정답은 [38]입니다
   
   31 - 38 : 38
   축하합니다 정답입니다!!!
 */
public class Assignment05 {
	public static void main(String[] args) {
		final int MAX_RANGE = 100;
		final int MIN_RANGE = 1;
		final int MAX_ATTEMPT = 6;
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int curMAXRange = MAX_RANGE;
		int curMINRange = MIN_RANGE;
		int curAttempt = MAX_ATTEMPT;
		int answer;		//컴퓨터가 랜덤하게 설정한 정답
		int input;		//입력값
		boolean flagCorrectAns = false;
		boolean flagFinish = false;
		
		//랜덤 인수 설정
		answer = rd.nextInt(MIN_RANGE, MAX_RANGE);
		
		//게임 시작
		while(!flagFinish) {
			//입력
			System.out.printf("%d - %d : ", curMINRange, curMAXRange);
			input = Integer.parseInt(sc.nextLine());
			
			if(input > curMAXRange || input < curMINRange) {	//만약 입력값이 범위 밖인 경우
				System.out.println("잘못된 입력입니다. 다시 입력하십시오.");
				continue;
			}
			
			//정답검사
			if(answer > input) {
				System.out.println(input + "보다 큰 수 입니다.");
				curMINRange = input;
			}else if(answer < input) {
				System.out.println(input + "보다 작은 수 입니다.");
				curMAXRange = input;
			}else {
				flagCorrectAns = true;
			}
			
			//기회 차감
			curAttempt--;
			System.out.printf("기회는 총 %d번 남았습니다\n", curAttempt);
			
			//종료 체크 및 분기
			if(flagCorrectAns) {		//승리
				System.out.println("축하합니다 정답입니다!!!");
				flagFinish = true;
			}else if(curAttempt <= 0){	//패배
				System.out.println("아쉽습니다. 기회를 다 소진하셨습니다");
				System.out.printf("정답은 [%d]입니다\n", answer);
				flagFinish = true;
			}
		}
		
		sc.close();
	}
}

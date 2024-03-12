package kr.ac.kopo.day06;

import java.util.Scanner;

/*
 3. 학생 5명의 성적을 입력받아 다음과 같이 출력
	1's의 성적: 92
	2's의 성적: 65
	3's의 성적: 10000
	4's의 성적: -34
	5's의 성적: 88

	--------------------------------
	번호	성적	학점
	--------------------------------
	1	92	A
	2	65	D
	3	ERROR!!!	
	4	ERROR!!!	
	5	88	B
	---------------------------------
	5회 입력 중 [ 2 ]회 에러발생
	총점 : 246점	//정확한 입력만
	평균 : 49.20점	//소수점 2째자리까지
 */
public class Assignment03 {
	public static void main(String[] args) {
		final int NUM_OF_STUDENT = 5;
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[NUM_OF_STUDENT];
		char[] grade = new char[NUM_OF_STUDENT];
		int numOfError = 0;
		int sumOfScore = 0;
		double averageOfScore = 0;
		
		//입력
		for(int i = 0; i < NUM_OF_STUDENT; i++) {
			System.out.print(i+1 + "'s의 성적: ");
			score[i] = Integer.parseInt(sc.nextLine());
		}
		
		//입력된 성적에 대한 데이터 작업
		for(int i = 0; i < NUM_OF_STUDENT; i++) {
			boolean flagValidScore = true;	//성적의 오류 여부 확인용
			
			//성적 부여
			if(score[i] <= 100 && score[i] >= 90) {
				grade[i] = 'A';
			}else if(score[i] < 90 && score[i] >= 80) {
				grade[i] = 'B';
			}else if(score[i] < 80 && score[i] >= 70) {
				grade[i] = 'C';
			}else if(score[i] < 70 && score[i] >= 60) {
				grade[i] = 'D';
			}else if(score[i] < 60 && score[i] >= 0) {
				grade[i] = 'F';
			}else {
				grade[i] = '\0';			//범위 밖 점수에 대해서는 성적 X
				numOfError++;				//오류 횟수 추가
				flagValidScore = false;		//오류 체크
			}
			
			if(flagValidScore) {	//오류가 없을 경우 총점 누적
				sumOfScore += score[i];
			}
		}
		
		//평균 계산
		averageOfScore = (double)sumOfScore / NUM_OF_STUDENT;
		
		//출력
		System.out.println("--------------------------------");
		System.out.println("번호\t성적\t학점");
		System.out.println("--------------------------------");
		for(int i = 0; i < NUM_OF_STUDENT; i++) {
			System.out.printf("%d\t%d\t%c\n", i+1, score[i], grade[i]);
		}
		System.out.println("--------------------------------");
		System.out.printf("%d회 입력 중 [ %d ]회 에러발생\n", NUM_OF_STUDENT, numOfError);
		System.out.printf("총점 : %d점\n", sumOfScore);
		System.out.printf("평균 : %.2f점\n", averageOfScore);
		
		sc.close();
	}
}

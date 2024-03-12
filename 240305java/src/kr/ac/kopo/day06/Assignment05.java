package kr.ac.kopo.day06;

import java.util.Scanner;

/*
 5. 1 ~ 100 사이의 정수를 입력받아 입력받은 정수의 약수를 구하는 프로그램 작성
	1 ~ 100 사이의 정수 입력 : 82

	82 약수의 개수 : 4개
	1  2  41  82

	1 ~ 100 사이의 정수 입력 : 48

	48 약수의 개수 : 10개
	1   2   3   4   6   8   12  16  24  48
 */
//다른 분의 배열 갱신 코드를 보고 인상 깊어서 따라써봤습니다
public class Assignment05 {
	public static void main(String[] args) {
		final int MIN_RANGE = 1;
		final int MAX_RANGE = 100;
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		int[] divisor = new int[2];		//소수를 저장할 배열
		int divisorIndex = 0;			//현제 저장할 인덱스 위치
		
		//입력
		System.out.printf("%d ~ %d 사이의 정수 입력 : ", MIN_RANGE, MAX_RANGE);
		input = Integer.parseInt(sc.nextLine());
		if(input > MAX_RANGE || input < MIN_RANGE) {	//예외시 종료
			sc.close();
			return;
		}
		
		//약수 구하기
		for(int i = 1; i <= input; i++) {
			if(input % i == 0) {	//나눴을 때 0인 경우 약수
				if(divisorIndex >= divisor.length) {		//배열의 저장 길이가 부족한 경우
					int[] tmpArr = divisor;					//배열 힙 저장소 바꾸기 전 tmpArr로 이동
					divisor = new int[divisor.length * 2];	//divisor 배열 길이 2배로 힙에 새로 생성
					for(int j = 0; j < tmpArr.length; j++) {
						divisor[j] = tmpArr[j];				//새로 갱신한 힙의 배열에 기존의 배열 정보 이동
					}
				}
				divisor[divisorIndex] = i;		//약수 추가
				divisorIndex++;		//실질적으로 인덱스는 여기서 셈. 결과물은 약수의 총 개수
			}
		}
		
		//출력
		System.out.printf("%d 약수의 개수 : %d개\n", input, divisorIndex);
		for(int i = 0; i < divisorIndex; i++) {
			System.out.print(divisor[i] + " ");
		}
		System.out.println();
		
		sc.close();
	}
}

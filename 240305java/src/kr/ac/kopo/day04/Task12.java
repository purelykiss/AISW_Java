package kr.ac.kopo.day04;
/*
 * *****
 * ****
 * ***
 * **
 * *
 * **
 * ***
 * ****
 * *****
 * if 3번쓰기
 */
public class Task12 {
	public static void main(String[] args) {
		for(int i = 0; i < 9; i++) {
			System.out.print('*');
			for(int j = 0; i+j <4; j++) {
				System.out.print('*');
			}
			for(int j = 0; i-j > 4; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

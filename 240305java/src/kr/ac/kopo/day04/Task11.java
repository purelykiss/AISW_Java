package kr.ac.kopo.day04;
/*
 * *
 * **
 * ***
 * ****
 * *****
 * ****6
 * ***7
 * **8
 * *9
 */
public class Task11 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 0; j < i; j++) {
					System.out.print('*');
				}
			}else {
				for(int j = 0; i+j < 10; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
}

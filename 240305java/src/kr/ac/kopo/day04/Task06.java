package kr.ac.kopo.day04;
/*
 * 56789
 * 45678
 * 34567
 * 23456
 * 12345
 */
public class Task06 {
	public static void main(String[] args) {
		for(int i = 5; i> 0; i--) {
			for(int j = 0; j < 5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}

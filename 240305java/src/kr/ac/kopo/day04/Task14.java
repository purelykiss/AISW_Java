package kr.ac.kopo.day04;
/*
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *  ****6
 *   ***7
 *    **8
 *     *9
 */
public class Task14 {
	public static void main(String[] args) {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 5; j++) {
				if(i < 5) {
					if(i+j < 4) {
						System.out.print(' ');
					}else {
						System.out.print('*');
					}
				}else {
					if(i-j > 4) {
						System.out.print(' ');
					}else {
						System.out.print('*');
					}
				}
			}
			System.out.println();
		}
	}
}

package kr.ac.kopo.day04;
/*
 * *****1 _0*5
 *  ****2 _1*4
 *   ***3 _2*3
 *    **4 _3*2
 *     *5 _4*1 >> 별과 줄수를 더하면 6
 *    **6 _3*2 >>
 *   ***7 _2*3
 *  ****8 _1*4
 * *****9 _0*5
 */
public class Task13 {
	public static void main(String[] args) {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 5; j++) {
				if(i < 5) {
					if(j < i) {
						System.out.print(' ');
					}else {						
						System.out.print('*');
					}
				}
				else {
					if(i+j < 8) {
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

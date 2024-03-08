package kr.ac.kopo.day04;
/*
 * ********* 
 *  *******  
 *   *****   
 *    ***    
 *     *     
 */
public class Task16 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j < i)
					System.out.print(' ');
				else
					System.out.print('*');
			}
			for(int j = 0; j < 4; j++) {
				if(i+j < 4)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
}

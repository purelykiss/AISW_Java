package kr.ac.kopo.day04;
/*
 *     *   
 *    ***    
 *   *****   
 *  *******  
 * ********* 
 *  *******  
 *   *****   
 *    ***    
 *     *     
 */
public class Task17 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {		//윗부분
			for(int j = 0; j < 5; j++) {	//위 왼쪽부분
				if(i + j <4){
					System.out.print(' ');
				}else {
					System.out.print('*');
				}
			}
			for(int j = 0; j < 4; j++) {	//위 오른쪽부분
				if(j >= i) {
					System.out.print(' ');
				}else {
					System.out.print('*');						
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i < 4; i++){			//아래부분
			for(int j = 0; j < 5; j++) {	//아래 왼쪽부분
				if(j > i) {
					System.out.print('*');
				}else {
					System.out.print(' ');						
				}
			}
			for(int j = 0; j < 4; j++) {	//아래 오른쪽부분
				if(i + j <3){
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}

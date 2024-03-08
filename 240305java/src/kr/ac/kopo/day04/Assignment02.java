package kr.ac.kopo.day04;
/*
 2. 구구단을 출력

   *** 2단 ***
   2 * 1 = 2
   ...
   9 * 9 = 81
 */
public class Assignment02 {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {	//단수
			//제목
			System.out.printf("*** %d단 ***\n", i);	
			
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
}

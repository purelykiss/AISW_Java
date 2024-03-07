package kr.ac.kopo.day02.EX;

/*
 영문자 모음의 아스키 코드 값을 아래의 출력형식에 맞추어 화면에 출력하시오
 -----------------------------------
 영문자 모음의 아스키 코드 값
 -----------------------------------
 A = 65
 E = 69
 I = 73
 O = 79
 U = 85
 */
public class Assignment01 {

	public static void main(String[] args) {
		char[] alpabet = { 'A', 'E', 'I', 'O', 'U' };
		
		for(var item: alpabet)
		{
			System.out.printf("%c = %d\n", item, (int)item);
		}
	}
}

package kr.ac.kopo.day10;
/*
메소드 public int checkChar(String, char)와
public String removeChar(String, char)를 구현하기 위한 클래스
추상메소드:
public int checkChar(String strData, char ch)
- 문자열의 각 내용들을 String.charAt(int)를 사용하여 char ch와 비교하여 동일한 글자의 개수를 리턴한다.
- 대소문자 구별하여 비교한다.
public String removeChar(String oriStr, char delChar)
- 문자열 (oriStr)의 내용을 String.charAt(int)과 String.length()를 이용해
char delChar과 다른 글자의 개수 int num를 구한다.
- 배열의 길이가 num인 char[] items에 String oriStr에서 delChar과 다른 문자열을 찾아 순서대로 넣는다. 
- items를 String으로 변경해서 리턴한다.
 */
public class StringAssignment {
	public static void main(String[] args) {
		StringAssignment sa = new StringAssignment();
		
		System.out.println("public int checkChar(String strData, char ch)");
		System.out.println("<<처리 결과>>");
		System.out.println();
		System.out.println("입력 스트링 : String strData = \"Hello World Java\";");
		
		String strData = "Hello World Java";
		
		System.out.print("a. ch = \'o\'인 경우 => ");
		
		char ch = 'o';
		System.out.println(sa.checkChar(strData, ch) + " 리턴");
		
		System.out.print("b. ch = \'W\'인 경우 => ");
		
		ch = 'W';
		System.out.println(sa.checkChar(strData, ch) + " 리턴");
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("public String removeChar(String oriStr, char delChar)");
		System.out.println("<<처리 결과>>");
		System.out.println();
		System.out.println("입력 스트링 : String oriStr = \"Hello World Java\"");
		
		String oriStr = "Hello World Java";
		
		System.out.print("delChar = \'l\' 인 경우 => ");
		
		char delChar = 'l';
		System.out.println(sa.removeChar(oriStr, delChar) + "리턴");
		
		System.out.print("delChar = \'o\' 인 경우 => ");
		
		delChar = 'o';
		System.out.println(sa.removeChar(oriStr, delChar) + "리턴");
	}
	
	public int checkChar(String strData, char ch) {
		int value = 0;
		for(int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) == ch){
				value++;
			}
		}
		return value;
	}
	
	public String removeChar(String oriStr, char delChar) {
		int num = 0;
		for(int i = 0; i < oriStr.length(); i++) {
			if(oriStr.charAt(i) != delChar)
				num++;
		}
		
		if(num == 0)
			return oriStr;
		
		char[] items = new char[num];
		int j = 0;
		for(int i = 0; i < oriStr.length() && j < num; i++) {
			if(oriStr.charAt(i) != delChar) {
				items[j] = oriStr.charAt(i);
				j++;
			}
		}
		
		return new String(items);
	}
}

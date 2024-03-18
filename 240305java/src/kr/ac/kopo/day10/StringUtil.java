package kr.ac.kopo.day10;
/*
1. 하나의 문자를 입력받아 해당 문자가 대문자이면 true 를 반환하는 isUpperChar( char c ) 메소드를 작성하시오
2. 하나의 문자를 입력받아 해당 문자가 소문자이면 true를 반환하는 isLowerChar(char c) 메소드를 작성하시오
3. 두개의 숫자를 입력받아 큰수를 반환하는 max( int i, int j) 메소드를 작성하시오
4. 두개의 숫자를 입력받아 작은수를 반환하는 min(int i, int j) 메소드를 작성하시오 
5. 문자열을 입력받아 거꾸로 변경하는 reverseString( String str ) 메소드를 작성하시오
6. 문자열을 입력받아 대문자로 변경하는 toUpperString( String str ) 메소드를 작성하시오
7. 문자열을 입력받아 소문자로 변경하는 toLowerString( String str ) 메소드를 작성하시오
 */
public class StringUtil {
	
	public boolean isUpperChar(char c) {	//대문자 코드: 65~90
		if((int)c <= 90 && (int)c >= 90)
			return true;
		else
			return false;
	}
	
	public boolean isLowerChar(char c) {	//소문자 코드: 97~122
		if((int)c <= 122 && (int)c >= 97)
			return true;
		else
			return false;		
	}
	
	public int max(int i, int j) {	//똑같은 경우엔 둘다 같은 수이므로 아무 숫자나 리턴해도 상관X
		if(i > j)
			return i;
		else
			return j;
	}
	
	public int min(int i, int j) {
		if(i < j)
			return i;
		else
			return j;
	}
	
	public String reverseString(String str) {
		char[] c = new char[str.length()];		//String.charAt(int)의 값을 저장하기 위한 변수
		for(int i = 0; i < str.length(); i++) {
			c[str.length() - 1 - i] = str.charAt(i);	//뒤쪽부터 차례대로 값을 채워넣음
		}
		
		return new String(c);
	}
	
	public String toUpperString(String str) {	//대문자와 소문자 차이 = 32, 소문자의 코드가 더 큼
		char[] c = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			char item = str.charAt(i);
			if(isLowerChar(item)) {		//미리 만들어둔 소문자 판별 메소드를 사용
				c[i] = (char)(item - 32);	//소문자면 대문자로 변환
			}else {
				c[i] = item;
			}
		}
		return String.valueOf(c);	//수업시간에 배운 String으로 캐스팅(형변환)방법
	}
	
	public String toLowerString(String str) {
		char[] c = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			char item = str.charAt(i);
			if(isUpperChar(item)) {		//미리 만들어둔 대문자 판별 메소드를 사용
				c[i] = (char)(item + 32);	//소문자면 대문자로 변환
			}else {
				c[i] = item;
			}
		}
		return new String(c);
	}
}

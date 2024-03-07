package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {
		int a = 0, b = 1, c = -1;
		
//		boolean result = ++a > 0 && ++b >= 1 && ++c > 0;
//		boolean result = a++ > 0 || b++ >= 1 || c++ > 0;
//		여기서 b++ >= 1은 참이므로, c에 대한 검사는 하지 않아 c++도 하지 않고,
//		결과적으로 c = -1이다.
		boolean result = b-- >= 0 && c-- > 0 || a-- >= 0;
		
		System.out.println(result);
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
	}

}

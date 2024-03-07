package kr.ac.kopo.day02;

public class OperationMain02 {
	public static void main(String[] args) {
		int firstNum = 12;
		int secondNum = 0;
		
		boolean result = secondNum != 0 && firstNum % secondNum == 0; // % >> Modular
//		0으로 나누면 예외가 나타나므로, 그것을 해결하기 위해
//		secondNum != 0 &&를 앞에 둬, 만약 0이면 &&의 특성에 의해 뒤쪽은 보지않는다!
		System.out.println("배수여부 판단 : " + (result ? "배수다" : "배수가 아니다"));
		System.out.println( "배수여부 판단 : " + ( !result ? "배수가 아니다" : "배수다" ));
		
	}
}

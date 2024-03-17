package kr.ac.kopo.day09;

/*
	생성자에 대해
	1. 클래스명 동일
	2. 반환형 없음
	3. 디폴트 생성자 지원
	   class내에 선언된 생성자가 없는 경우, JVM 자동으로 지원해주는 생성자
	   클래스명() {}
	4. 생성자 오버로드 지원
	5. 목적은 멤버변수(속성) 초기화
 */
class Car{
	/*
	Car() {
		System.out.println("디폴트 생성자 Car() 호출...");
	}
	*/
	Car(String s) {
		System.out.println("Car(String) 생성자 호출...");
	}
	
}

public class ConstructorMain01 {
	public static void main(String[] args) {
		//new Car();	//만약 생성자가 하나이상 존재하면 default 생성자가 없음! 반드시 생성자를 하나이상 만들 경우 디폴트 생성자를 만들것!(아니면 그냥 만드는 습관을)
		new Car("소나타");
	}
}

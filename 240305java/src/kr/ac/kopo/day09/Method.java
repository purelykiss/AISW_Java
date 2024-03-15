package kr.ac.kopo.day09;

public class Method {
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {	//이름이 같이만 매개변수가 다른 메소드 오버로딩 중
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(String s) {	
		System.out.println("call(String) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
}

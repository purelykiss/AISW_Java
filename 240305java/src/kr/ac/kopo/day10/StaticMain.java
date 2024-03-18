package kr.ac.kopo.day10;

class Test{
	int a = 100;
	static int b = 50;
}

public class StaticMain {
	public static void main(String[] args) {
		System.out.println(Test.b);
		
		/*
		Test t = new Test();
		t.a = 30;
		Test t2 = new Test();
		t2.a = 90;
		
		t.b = 10000;
		
		System.out.println(t.a);
		System.out.println(t2.a);
		System.out.println(t.b);
		System.out.println(t2.b);	//t에서 b의 값을 건들였는데 t2에서 b에 접근한 값도 변경된 상황. static의 특징
		*/
	}
}

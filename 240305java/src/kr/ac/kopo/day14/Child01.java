package kr.ac.kopo.day14;

public class Child01 extends Parent{
	private String name;
	private int age;
	
	public Child01() {
		name = "자식01";
		age = 20;
	}
	
	@Override
	public void info() {
		System.out.println("자식 01, " + age + "살");
	}
	
	public void study() {
		System.out.println("공부합");
	}
	
	public void sleep() {
		System.out.println("잠잠");
	}
}

package kr.ac.kopo.day14;

public class Child02 extends Parent{
	private String name;
	private int age;
	
	public Child02() {
		name = "자식02";
		age = 17;
	}
	
	@Override
	public void info() {
		System.out.println("자식 02, " + age + "살");
	}
	
	public void play() {
		System.out.println("논다");
	}
	
	public void sing() {
		System.out.println("노래");
	}
}

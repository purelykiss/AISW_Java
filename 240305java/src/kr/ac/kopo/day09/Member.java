package kr.ac.kopo.day09;

public class Member {
	String	name;
	int		age;
	String	bloodType;	//탭으로 하니 이쁘긴하다
	
	Member(){	//생성자가 없는 경우 클래스 이름을 적고 ctrl + space >> 생성자 생성
		this("알수없음", -1, "알수없음");
	}
	
	Member(String name){
		this(name, -1, "알수없음");
	}
	
	Member(String name, int age){
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.printf("이름 : %s, 나이 : %d, 혈액형 : " + bloodType + "\n", name, age, bloodType);
	}
}

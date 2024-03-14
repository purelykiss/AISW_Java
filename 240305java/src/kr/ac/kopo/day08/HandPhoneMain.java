package kr.ac.kopo.day08;

class Handphone {	//다른클래스 내에 public 클래스를 만들면 안된다! default 클래스는 된다
	String name;
	String phone;
	String company;
}

public class HandPhoneMain {
	public static void main(String[] args) {
		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.phone = "010-1111-2222";
		hp.company = "삼성";
		
		Handphone hp2 = new Handphone();
		hp2.name = "강길동";
		hp2.phone = "010-3333-4444";
		hp2.company = "애플";
		
		Handphone hp3 = new Handphone();
		hp3.name = "고길동";
		hp3.phone = "010-5555-6666";
		hp3.company = "모토로라";
		
		Handphone[] hpArr  = {hp, hp2, hp3};
		
		for(Handphone p : hpArr) {
			System.out.println("소유주명 : " + p.name);
			System.out.println("핸드폰번호 : " + p.phone);
			System.out.println("회사명 : " + p.company);
		}
		
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i < hpArr.length; i++) {
			System.out.println("소유주명 : " + hpArr[i].name);
			System.out.println("핸드폰번호 : " + hpArr[i].phone);
			System.out.println("회사명 : " + hpArr[i].company);
		}
	}
}

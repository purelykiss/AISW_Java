package kr.ac.kopo.day14.abs02;
/*
	출력할 프린터를 선택하세요 (1. LG 2. 삼성) => 1
	LG 프린터에서 출력됨
	출력할 프린터를 선택하세요 (1. LG 2. 삼성) => 2
	삼성 프린터에서 출력됨
 */
public class UserMain {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.process();
	}
}

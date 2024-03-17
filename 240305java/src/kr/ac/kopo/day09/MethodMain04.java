package kr.ac.kopo.day09;

public class MethodMain04 {
	public static void main(String[] args) {
		
		GugudanUtil gu = new GugudanUtil();
		
		int danStart = gu.inputDan("시작단을 입력해주세요 : ");
		int danEnd = gu.inputDan("끝단을 입력해주세요 : ");
		
		gu.print(danStart, danEnd);
		//gu.printAll();
	}
}

package kr.ac.kopo.ui.base;

/*
 * 굳이 인터페이스와 추상 클래스를 따로 만든 이유:
 * 아마 추상메소드는 클래스가 꼭 만들 필요가 있는데 겹치는 부분,
 * 그리고 다른 객체로 부터 호출받지 않을 것을 넣는 것 같다.
 * 
 * 인터페이스를 만든 이유는 아마
 * 다른 객체에서 호출할 메서드가 오롯이 이거다!
 * 라고 코드로써 표현하는 것 같다.
 * 
 * 
 * 둘다 겹치는 부분은 맞다.
 * 하지만 추상 클래스에선 내수용만
 * 인터페이스에선 외수용만 넣은 것 같다.
 */


public interface IBoardUI {
	public void execute() throws Exception;
}
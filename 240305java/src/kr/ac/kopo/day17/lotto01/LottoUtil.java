package kr.ac.kopo.day17.lotto01;

import java.util.Scanner;

public class LottoUtil {

	LottoSet[] ls;
	Scanner sc;
	private int curLotteSet;
	
	public LottoUtil(LottoSet[] ls){
		this.ls = ls;
		this.sc = new Scanner(System.in);
		curLotteSet = -1;
	}
	
	public void setLotto(int num) throws Exception{
		if(num >= 0 && num < ls.length)
			curLotteSet = num;
		else
			throw new Exception("ls 배열의 범위를 넘었습니다.");
	}
	public int[] getLotto() {
		return ls[curLotteSet].setNumber();
	}
	
	public void lobby() {
		System.out.println("다음은 로또번호 출력 방법들입니다.");
		for(int i = 0; i < ls.length; i++) {
			
			System.out.println((i+1) + ". " + ls[i].getName());
		}
		System.out.println("번호를 고르십시오");	
	}
	
	public void wrongInput() {
		System.out.println("잘못된 입력입니다. 번호 1~"+ (ls.length+1) + "중 하나를 선택해 입력하십시오.");
	}
	
	public boolean getNum() {	//로비의 출력 호출, 번호 입력, 어떤 로또 방법을 사용할지
		lobby();
		String str = sc.nextLine();
		
		int num = -1;
		
		try {
			num = Integer.parseInt(str);
		}catch(Exception e) {
			wrongInput();
			return false;
		}
		
		try {
			setLotto(num);
		}catch(Exception e) {
			wrongInput();
			return false;
		}
		
		return true;
	}
	
}

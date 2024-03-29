package kr.ac.kopo.day17.lotto01;

import java.util.Arrays;
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
		if(num >= 1 && num <= ls.length)
			curLotteSet = num-1;
		else if(num == ls.length+1)
			System.exit(0);
		else
			throw new Exception("ls 배열의 범위를 넘었습니다.");
	}
	
	public String getLottoName() {
		return ls[curLotteSet].getName();
	}
	
	public int[] getLottoNum() {
		return ls[curLotteSet].setNumber();
	}
	
	public void ActivateLotto() {
		System.out.println("다음은 로또 번호 뽑기 방법입니다.");
		System.out.println(getLottoName());
		System.out.println("번호를 뽑습니다 : ");
		System.out.println(Arrays.toString(getLottoNum()));
	}
	
	public void lobby() {
		System.out.println("다음은 로또번호 출력 방법들입니다.");
		for(int i = 0; i < ls.length; i++) {
			
			System.out.println((i+1) + ". " + ls[i].getName());
		}
		System.out.println((ls.length+1) + ". 종료");
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

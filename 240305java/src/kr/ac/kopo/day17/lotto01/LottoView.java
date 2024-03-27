package kr.ac.kopo.day17.lotto01;

public class LottoView {
	LottoUtil lu;
	
	public LottoView(LottoSet[] ls) {
		lu = new LottoUtil(ls);
	}
	
	public void process() {
		getInput();
		activateLottoSet();
	}
	
	public void getInput() {
		boolean flagLottoSetDecided = false;
		
		while(!flagLottoSetDecided){
			flagLottoSetDecided = lu.getNum();	//올바른 값을 가질때까지 입력받음 
		}
	}
	
	public void activateLottoSet() {
		
	}
}

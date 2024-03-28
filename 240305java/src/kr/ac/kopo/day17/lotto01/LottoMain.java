package kr.ac.kopo.day17.lotto01;

public class LottoMain {
	public static void main(String[] args) {
		LottoSet[] ls = {new LottoWithListDuplication(), new LottoWithListNoDuplication(), new LottoWithSetNoDuplication()};
		new LottoView(ls).process();
	}
}

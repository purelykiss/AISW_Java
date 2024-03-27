package kr.ac.kopo.day17.lotto01;

public abstract class LottoSet {
	private String name;
	
	public LottoSet(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract int[] setNumber();
}

package kr.ac.kopo.day17.lotto01;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LottoWithListDuplication extends LottoSet{
	static String name = "Using List, number Duplication Accepted";
	Random rd;
	
	public LottoWithListDuplication() {
		super(name);
		rd = new Random();
	}
	
	public int[] setNumber() {
		List<Integer> nums = new LinkedList<Integer>();
		for(int i = 0; i < NUM_OF_LOTTO; i++) {
			nums.add(rd.nextInt(0,9));	
		}
		
		int[] values = new int[nums.size()];
		
		for(int i = 0; i < nums.size(); i++) {
			values[i] = nums.get(i);
		}
		
		return values;
	}
}

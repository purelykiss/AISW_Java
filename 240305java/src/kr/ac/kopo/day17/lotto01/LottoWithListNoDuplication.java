package kr.ac.kopo.day17.lotto01;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LottoWithListNoDuplication extends LottoSet{
	static String name = "Using List, number Duplication Declined";
	Random rd;
	
	public LottoWithListNoDuplication() {
		super(name);
		rd = new Random();
	}
	
	public int[] setNumber() {
		List<Integer> nums = new LinkedList<Integer>();
		for(int i = 0; i < NUM_OF_LOTTO; i++) {
			int value = rd.nextInt(0,9);
			if(nums.contains(value)) {
				i--;
			}else {
				nums.add(value);
			}
				
		}
		
		int[] values = new int[nums.size()];
		
		for(int i = 0; i < nums.size(); i++) {
			values[i] = nums.get(i);
		}
		
		return values;
	}
}

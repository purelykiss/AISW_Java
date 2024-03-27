package kr.ac.kopo.day17.lotto01;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoWithSetNoDuplication extends LottoSet{
	static String name = "Using Set, number Duplication Declined";
	Random rd;

	public LottoWithSetNoDuplication() {
		super(name);
		rd = new Random();
	}
	
	public int[] setNumber() {
		Set<Integer> nums = new TreeSet<Integer>();
		while(nums.size() < NUM_OF_LOTTO) {
			nums.add(rd.nextInt(0,9));
		}
		
		int[] values = new int[nums.size()];
		int i = 0;
		for(int item : nums) {
			values[i] = item;
			i++;
		}
		
		return values;
	}
}

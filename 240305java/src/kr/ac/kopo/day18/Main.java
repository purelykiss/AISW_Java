package kr.ac.kopo.day18;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> nums = new LinkedList();
		
		for(int i = 0; i < 10; i++) {
			nums.add(Integer.parseInt(br.readLine()));
		}
		
		List<Integer> leftOver = new LinkedList();
		
		for(int i = 0; i < 10; i++) {
			int tmp = nums.indexOf(i) % 42;
			if(!leftOver.contains(tmp)){
				leftOver.add(nums.indexOf(i));
			}
		}
		
		bw.write(Integer.toString(leftOver.size()));
		
        bw.close();
	}
}

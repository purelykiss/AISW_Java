package kr.ac.kopo.day18;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		List<Integer> num = new LinkedList<Integer>();
		
		for(int i = str.length()-1; i >= 0; i--) {
			num.add(str.charAt(i) - '0');	
		}
		
		int over = 0;
		
		for(int i = 0; i < num.size(); i++) {
			num.set(i, num.get(i) * 4 + over);
			over = num.get(i) / 10;
			num.set(i, num.get(i) % 10);
			if(i == num.size()-1 && over > 0){
				num.add(0);
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = num.size()-1; i >= 0; i--) {
			bw.write(Integer.toString(num.get(i)));	
		}

        bw.close();
	}
}

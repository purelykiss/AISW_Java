package kr.ac.kopo.day18;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		Set<Integer> front = new HashSet<Integer>();
		Set<Integer> back = new HashSet<Integer>();
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if (!front.add(num1)){
				front.remove(num1);
			}
			if (!back.add(num2)){
				back.remove(num2);
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write((Integer)(front.iterator().next()) + " " +(Integer)(back.iterator().next()));

        bw.close();
	}
}

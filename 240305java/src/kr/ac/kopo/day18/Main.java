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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken());
		int move =  Integer.parseInt(st.nextToken());
		
		int[] balls = new int[max];
		for(int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		for(int i = 0; i < move; i++) {
			st = new StringTokenizer(br.readLine());
			int change1 = Integer.parseInt(st.nextToken());
			int change2 = Integer.parseInt(st.nextToken());
			
			int tmp = balls[change1-1];
			balls[change1-1] = balls[change2-1];
			balls[change2-1] = tmp;
		}
		
		boolean flagSpace = false;
		for(int i = 0; i < balls.length; i++) {
			if(flagSpace) {
				flagSpace = false;
				bw.write(" ");
			}
			flagSpace = true;
			
			bw.write(Integer.toString(balls[i]));
		}
		
		
        bw.close();
	}
}

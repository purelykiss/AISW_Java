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
		
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		boolean flagSpace = false;
		for(int i = 0; i < cnt; i++) {
			if(flagSpace) {
				flagSpace = false;
				bw.write("\n");
			}
			flagSpace = true;
			
			st = new StringTokenizer(br.readLine());
			int repeat = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < repeat; k++) {
					bw.write(str.charAt(j));
				}
			}
		}
		
        bw.close();
	}
}

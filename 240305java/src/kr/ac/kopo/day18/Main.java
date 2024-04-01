package kr.ac.kopo.day18;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] alphabet = new int[26];

		boolean flagSpace = false;
		
		for(int i = 0; i < alphabet.length; i++) {
			if(flagSpace) {
				bw.write(" ");
				flagSpace = false;
			}
			flagSpace = true;
			
			alphabet[i] = -1;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == (char)('a' + i)) {
					alphabet[i] = j;
					break;
				}
			}
			
			bw.write(Integer.toString(alphabet[i]));
		}

        bw.close();
	}
}

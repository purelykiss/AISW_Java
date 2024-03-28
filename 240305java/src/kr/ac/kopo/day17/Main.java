package kr.ac.kopo.day17;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		int[] nums = new int[index];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
        for(int i = 0; i < nums.length; i++) {
        	nums[i] = Integer.parseInt(st.nextToken());
		}
        
        int find = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for(int item : nums) {
        	if(item == find)
        		cnt++;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(cnt));
        bw.close();
	}
}

package kr.ac.kopo.day02;

import java.util.Random;

public class Homework11 {

	public static void main(String[] args) {
		
		// 0 ~ 99 사이의 임의의 정수 4개 추출
		
		Random r = new Random();
		
		int a = r.nextInt(100);
		int b = r.nextInt(100);
		int c = r.nextInt(100);
		int d = r.nextInt(100);
		
		System.out.printf("%d %d %d %d\n",a,b,c,d);
		
		int max = a > b ? a : b;
		if(c > max) {
			max = c;
		}
		if(d > max) {
			
			max = d;
		}
		System.out.println("가장 큰수 :"+max);
	}

}

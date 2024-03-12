package kr.ac.kopo.day06;

import java.util.Arrays;

public class ArrayMain04 {
	public static void main(String[] args) {
//		int[] arr = new int[] {10, 20, 30, 40, 50};
		int[] arr = {10, 20, 30, 40, 50};
		
		/*
		arr[0] = 10;
		arr[1] = 20;	//arr[i] = (i+1) * 10; 
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		*/
		/*
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		*/
		
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
//		arr = {8, 7, 6, 5, 4, 3, 2, 1,};	//선언에서만 이런 형식이 가능하다. 이미 만들어져있으면 에러
		arr = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
		
		
//		arr = new int [8];
		
		/*
		 * 배열의 모든 원소를 출력하는 방식 >> 3가지
		 * 1. index를 이용한 출력
		 * 2. 1_5ver의 for문(혹은 for each문)을 이용한 출력
		 * 3. Arrays.toString() 메소드를 이용한 출력
		 */
		
		System.out.println("< index를 이용한 출력방식 >");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("< 1.5버전의 for문을 이용한 출력 >");
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		System.out.println("< Arrays.toString()을 이용한 출력 >");
		System.out.println(Arrays.toString(arr));	//출력: [8, 7, 6, 5, 4, 3, 2, 1]
		
	}
}

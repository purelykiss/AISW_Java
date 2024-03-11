package kr.ac.kopo.day05;

public class ArrayMain02 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];	//[0] ~ [4]
		
		/*
		int max = 5;
		int[] arr = new int[max];	//변수를 이용해 배열을 선언할 수도 있다!
		 */
		
		System.out.println("arr : " + arr);
		System.out.println("arr[0] : " + arr[0]);
		//System.out.println("arr[5] : " + arr[5]);		//오류!
		//System.out.println("arr[-1] : " + arr[-1]);	//같은오류!
		System.out.println("배열의 크기 : " + arr.length + "개");
		
		arr = new int[3];	//이전에 쓴 new int[5]는 유령상태가 된다!
		System.out.println("배열의 크기 : " + arr.length + "개");
	}
}

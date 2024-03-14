package kr.ac.kopo.day08;

public class MethodMain02 {
	//호출자: main, 피호출자: getSum
	static int getSum(int a, int b) {
		int sum = 0;
		int i = a;
		
		while(i <= b) {
			sum += i++;
		}
		
		return sum;
		/*
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		*/
		
		//System.out.println(a + " ~ " + b + "사이의 총합 : " + sum);
	}
	
	public static void main(String[] args) {
		int a = 1, b = 5;
		
		int total = getSum(a, b);
		
		System.out.printf("%d ~ %d 사이의 총합 : %d\n", a, b, total);
	}
}

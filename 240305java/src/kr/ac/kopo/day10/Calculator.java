package kr.ac.kopo.day10;

import java.util.Scanner;

/*
추상클래스: 클래스의 이름과 작동 방식을 상세히 기술하지만 실제로 돌아가는 코드는 아닌 것
Calculator의 추상클래스:
1. public int input() throws Exception:
	"정수 : "를 출력하고 사용자의 정수 입력을 Scanner로 받음.
	입력받은 정수를 리턴한다.
2. public int add(int a, int b):
	인자로 두 정수를 입력받고
	%d + %d = %d의 형식으로 식과 답을 출력한다.
	두 수의 합을 int로 리턴한다.
3. public int subtract(int a, int b):
	인자로 두 정수를 입력받고
	%d - %d = %d의 형식으로 식과 답을 출력한다.
	먼저 입력받은 수에서 나중에 입력받은 수를 빼서 나온 결과를 int로 리턴한다.
4. public int multiply(int a, int b):
	인자로 두 정수를 입력받고
	%d * %d = %d의 형식으로 식과 답을 출력한다.
	두수의 곱을 int로 리턴한다.
5. public int divide(int a, int b) throws Exception:
	인자로 두 정수를 입력받고
	%d / %d = %.1f의 형식으로 식과 답을 출력한다.
	먼저 입력받은 수에서 나중에 입력받은 수를 나눠 나온 결과를 double로 리턴한다.
6. public boolean isPrime(int a)
	인자로 하나의 정수를 입력받고
	%-2d 소수체크 : %b의 형식으로 인자와 소수 여부를 출력한다.
 */
public class Calculator {
	Scanner sc;
	
	public Calculator() {
		sc = new Scanner(System.in);
	}
	
	public int input() throws Exception{
		System.out.print("정수 : ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public int add(int a, int b) {
		int value = a + b;
		System.out.printf("%d + %d = %d\n", a, b, value);
		return value;
	}
	
	public int subtract(int a, int b) {
		int value = a - b;
		System.out.printf("%d - %d = %d\n", a, b, value);
		return value;
	}
	
	public int multiply(int a, int b) {
		int value = a * b;
		System.out.printf("%d * %d = %d\n", a, b, value);
		return value;
	}
	
	public int divide(int a, int b) throws Exception{
		int value = a / b;
		System.out.printf("%d / %d = %d\n", a, b, value);
		return value;
	}
	
	public boolean isPrime(int a) {
		boolean flagPrime = true;
		if(a < 2)	//소수의 정의상 1보다 큰 양의정수여야한다.
			flagPrime = false;
		else {
			for(int i = 2; i < a; i++) {	//자기자신 외에 나머지없이 나뉘는 수가 없어야한다. 
				if(a % i == 0){
					flagPrime = false;
					break;		//약수가 하나라도 있으면 소수가 아니므로 for문 탈출
				}
			}
		}
		System.out.printf("%-2d 소수체크 : %b", a, flagPrime);
		
		return flagPrime;
	}
}

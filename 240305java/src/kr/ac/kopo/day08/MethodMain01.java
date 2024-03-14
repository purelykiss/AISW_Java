package kr.ac.kopo.day08;

/*
  **********
  Hello
  **********
  Hi
  **********
  Good-bye
  **********
 */

public class MethodMain01 {
	
	static void printStar(char ch, int cnt) {
		for(int i = 0; i < cnt; i++) {
			System.out.print(ch);	
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printStar('*', 10);
		System.out.println("Hello");
		printStar('!', 5);
		System.out.println("Hi");
		printStar('-', 20);
		System.out.println("Good-bye");
		printStar('#', 16);
	}
}

package kr.ac.kopo.day02;

import java.util.Scanner;


public class Homework08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] Exchange = {1000, 500, 100, 50, 10};
		int[] numOfEx = new int[5];
		int cost;
		int pay;
		int leftover;
		
		System.out.print("물건값을 입력 : ");
		cost = sc.nextInt();
		sc.nextLine();
		
		System.out.print("지불한 돈의 액수 : ");
		pay = sc.nextInt();
		sc.nextLine();
	
		if(pay > cost)
			leftover = pay - cost;
		else {
			sc.close();
			return;
		}
		
		System.out.println("거스름돈 : " + leftover);
		
		int tmpLeftover = leftover;
		for(int i = 0; i < Exchange.length; i++)
		{
			numOfEx[i] = tmpLeftover / Exchange[i];
			System.out.printf("%d 원 : %d 개\n", Exchange[i], numOfEx[i]);
			tmpLeftover %= Exchange[i];
		}
		
		sc.close();
	}

}

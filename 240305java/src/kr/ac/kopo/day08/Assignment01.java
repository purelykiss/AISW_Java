package kr.ac.kopo.day08;

import java.util.Scanner;

/*
다음의 결과를 보이는 프로그램 작성

아이스크림 몇개 구입할래? 4

** 1's 아이스크림 구매정보 입력 **
아이스크림명 : 비비빅
아이스크림 가격 : 1000

** 2's 아이스크림 구매정보 입력 **
아이스크림명 : 월드콘
아이스크림 가격 : 2000

** 3's 아이스크림 구매정보 입력 **
아이스크림명 : 메로나
아이스크림 가격 : 1000

** 4's 아이스크림 구매정보 입력 **
아이스크림명 : 거북알
아이스크림 가격 : 1500

< 총 4개의 아이스크림 구매정보 출력 >
-----------------------------------------------------------
번호	아이스크림명		아이스크림 가격
-----------------------------------------------------------
1	비비빅			1000원
2	월드콘			2000원
3	메로나			1000원
4	거북알			1500원
-----------------------------------------------------------
	총계 : 5500원
 */
public class Assignment01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int amount = 0;
		int totalCost = 0;
		Icecream[] items;
		
		//개수 입력
		System.out.print("아이스크림 몇개 구입할래? ");
		amount = Integer.parseInt(sc.nextLine());
		items = new Icecream[amount];
		
		
		//구매 정보
		for(int i = 0; i < amount; i++) {
			System.out.printf("** %d's 아이스크림 구매정보 입력 **\n", i+1);
			items[i] = new Icecream();
			
			System.out.print("아이스크림명 : ");
			items[i].name = sc.nextLine();
			
			System.out.print("아이스크림 가격 : ");
			items[i].cost = Integer.parseInt(sc.nextLine());
			
			System.out.println();
		}
		
		//출력
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", amount);
		printLine();
		System.out.printf("번호\t아이스크림명\t아이스크림 가격\n");
		printLine();
		for(int i = 0; i < amount; i++) {
			System.out.printf("%d\t%s\t\t%d원\n", i+1, items[i].name, items[i].cost);
			totalCost += items[i].cost;
		}
		printLine();
		System.out.println("\t총계 : " + totalCost + "원");
		
		sc.close();
		
	}
	
	public static void printLine() {
		System.out.println("-----------------------------------------------------------");
	}
}


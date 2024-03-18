package kr.ac.kopo.day10;

import java.util.Scanner;

/*
0314 아이스크림 파는 코드.
목표: 아이스크림 가격의 총합을 구하는 메서드를 만들어야함.
추상 메서드:
public static int SumOfIcecream(Icecream[] icecreams)
	icecream 배열을 받으면 null인 경우를 제외하고
	각 icecream의 가격을 Calculator.Add(int,int)를 통해 계산함.
	결과값을 sum에 넣어 int로 리턴함.
 */
public class IcecreamAssignment {
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
//			totalCost += items[i].cost;		//삭제한 기존의 가격 총합 코드
		}
		printLine();
		
		totalCost = SumOfIcecream(items);	//추가한 신규 메서드를 이용한 가격 총합 코드
		System.out.println("\t총계 : " + totalCost + "원");
		
		sc.close();
		
	}
	
	public static void printLine() {
		System.out.println("-----------------------------------------------------------");
	}
	
	public static int SumOfIcecream(Icecream[] icecreams) {	//추상메소드를 토대로 추가한 메서드
		int sum = 0;
		Calculator cal = new Calculator();
		
		for(Icecream item : icecreams) {
			if(item == null)
				continue;
			sum = cal.add(sum, item.cost);
		}
		
		return sum;
	}
}


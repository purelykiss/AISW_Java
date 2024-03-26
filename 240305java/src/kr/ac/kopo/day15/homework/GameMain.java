package kr.ac.kopo.day15.homework;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		Game[] games = {new ScissorsRockPaper(), new Dice()};
		boolean flagFinish = false;
		Scanner sc = new Scanner(System.in);
		
		while(flagFinish) {
			System.out.println("게임을 선택하세요");
			System.out.println(" A. 가위바위보");
			System.out.println(" B. 주사위 값 맞추기");
			System.out.println(" C. 종료");
			
			boolean flag = false;
			int choice = 0;
			
			switch(sc.nextLine()) {
			case "A":
				System.out.println("가위바위보 게임입니다.");
				System.out.println("가위바위보중 하나를 선택하세요.");
				System.out.println("(1:가위, 2:바귀, 3:보)");
				while(!flag) {
					flag = true;
					String str = sc.nextLine();
					switch(str) {
					case "1":
						choice = 1;
						break;
					case "2":
						choice = 2;
						break;
					case "3":
						choice = 3;
						break;
					default:
						System.out.println("다시 입력하세요");
						flag = false;
						break;
					}
				}
				games[0].startGame(choice);
				break;
			case "B":
				System.out.println("주사위 값 맞추기 게임입니다.");
				System.out.println("주사위를 선택하세요(1~6값 중 하나)");
				while(!flag) {
					flag = true;
					String str = sc.nextLine();
					switch(str) {
					case "1":
						choice = 1;
						break;
					case "2":
						choice = 2;
						break;
					case "3":
						choice = 3;
						break;
					case "4":
						choice = 4;
						break;
					case "5":
						choice = 5;
						break;
					case "6":
						choice = 6;
						break;
					default:
						System.out.println("다시 입력하세요");
						flag = false;
						break;
					}
				}
				games[1].startGame(choice);
				break;
			case "C":
				flagFinish = true;
				break;
			default:
				System.out.println("다시입력하세요");
				break;
			}
		}
	}
}

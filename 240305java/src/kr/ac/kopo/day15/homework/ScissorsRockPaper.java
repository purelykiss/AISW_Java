package kr.ac.kopo.day15.homework;

import java.util.Random;

public class ScissorsRockPaper implements Game {
	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	Random rd;
	
	public ScissorsRockPaper() {
		rd = new Random();
	}
	
	@Override
	public int startGame(int you) {
		int me = rd.nextInt(1,3);
		
		if(me == you) {
			System.out.println("비겼습니다");
			return 0;
		}
		
		if(me == 1) {
			if(you == 3) {
				System.out.println("You lose");
				return 0;
			}
			else {
				System.out.println("You win");
				return 1;
			}
		}else if(me == 2) {
			if(you == 1) {
				System.out.println("You lose");
				return 0;
			}else {
				System.out.println("You win");
				return 1;
			}
		}else{
			if(you == 1) {
				System.out.println("You win");
				return 1;
			}else {
				System.out.println("You lose");
				return 0;
			}
		}
	}
}

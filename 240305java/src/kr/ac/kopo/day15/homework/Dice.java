package kr.ac.kopo.day15.homework;

import java.util.Random;

public class Dice implements Game {

	Random rd;
	
	public Dice() {
		rd = new Random();
	}
	
	@Override
	public int startGame(int you) {
		int me = rd.nextInt(1,6);
		if(me == you) {
			System.out.println("You win");
			return 1;
		}
		else {
			System.out.println("You lose");
			return 0;
		}
	}

}

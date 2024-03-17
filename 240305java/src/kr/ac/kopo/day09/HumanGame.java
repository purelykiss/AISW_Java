package kr.ac.kopo.day09;

import java.util.Random;

public class HumanGame implements Scene{
	private String ID;
	boolean flagFirstCycle;

	Random rd;
	enum GameState { SET_ANSWER, CHECK_CHANCE, GUESS, CHECK_ANSWER, WIN, LOSE, FINISH }
	GameState curState;
	final int ANSWER_COLUMN = 3;
	int[] answer;
	int[] guess;
	final int MAX_CHANCE = 10;
	int curChance;
	
	
	public HumanGame() {
		ID = "humanGame";
		rd = new Random();
		initialize();
	}
	
	private void initialize() {
		answer = null;
		guess = null;
		curState = GameState.SET_ANSWER;
		curChance = MAX_CHANCE;
	}

	@Override
	public String getID() {
		return ID;
	}

	@Override
	public void activate() {
		if(flagFirstCycle) {
			onStart();
			flagFirstCycle = false;
		}
		
		switch(curState) {
		case SET_ANSWER:
			setAnswer();
			break;
		case CHECK_CHANCE:
			checkChance();
			break;
		case GUESS:
			guess();
			break;
		case CHECK_ANSWER:
			checkAnswer();
			break;
		case WIN:
			win();
			break;
		case LOSE:
			lose();
			break;
		case FINISH:
		default:
			finish();
			break;
		}
	}
	
	void setAnswer() {
		answer = new int[ANSWER_COLUMN];
		for(int i = 0; i < answer.length; i++) {
			boolean flagValid = false;
			while(!flagValid) {
				flagValid = true;
				answer[i] = rd.nextInt(0, 9);
				for(int j = 0; j < i; j++) {
					if(answer[i] == answer [j]) {
						flagValid = false;
						break;
					}
				}
			}
		}
		
		curState = GameState.CHECK_CHANCE;
	}
	
	void checkChance() {
		System.out.println("남은 기회: " + curChance);
		System.out.println();
		System.out.println();
		if(curChance > 0)
			curState = GameState.GUESS;
		else
			curState = GameState.LOSE;
	}
	
	void guess() {
		guess = new int[ANSWER_COLUMN];
		for(int i = 0; i < guess.length; i++) {
			boolean flag = false;
			while(!flag) {
				System.out.print((i+1) + "번째 칸 숫자를 입력하시오 : ");
				guess[i] = InputManager.instance.nextInt();
				if(guess[i] > 9 || guess[i] < 0) {
					System.out.println("범위 밖입니다. 다시 입력하십시오.");
					System.out.println();
				}else {
					for(int j = 0; j < guess.length; j++) {
						if(j <= i)
							System.out.print(guess[j] + " ");
						else
							System.out.print("_ ");
					}
					System.out.println();
					System.out.println();
					flag = true;
				}
			}
		}
		curState = GameState.CHECK_ANSWER;
	}

	void checkAnswer() {
		int strike = 0;
		int ball = 0;
		
		for(int i = 0; i < guess.length; i++) {
			for(int j = 0; j < answer.length; j++) {
				if(answer[i] == guess[j]) {
					if(i == j) {
						strike++;
					}
					else {
						ball++;
					}
				}
			}
		}
		
		System.out.println("입력한 값: ");
		for(int item : guess) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println("스트라이크\t: " + strike);
		System.out.println("볼\t\t: " + ball);
		System.out.println();
		System.out.println();
		
		curChance--;
		
		if(strike >= ANSWER_COLUMN) {
			curState = GameState.WIN;
		}else {
			curState = GameState.CHECK_CHANCE;			
		}
	}
	
	void win() {
		System.out.println("정답!!! 맞추셨습니다!!!");
		System.out.println("승리했습니다!!!");
		System.out.println();
		System.out.println();
		curState = GameState.FINISH;
	}
	
	void lose() {
		System.out.println("기회가 소진되었습니다...");
		System.out.print("정답: ");
		for(int item : answer) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println();
		curState = GameState.FINISH;
	}
	
	void finish() {
		System.out.println("엔터로 로비로...");
		InputManager.instance.nextLine();
		System.out.println();
		System.out.println();
		SceneManager.instance.changeScene("lobby");
	}
	
	@Override
	public void onStart() {
		initialize();
		
	}

	@Override
	public void onEnd() {
		flagFirstCycle = true;
	}
	
}

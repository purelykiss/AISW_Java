package kr.ac.kopo.day09;

public class Lobby implements Scene{
	private String ID;
	boolean flagFirstCycle;
	
	
	
	public Lobby() {
		ID = "lobby";
		initialize();
	}
	
	private void initialize() {
	}

	@Override
	public void activate() {
		if(flagFirstCycle) {
			onStart();
			flagFirstCycle = false;
		}
		
		System.out.println("야구 게임!!");
		System.out.println("1. 직접플래이\t2. AI 플래이 관전(미구현)\t3. 종료");
		System.out.print("입력: ");
		
		switch(InputManager.instance.nextInt()) {
		case 1:
			SceneManager.instance.changeScene("humanGame");
			break;
		case 2:
			System.out.println("미구현");
			break;
		case 3:
			SceneManager.instance.setFlagEndGame(true);
			break;
		}
		
		System.out.println();
		System.out.println();
	}

	@Override
	public void onStart() {
		initialize();
	}

	@Override
	public void onEnd() {
		flagFirstCycle = true;
	}
	
	@Override
	public String getID() {
		return ID;
	}

}

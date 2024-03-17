package kr.ac.kopo.day09;

public class Assignment01 {
	public static void main(String[] args) {
		Scene[] scenes = { new Lobby(), new HumanGame(), null };
		SceneManager.createInstance(scenes);
		InputManager.createInstance();
		
		while(!SceneManager.instance.getFlagEndGame()) {
			SceneManager.instance.activate();
		}
		
		InputManager.instance.close();
	}
}

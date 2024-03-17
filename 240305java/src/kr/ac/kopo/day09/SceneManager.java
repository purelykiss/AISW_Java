package kr.ac.kopo.day09;

public class SceneManager {
	public static SceneManager instance;
	private Scene[] Scenes;
	private Scene curScene;
	private boolean flagEndGame;
	
	private SceneManager(Scene[] scenes) {
		Scenes = scenes;
		if(scenes.length > 0)
			curScene = scenes[0];
		flagEndGame = false;
	}
	
	public static void createInstance(Scene[] scenes) {
		if(instance == null)
			instance = new SceneManager(scenes);
	}
	
	public void activate() {
		curScene.activate();
	}
	
	public void changeScene(String sceneID) {
		if(curScene.getID().equals(sceneID))
			return;
		
		boolean flagValidID = false;
		Scene scene = null;
		for(Scene item : Scenes) {
			if(item != null && item.getID().equals(sceneID)) {
				scene = item;
				flagValidID = true;
			}
		}
		
		if(!flagValidID) {
			return;	
		}
		
		curScene.onEnd();
		curScene = scene;
	}
	
	public void setFlagEndGame(boolean flag) {
		flagEndGame = flag;
	}
	
	public boolean getFlagEndGame() {
		return flagEndGame;
	}
}

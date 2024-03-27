package kr.ac.kopo.day17;

public class CEO {

	private static CEO obj;
	
	private CEO() {
		
	}
	
	public static CEO getInstance() {
		if(CEO.obj == null)
			CEO.obj = new CEO();
		return obj;
	}
}

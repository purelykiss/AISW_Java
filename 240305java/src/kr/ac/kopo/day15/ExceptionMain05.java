package kr.ac.kopo.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class ExceptionMain05 {
	
	public static void a(){
		try {
			FileReader fr = new FileReader("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void b() throws Exception{
		Random rd = new Random();
		int random = rd.nextInt(3);
		int[] nums = new int[2];
		nums[random] = random;
		
		String str = null;
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		System.out.println("-----------------start-----------------");
		a();
		try{
			b();			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----------------end-------------------");
	}
}

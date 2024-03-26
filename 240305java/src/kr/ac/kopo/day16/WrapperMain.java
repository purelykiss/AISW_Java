package kr.ac.kopo.day16;


/*
 					java.lang
 	기본자료형			참조자료형(Wrapper class)
 	boolean			Boolean
 	char			Character
 	byte			Byte
 	short			Short
 	int				Integer
 	long			Long
 	float			Float
 	double			Double
 */

public class WrapperMain {

	public static void main(String[] args) {

		int i = 100;
		Integer i2 = new Integer(100);
		
		int i3 = new Integer(100);	// auto unboxing
		
		Integer i4 = 100;	// auto boxing
		
		System.out.println(i);
		System.out.println(i2);
		
		
	}
}









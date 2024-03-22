package kr.ac.kopo.day14;

public class CastMain01 {
	public static void main(String[] args) {
		Parent obj = getObject();
		
		print(new Child01());
		print(new Child02());
		
		Parent p = new Child01();
		p.info();
		
		p = new Child02();
		p.info();
		
		p = new Parent();
		p.info();
		/*
		print(new Child01());
		print(new Child02());		
		print(new Parent());
		*/
		
		/*
		Child02 c02 = new Child02();
		print(c02);
//		c02.play();
//		c02.sing();
//		c02.info();
		
		Child01 c01 = new Child01();
		print(c01);
//		c01.info();
//		c01.study();
//		c01.sleep();
		
		Parent p = new Parent();
		print(p);
//		p.info();
		 */
	}
	/*
	public static void print(Child02 c02) {
		c02.info();
	}
	
	public static void print(Child01 c01) {
		c01.info();
	}
	*/
	public static void print(Parent p) {
		p.info();
	}
	
	public static Parent getObject() {
		//return new Parent();
		return new Child01();
		
	}
}

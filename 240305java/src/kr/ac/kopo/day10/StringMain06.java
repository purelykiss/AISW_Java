package kr.ac.kopo.day10;

public class StringMain06 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "";
		for(int i = 1; i < 300000; i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		
		//System.out.println(str);
		System.out.println("소요된 시간: " + (end - start));
		System.out.println();
		

		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();	//동기
		for(int i = 1; i < 300000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		
		//System.out.println(sb);
		System.out.println("소요된 시간: " + (end - start));
	}
}

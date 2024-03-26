package kr.ac.kopo.day16;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		int a = list2.get(0);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add(new String("good"));

		String str = list.get(1);
		
		/*
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(12.34);
		list.add("hello");
		list.add(new Random());
		
		Random r = (Random)list.get(2);
		System.out.println(r.nextInt(10));
		*/
	}
}

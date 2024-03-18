package kr.ac.kopo.day10;

import java.util.Arrays;

public class StringMain04 {
	public static void main(String[] args) {
		String s = "Hello";
		String s2 = new String("Hello");
		
		s = new String("Hello");
		s2 = new String("hello");
		
		System.out.printf("s  : [%s]\n", s);
		System.out.printf("s2 : [%s]\n", s2);
		
		//주소비교
		if(s == s2) {
			System.out.println("s == s2");
		}else {
			System.out.println("s != s2");			
		}
		
		//문자열비교
		boolean bool = s.equals(s2);
		if(bool) {
			System.out.println("equals() : 같다");
		}else {
			System.out.println("equals() : 다르다");
		}
		
		bool = s.equalsIgnoreCase(s2);
		if(bool) {
			System.out.println("equalsIgnoreCase() : 같다");
		}else {
			System.out.println("equalsIgnoreCase() : 다르다");
		}
		
		
		
		String[] names = {"홍길동", "홍길동", "나갈길", "윤길동", "홍길동", "홍개똥", "길길순"};
		
		System.out.println("<\"길\"이 포함된 이름을 출력>");
		for(String name: names) {
			if(name.contains("길")) {	//contains는 느리다
				System.out.println(name);
			}
		}
		
		System.out.println("<이름이 \"길동\"인 이름을 출력>");
		for(String name: names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("<성씨가 \"홍\"인 이름을 출력>");
		
		for(String name: names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}		
		
		System.out.println("=================================");
		for(String name: names) {
			if(name.charAt(0) == '홍') {
				System.out.println(name);
			}
		}
		
		System.out.println("<전체이름이 \"홍길동\"인 이름을 출력>");
		
		for(String name : names) {
			switch(name) {		//switch를 문자열 비교 if문처럼 씀 jdk 1.7부터 가능
			case "홍길동":
				System.out.println(name);
				break;
			}
		}
		
		System.out.println("=================================");
		for(String name : names) {
			switch(name) {		//switch에 break 없이 사용하는 방법, jdk 14부터 가능
			case "홍길동" -> {
				System.out.println(name);
			}
			}
		}
		
		System.out.println("=================================");
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);				
			}
		}
		
		System.out.println("=================================");
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("홍길동")) {
				System.out.println(names[i]);
			}
		}
		
		System.out.println("=================================");
		for(String name : names) {
			if(name.compareTo("홍길동") == 0) {
				System.out.println(name);				
			}
		}
		
		System.out.println(Arrays.toString(names));
		
		
		String word = "hello World";
		String word2 = "hello";
		
		int cmp = word.compareTo(word2);
		
		if(cmp == 0) {
			System.out.printf("%s == %s\n", word, word2);
		}else if(cmp > 0) {
			System.out.printf("%s > %s\n", word, word2);			
		}else {
			System.out.printf("%s < %s\n", word, word2);
		}
		
	}
}

package kr.ac.kopo.day15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
	public static void main(String[] args) {
		
		// 2024-03-25(월) 15:35:12
		String pattern = "yyyy-MM-dd(E) HH:mm:ss";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		
		/*
		// 오늘은 2024년 3월 25일(월)입니다
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;	// 0 ~ 11
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);	 // 1(일) ~ 7(토)
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 "
				+ date + "일(" + week[day] + ")입니다.");
		
		// 2021년 5월 12일 무슨요일????
		
		c.set(2021, 5-1, 12);
		day = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("2021년 5월 12일의 요일은 " + week[day] + "요일입니다");
		
		Date d = c.getTime();
		System.out.println(d);
		
		System.out.println(c);
		d = new Date();
		c.setTime(d);
		System.out.println(c);
		
		System.out.println("3월의 마지막날 : " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("월의 최대수 : " + c.getActualMaximum(Calendar.MONTH));
		*/
		/*
		Date d = new Date();
		
		System.out.println(d);
		
		// 오늘은 2024년 3월 25일(월)입니다
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int day = d.getDay();
		
		String [] week = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " 
				+ date + "일 (" + week[day] + ")입니다.");
		*/
	}
}

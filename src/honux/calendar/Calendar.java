package honux.calendar;

import java.util.Scanner;


public class Calendar {
	
	private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	/**
	 * - 월을 입력하면 해당 월의 달력을 출력한다.
	 * - 달력의 모양은 1단계에서 작성한 모양으로 만든다.
	 * - 1일은 일요일로 정해도 무방하다.
	 * - -1을 입력받기 전까지 반복 입력 받는다.
	 * - 프롬프트를 출력한다.
	 */
	
	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println(" Su Mo Tu We Th Fr Sa");
		System.out.println("---------------------");
		int maxDay = getMaxDaysOfMonth(month);
		
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0)
				System.out.println();
		}
		System.out.println();
		
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
		
	}	
	
}

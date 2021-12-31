package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay {
	/*
	  	어떤 가게에서 할인 행사를 홀수번째 목표일에만 진행한다 한다.
	  	년도와 월을 입력하면 해당 달의 모든 할인 날짜를 출력해주는 프로그램을 만들어 보세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Calendar ymd = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));		
//		
//		System.out.println("찾으시는 행사날의 년도와 월을 입력하세요(ex> 2021 12)");
//		int year = sc.nextInt();
//		int month = sc.nextInt();
//		ymd.set(year, month-1,1);
//		
//		
//		System.out.printf("%d년 %d월의 할인 날짜\n",year,month);
//		
//		for (int i = 1, m =ymd.get(Calendar.MONTH);m == ymd.get(Calendar.MONTH);++i) {
//			ymd.set(Calendar.DATE, i);
//			if(ymd.get(Calendar.DAY_OF_WEEK)==5&&ymd.get(Calendar.DAY_OF_WEEK_IN_MONTH)%2!=0) {
//				System.out.print(i+"일 ");
//			}
//		}
		
		int year = 2021;
		int month = 12;
		discountDay(year, month);
		
	}
	public static void discountDay(int year, int month) {
		SimpleDateFormat eventDayFormat = new SimpleDateFormat("MM/dd E(F)");
		Calendar eventCalendar = Calendar.getInstance();		
		eventCalendar.set(year, month-1, 1);
		
		for (int week = 1, weekday = Calendar.THURSDAY;
				week <= eventCalendar.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);week +=2) {
			eventCalendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, week);
			eventCalendar.set(Calendar.DAY_OF_WEEK, weekday);
			
			System.out.println(eventDayFormat.format(eventCalendar.getTime()));
		}
		
		
		// getActualMaximum(field): 해당 필드의 최대값을 반환해준다.
		
//		for(int day = 1 ; day <= eventCalendar.getActualMaximum(Calendar.DATE); ++day) {			
//			eventCalendar.set(Calendar.DATE, day);
//			if (eventCalendar.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 ==1 &&
//					eventCalendar.get(Calendar.DAY_OF_WEEK)== Calendar.THURSDAY){
//				System.out.println(eventDayFormat.format(eventCalendar.getTime()));
//				
//			}
//		}
	}
}

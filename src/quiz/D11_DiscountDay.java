package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class D11_DiscountDay {
	/*
	  	� ���Կ��� ���� ��縦 Ȧ����° ��ǥ�Ͽ��� �����Ѵ� �Ѵ�.
	  	�⵵�� ���� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� ���α׷��� ����� ������
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Calendar ymd = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));		
//		
//		System.out.println("ã���ô� ��糯�� �⵵�� ���� �Է��ϼ���(ex> 2021 12)");
//		int year = sc.nextInt();
//		int month = sc.nextInt();
//		ymd.set(year, month-1,1);
//		
//		
//		System.out.printf("%d�� %d���� ���� ��¥\n",year,month);
//		
//		for (int i = 1, m =ymd.get(Calendar.MONTH);m == ymd.get(Calendar.MONTH);++i) {
//			ymd.set(Calendar.DATE, i);
//			if(ymd.get(Calendar.DAY_OF_WEEK)==5&&ymd.get(Calendar.DAY_OF_WEEK_IN_MONTH)%2!=0) {
//				System.out.print(i+"�� ");
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
		
		
		// getActualMaximum(field): �ش� �ʵ��� �ִ밪�� ��ȯ���ش�.
		
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

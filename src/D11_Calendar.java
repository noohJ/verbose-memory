import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class D11_Calendar {
	/*
	  	# Date, Calendar, Time	  	
	  	
	  	 - 자바로 날짜를 다루는 기능들을 모아놓은 클래스들
	 */
	
	public static void main(String[] args) {
		// ※ 유닉스 타임 - 1970년 1월 1일 이후로 시간이 얼마나 흘렀는지를 1/1000초로 센 것
		System.out.println("현재 시간: "+System.currentTimeMillis()+"ms");
		System.out.println("현재 시간: "+System.currentTimeMillis() /1000 +"s");
		System.out.println("현재 시간: "+System.currentTimeMillis() /1000 / 60 +"m");
		System.out.println("현재 시간: "+System.currentTimeMillis() /1000 / 60 / 60+"h");
		System.out.println("현재 시간: "+System.currentTimeMillis() /1000 / 60 / 60 / 24+"days");
		System.out.println("현재 시간: "+System.currentTimeMillis() /1000 / 60 / 60 / 24 / 365 +"years");
		
//		// 코드 실행시간 측정
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 10000; ++i) {
//			System.out.println(i);
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println("실행시간: " +(end-start)+"ms");
		
		/*
		  	# java.util.Date
		  	
		  	 - 주로 시간 데이터를 담아두기 위한 용도로 사용되는 클래스
		  	 - Date 클래스에도 시간을 계산하는 메서드들이 존재하지만, 업데이트가 중단되어 있으므로 사용하지 않는 것이 좋다.
		 */
		Date now = new Date();
		System.out.println(now);
		
		/*
		  	# java.util.Calendar
		  	
		  	 - 달력을 구현한 클래스
		  	 - 날짜 및 시간을 쉽게 계산할 수 있는 다양한 기능들이 모여있다.
		  	 - 생성자를 사용할 수 없고 Calendar.getInstance()로 인스턴스를 받아와야 한다.
		  	 - Calendar.getInstance()		  
		 */
		
//		 사용가능한 TimeZoneID들 보기
		for (String id :TimeZone.getAvailableIDs()) {
			System.out.println(id);
		}
		
		Calendar hawaii_now = Calendar.getInstance((TimeZone.getTimeZone("US/Hawaii")));
		System.out.println(hawaii_now);
		
		// Calendar 인스턴스에서 원하는 필드값을 get() 메서드를 통해 꺼낼 수 있다.
		System.out.println("하와이 날짜: "+hawaii_now.get(Calendar.DATE));
		System.out.println("하와이 시간: "+hawaii_now.get(Calendar.HOUR)); //12H
		System.out.println("하와이 시간(24): "+hawaii_now.get(Calendar.HOUR_OF_DAY)); //24H
		System.out.println("하와이 AM_PM: "+hawaii_now.get(Calendar.AM_PM));//AM : 0 , PM:1
		System.out.println(hawaii_now.get(Calendar.MINUTE));
		
		// Calendar의 필드 중 MONTH만 0부터 시작한다.
		System.out.println("몇 월? "+hawaii_now.get(Calendar.MONTH));
		
		// add(field, value): 필드값 추가(음수 입력시 감소)
//		hawaii_now.add(Calendar.SECOND, -2500);
		
		// set(field, value): 필드값 변경
//		hawaii_now.set(Calendar.DATE, 6);
		
		// 특이하고 편리한 필드들
//		System.out.println("DAY_OF_YEAR(올해가 시작된 후의 날짜): "+hawaii_now.get(Calendar.DAY_OF_YEAR));
//		System.out.println("DAY_OF_MONTH(이번달이 시작된 후의 날짜): "+hawaii_now.get(Calendar.DAY_OF_MONTH));
//		System.out.println("DAY_OF_YEAR(요일, 1~7 일요일이 1): "+hawaii_now.get(Calendar.DAY_OF_WEEK));
//		System.out.println("DAY_OF_WEEK_IN_MONTH(이번달의 몇 번째 해당 요일인가): "+hawaii_now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("DAY_OF_YEAR(올해가 시작된 후의 날짜): "+Calendar.DAY_OF_YEAR);
		System.out.println("DAY_OF_MONTH(이번달이 시작된 후의 날짜): "+Calendar.DAY_OF_MONTH);
		System.out.println("DAY_OF_WEEK(요일, 1~7 일요일이 1): "+Calendar.DAY_OF_WEEK);
		System.out.println("DAY_OF_WEEK_IN_MONTH(이번달의 몇 번째 해당 요일인가): "+Calendar.DAY_OF_WEEK_IN_MONTH);
		/*
		  # 현재 한국 시간 Calendar 인스턴스를 하나 생성한 후 10시간 후로 변경한 후에
		  
		 */
		System.out.println("----------------------------------------------");
		Calendar kor_now = Calendar.getInstance(TimeZone.getTimeZone("ROK"));
//		kor_now.add(Calendar.HOUR, 10);
		String am_pm;
		String a = "kor_now.get";
		int chk =kor_now.get(Calendar.AM_PM);
		if (chk == 0) {
			am_pm = "AM";
		}else {
			am_pm="PM";
		}
		System.out.printf("%d년 %d월 %d일 %02d:%d:%d.%03d %s",
				kor_now.get(Calendar.YEAR),kor_now.get(Calendar.DAY_OF_MONTH),kor_now.get(Calendar.DATE),
				kor_now.get(Calendar.HOUR),kor_now.get(Calendar.MINUTE),kor_now.get(Calendar.SECOND),
				kor_now.get(Calendar.MILLISECOND),am_pm);
		System.out.println("");
		/*
		 	# SimpleDateFormat의 서식 문자들
			 	y: 년
			 	M: 월
			 	d: 일
			 	D: 일(1~365)
			 	H: 24시
			 	h: 12시
			 	m: 분
			 	s: 초
			 	S: 밀리초			 	
			 	E: 요일
			 	a: 오전/오후
		  
		 */
		SimpleDateFormat my_format = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss.SSS a");
//		
		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.HOUR, 10);
		
		// getTime(): Calendar 인스턴스로 Date타입 인스턴스를 생성하여 반환한다.
		String my_print = my_format.format(cal.getTime());
		System.out.println(my_print);
		
	}
}

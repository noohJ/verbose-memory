import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
public class D12_Time {
	/*
	  	# java.time.Time
	  	
	  	 - Calendar의 여러가지 단점을 보완한 시간을 다루는 클래스
	  	 - Calendar는 set()을 통해 원본 인스턴스를 계속 변경해서 불편하지만
	  	   java.time 패키지의 클래스들은 새로운 인스턴스를 반환하여 편리하다.
	  	 - LocalDate, LocalTime, LocalDateTime
	 */
	public static void main(String[] args) {
		
		// now() : 지금 시간의 인스턴스를 반환하는 메서드
		System.out.println("날짜만: " + LocalDate.now());
		System.out.println("시간만: " + LocalTime.now());
		System.out.println("둘 다: " + LocalDateTime.now());
		
		// of() : 원하는 시간의 인스턴스를 반환하는 메서드
		System.out.println(LocalDate.of(1990, 5, 5 ));
		System.out.println(LocalTime.of(2, 2, 2, 222));
		
		// 변경된 시간 인스턴스 생석하기
		LocalDate today= LocalDate.now();
		LocalDate after10years = today.plusYears(10);
		
		System.out.println(today);
		System.out.println(after10years);
		
		System.out.println(today.plus(15, ChronoUnit.DAYS));
		System.out.println(today.plus(15, ChronoUnit.MONTHS));
		System.out.println(today.plus(30, ChronoUnit.WEEKS));
				
		// java.time 시간을 문자열로 변경하기
		DateTimeFormatter my_format = DateTimeFormatter.ofPattern("yyyy/MM/dd EEEE");
		String  str = my_format.format(after10years);
		
		System.out.println(str);
		// 두 시간 인스턴스의 크기를 비교하기
		LocalDate 어린이날 = LocalDate.of(2024, 5, 5);
		LocalDate 한글날 = LocalDate.of(2021, 10, 9);
		
		System.out.println(어린이날.isAfter(한글날));
		System.out.println(어린이날.isBefore(한글날));
		System.out.println(어린이날.isEqual(어린이날));
		System.out.println(어린이날.isLeapYear());
		
		// 특정 값 꺼내기
		DayOfWeek dayOfWeek = 어린이날.getDayOfWeek();		
		System.out.println(dayOfWeek);
		
		System.out.println(어린이날.getMonth());
		System.out.println(어린이날.getMonthValue());
		
		// 특정 값 꺼내기2
		LocalDate 오월의마지막일요일 = 어린이날.with(TemporalAdjusters.lastInMonth(dayOfWeek));
		System.out.println(오월의마지막일요일);
	}
}

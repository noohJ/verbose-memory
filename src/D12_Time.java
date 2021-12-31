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
	  	
	  	 - Calendar�� �������� ������ ������ �ð��� �ٷ�� Ŭ����
	  	 - Calendar�� set()�� ���� ���� �ν��Ͻ��� ��� �����ؼ� ����������
	  	   java.time ��Ű���� Ŭ�������� ���ο� �ν��Ͻ��� ��ȯ�Ͽ� ���ϴ�.
	  	 - LocalDate, LocalTime, LocalDateTime
	 */
	public static void main(String[] args) {
		
		// now() : ���� �ð��� �ν��Ͻ��� ��ȯ�ϴ� �޼���
		System.out.println("��¥��: " + LocalDate.now());
		System.out.println("�ð���: " + LocalTime.now());
		System.out.println("�� ��: " + LocalDateTime.now());
		
		// of() : ���ϴ� �ð��� �ν��Ͻ��� ��ȯ�ϴ� �޼���
		System.out.println(LocalDate.of(1990, 5, 5 ));
		System.out.println(LocalTime.of(2, 2, 2, 222));
		
		// ����� �ð� �ν��Ͻ� �����ϱ�
		LocalDate today= LocalDate.now();
		LocalDate after10years = today.plusYears(10);
		
		System.out.println(today);
		System.out.println(after10years);
		
		System.out.println(today.plus(15, ChronoUnit.DAYS));
		System.out.println(today.plus(15, ChronoUnit.MONTHS));
		System.out.println(today.plus(30, ChronoUnit.WEEKS));
				
		// java.time �ð��� ���ڿ��� �����ϱ�
		DateTimeFormatter my_format = DateTimeFormatter.ofPattern("yyyy/MM/dd EEEE");
		String  str = my_format.format(after10years);
		
		System.out.println(str);
		// �� �ð� �ν��Ͻ��� ũ�⸦ ���ϱ�
		LocalDate ��̳� = LocalDate.of(2024, 5, 5);
		LocalDate �ѱ۳� = LocalDate.of(2021, 10, 9);
		
		System.out.println(��̳�.isAfter(�ѱ۳�));
		System.out.println(��̳�.isBefore(�ѱ۳�));
		System.out.println(��̳�.isEqual(��̳�));
		System.out.println(��̳�.isLeapYear());
		
		// Ư�� �� ������
		DayOfWeek dayOfWeek = ��̳�.getDayOfWeek();		
		System.out.println(dayOfWeek);
		
		System.out.println(��̳�.getMonth());
		System.out.println(��̳�.getMonthValue());
		
		// Ư�� �� ������2
		LocalDate �����Ǹ������Ͽ��� = ��̳�.with(TemporalAdjusters.lastInMonth(dayOfWeek));
		System.out.println(�����Ǹ������Ͽ���);
	}
}

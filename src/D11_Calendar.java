import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class D11_Calendar {
	/*
	  	# Date, Calendar, Time	  	
	  	
	  	 - �ڹٷ� ��¥�� �ٷ�� ��ɵ��� ��Ƴ��� Ŭ������
	 */
	
	public static void main(String[] args) {
		// �� ���н� Ÿ�� - 1970�� 1�� 1�� ���ķ� �ð��� �󸶳� �귶������ 1/1000�ʷ� �� ��
		System.out.println("���� �ð�: "+System.currentTimeMillis()+"ms");
		System.out.println("���� �ð�: "+System.currentTimeMillis() /1000 +"s");
		System.out.println("���� �ð�: "+System.currentTimeMillis() /1000 / 60 +"m");
		System.out.println("���� �ð�: "+System.currentTimeMillis() /1000 / 60 / 60+"h");
		System.out.println("���� �ð�: "+System.currentTimeMillis() /1000 / 60 / 60 / 24+"days");
		System.out.println("���� �ð�: "+System.currentTimeMillis() /1000 / 60 / 60 / 24 / 365 +"years");
		
//		// �ڵ� ����ð� ����
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 10000; ++i) {
//			System.out.println(i);
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println("����ð�: " +(end-start)+"ms");
		
		/*
		  	# java.util.Date
		  	
		  	 - �ַ� �ð� �����͸� ��Ƶα� ���� �뵵�� ���Ǵ� Ŭ����
		  	 - Date Ŭ�������� �ð��� ����ϴ� �޼������ ����������, ������Ʈ�� �ߴܵǾ� �����Ƿ� ������� �ʴ� ���� ����.
		 */
		Date now = new Date();
		System.out.println(now);
		
		/*
		  	# java.util.Calendar
		  	
		  	 - �޷��� ������ Ŭ����
		  	 - ��¥ �� �ð��� ���� ����� �� �ִ� �پ��� ��ɵ��� ���ִ�.
		  	 - �����ڸ� ����� �� ���� Calendar.getInstance()�� �ν��Ͻ��� �޾ƿ;� �Ѵ�.
		  	 - Calendar.getInstance()		  
		 */
		
//		 ��밡���� TimeZoneID�� ����
		for (String id :TimeZone.getAvailableIDs()) {
			System.out.println(id);
		}
		
		Calendar hawaii_now = Calendar.getInstance((TimeZone.getTimeZone("US/Hawaii")));
		System.out.println(hawaii_now);
		
		// Calendar �ν��Ͻ����� ���ϴ� �ʵ尪�� get() �޼��带 ���� ���� �� �ִ�.
		System.out.println("�Ͽ��� ��¥: "+hawaii_now.get(Calendar.DATE));
		System.out.println("�Ͽ��� �ð�: "+hawaii_now.get(Calendar.HOUR)); //12H
		System.out.println("�Ͽ��� �ð�(24): "+hawaii_now.get(Calendar.HOUR_OF_DAY)); //24H
		System.out.println("�Ͽ��� AM_PM: "+hawaii_now.get(Calendar.AM_PM));//AM : 0 , PM:1
		System.out.println(hawaii_now.get(Calendar.MINUTE));
		
		// Calendar�� �ʵ� �� MONTH�� 0���� �����Ѵ�.
		System.out.println("�� ��? "+hawaii_now.get(Calendar.MONTH));
		
		// add(field, value): �ʵ尪 �߰�(���� �Է½� ����)
//		hawaii_now.add(Calendar.SECOND, -2500);
		
		// set(field, value): �ʵ尪 ����
//		hawaii_now.set(Calendar.DATE, 6);
		
		// Ư���ϰ� ���� �ʵ��
//		System.out.println("DAY_OF_YEAR(���ذ� ���۵� ���� ��¥): "+hawaii_now.get(Calendar.DAY_OF_YEAR));
//		System.out.println("DAY_OF_MONTH(�̹����� ���۵� ���� ��¥): "+hawaii_now.get(Calendar.DAY_OF_MONTH));
//		System.out.println("DAY_OF_YEAR(����, 1~7 �Ͽ����� 1): "+hawaii_now.get(Calendar.DAY_OF_WEEK));
//		System.out.println("DAY_OF_WEEK_IN_MONTH(�̹����� �� ��° �ش� �����ΰ�): "+hawaii_now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("DAY_OF_YEAR(���ذ� ���۵� ���� ��¥): "+Calendar.DAY_OF_YEAR);
		System.out.println("DAY_OF_MONTH(�̹����� ���۵� ���� ��¥): "+Calendar.DAY_OF_MONTH);
		System.out.println("DAY_OF_WEEK(����, 1~7 �Ͽ����� 1): "+Calendar.DAY_OF_WEEK);
		System.out.println("DAY_OF_WEEK_IN_MONTH(�̹����� �� ��° �ش� �����ΰ�): "+Calendar.DAY_OF_WEEK_IN_MONTH);
		/*
		  # ���� �ѱ� �ð� Calendar �ν��Ͻ��� �ϳ� ������ �� 10�ð� �ķ� ������ �Ŀ�
		  
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
		System.out.printf("%d�� %d�� %d�� %02d:%d:%d.%03d %s",
				kor_now.get(Calendar.YEAR),kor_now.get(Calendar.DAY_OF_MONTH),kor_now.get(Calendar.DATE),
				kor_now.get(Calendar.HOUR),kor_now.get(Calendar.MINUTE),kor_now.get(Calendar.SECOND),
				kor_now.get(Calendar.MILLISECOND),am_pm);
		System.out.println("");
		/*
		 	# SimpleDateFormat�� ���� ���ڵ�
			 	y: ��
			 	M: ��
			 	d: ��
			 	D: ��(1~365)
			 	H: 24��
			 	h: 12��
			 	m: ��
			 	s: ��
			 	S: �и���			 	
			 	E: ����
			 	a: ����/����
		  
		 */
		SimpleDateFormat my_format = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss.SSS a");
//		
		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.HOUR, 10);
		
		// getTime(): Calendar �ν��Ͻ��� DateŸ�� �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ�.
		String my_print = my_format.format(cal.getTime());
		System.out.println(my_print);
		
	}
}

package quiz.pirate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class D11_ParkingSystem_final {
	
	class Car {
		final static SimpleDateFormat dateFormat = new SimpleDateFormat("[yyyy/MM/dd]");
		
		String number;
		int type;
		Calendar parkDate;
		
		public Car(String number, int type, Calendar parkDate) {
			this.number = number;
			this.type = type;
			this.parkDate = parkDate;
		}
		
		@Override
		public String toString() {
			return String.format("%s - %s",number, dateFormat.format(parkDate.getTime()));
		}
	}
	
	final static ArrayList<Calendar> holidays = new ArrayList<>();
	
	static {
		holidays.add(getHolidayInstance(1,1));
		holidays.add(getHolidayInstance(3,1));
		holidays.add(getHolidayInstance(5,5));
		holidays.add(getHolidayInstance(8,15));
		holidays.add(getHolidayInstance(10,3));
		holidays.add(getHolidayInstance(10,9));
		
	}
	
	private static Calendar getHolidayInstance(int month, int day) {
		Calendar holiday = Calendar.getInstance();

		holiday.set(Calendar.MONTH , month-1);
		holiday.set(Calendar.DATE , day);
		return holiday;
	}
	
	public boolean parkable(Car car) {
		int dayOfWeek = car.parkDate.get(Calendar.DAY_OF_WEEK);
		
		if (car.type > 0) {
			System.out.println("�����, ���Ƶ���, ������� ���� ����5���� ����� �ƴմϴ�.");
			return true;
		}
		
		
		if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) {
			System.out.println("�޹���(��/��)�� ����5������ ������� �ʽ��ϴ�.");
			return true;
		}else {
			for (Calendar holiday : holidays) {
				if(car.parkDate.get(Calendar.MONTH) == holiday.get(Calendar.MONTH)
						&& car.parkDate.get(Calendar.DATE) == holiday.get(Calendar.DATE)){
					System.out.println("������ ���� �������̹Ƿ� ���� 5������ ������� �ʽ��ϴ�.");
					return true;
				}
			}
		}
		int ban1 = dayOfWeek -1,ban2 = (ban1 + 5) %10;
		int lastNumber = car.number.charAt(car.number.length()-1) -'0';
		
		if (lastNumber == ban1 || lastNumber == ban2) {
			System.out.printf("%s : ������ ����5������ ����  ���� �����Գ���.\n",car);
			return false;
		}
		System.out.printf("%s : ������ ������ �� �ֽ��ϴ�.\n",car);
		return true;
	}
	
	public boolean check(String number, int type, Calendar parkDate) {
		return parkable(new Car(number, type, parkDate));
	}
	
	public static void main(String[] args) {
		D11_ParkingSystem_final system = new D11_ParkingSystem_final();
		
		system.check("12��3456",0,Calendar.getInstance());
		system.check("12��3455",2,Calendar.getInstance());
		system.check("12��3450",0,Calendar.getInstance());
	}
}



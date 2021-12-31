package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D11_ParkingSystem {
	/*
	 * 끝번호 차량 출입제한
	 * 월 1 6  / 화 2 7/ 수 3 8/ 목 4 9/ 금 5 0/ 공휴일 휴무일 적용제외  
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar realToday = Calendar.getInstance();

		while (true) {
			
			
			System.out.println("출입할 차량 번호 >>");
			String carNum = sc.nextLine();
			System.out.print("차량 특이사항 기입\n(0.일반 1.장애인 2.유아동승 3.긴급 4.기타)");
			int ct = sc.nextInt();
			
			int year = realToday.get(Calendar.YEAR);
			int month = realToday.get(Calendar.MONTH);
			int day = realToday.get(Calendar.DATE);
			
			if (Pattern.matches("\\d\\d\\D\\d{4}", carNum)||Pattern.matches("\\d{4}", carNum)) {				
				
				System.out.printf("%d/%d/%d\n",year,month,day);
				checkNumToday(carNum,year,month,day,ct);
				if(ct ==0) {
					System.out.println("다른 날도 확인 하겠습니까? 1. 예 2. 아니요");
					int dif = sc.nextInt();
					if (dif == 1) {
						System.out.println("확인하고 싶은 날을 입력하세요(ex> 2021 09 12)");
						year = sc.nextInt();
						month = sc.nextInt();
						day = sc.nextInt();
						
						System.out.printf("%d/%d/%d\n",year,month,day);
						checkNumToday(carNum,year,month,day,ct);
						break;
					}else {
						break;
					}				
				}else {
					break;
				}
			}else {
				System.out.println("차량 번호가 아닙니다.");
			}
			
		}
	}
	
	public static void checkNumToday(String carNum,int year,int month, int day, int ct){		
		String[]carType = {"일반","장애인","유아동승","긴급","기타"};
		SimpleDateFormat chktoday = new SimpleDateFormat("MM/dd");
		Calendar today = Calendar.getInstance();
		today.set(year, month-1, day);
		
		String chk =chktoday.format(today.getTime());
		boolean holidayChk =(chk.equals("01/01")||chk.equals("02/11")||chk.equals("02/12")||chk.equals("02/13")||chk.equals("03/01")||chk.equals("05/05")||chk.equals("05/19")||chk.equals("06/06")||chk.equals("08/15")||chk.equals("09/20")||chk.equals("09/21")||chk.equals("09/22")||chk.equals("10/03")||chk.equals("10/09")||chk.equals("12/25"));
		
		System.out.printf("차량 번호: %s\n차량 특이사항: %s\n",carNum,carType[ct]);
		if(ct == 0) {
			if (holidayChk == true || today.get(Calendar.DAY_OF_WEEK)==1 || today.get(Calendar.DAY_OF_WEEK) == 7) {			
				System.out.println("공휴일 및 휴무일은 미적용 입니다.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==2 && (carNum.endsWith("1") || carNum.endsWith("6"))) {
				System.out.println("해당 차량은 출입제한 대상입니다.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==3 && (carNum.endsWith("2") || carNum.endsWith("7"))) {			
				System.out.println("해당 차량은 출입제한 대상입니다.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==4 && (carNum.endsWith("3") || carNum.endsWith("8"))) {			
				System.out.println("해당 차량은 출입제한 대상입니다.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==5 && (carNum.endsWith("4") || carNum.endsWith("9"))) {			
				System.out.println("해당 차량은 출입제한 대상입니다.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==6 && (carNum.endsWith("5") || carNum.endsWith("0"))) {
				System.out.println("해당 차량은 출입제한 대상입니다.");
			}else {			
				System.out.println("해당 차량은 출입이 허용 됩니다.");
			}			
		}else {
			System.out.println("예외 대상 차량입니다.");
		}
	}

}

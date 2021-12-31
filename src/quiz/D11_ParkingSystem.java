package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D11_ParkingSystem {
	/*
	 * ����ȣ ���� ��������
	 * �� 1 6  / ȭ 2 7/ �� 3 8/ �� 4 9/ �� 5 0/ ������ �޹��� ��������  
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar realToday = Calendar.getInstance();

		while (true) {
			
			
			System.out.println("������ ���� ��ȣ >>");
			String carNum = sc.nextLine();
			System.out.print("���� Ư�̻��� ����\n(0.�Ϲ� 1.����� 2.���Ƶ��� 3.��� 4.��Ÿ)");
			int ct = sc.nextInt();
			
			int year = realToday.get(Calendar.YEAR);
			int month = realToday.get(Calendar.MONTH);
			int day = realToday.get(Calendar.DATE);
			
			if (Pattern.matches("\\d\\d\\D\\d{4}", carNum)||Pattern.matches("\\d{4}", carNum)) {				
				
				System.out.printf("%d/%d/%d\n",year,month,day);
				checkNumToday(carNum,year,month,day,ct);
				if(ct ==0) {
					System.out.println("�ٸ� ���� Ȯ�� �ϰڽ��ϱ�? 1. �� 2. �ƴϿ�");
					int dif = sc.nextInt();
					if (dif == 1) {
						System.out.println("Ȯ���ϰ� ���� ���� �Է��ϼ���(ex> 2021 09 12)");
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
				System.out.println("���� ��ȣ�� �ƴմϴ�.");
			}
			
		}
	}
	
	public static void checkNumToday(String carNum,int year,int month, int day, int ct){		
		String[]carType = {"�Ϲ�","�����","���Ƶ���","���","��Ÿ"};
		SimpleDateFormat chktoday = new SimpleDateFormat("MM/dd");
		Calendar today = Calendar.getInstance();
		today.set(year, month-1, day);
		
		String chk =chktoday.format(today.getTime());
		boolean holidayChk =(chk.equals("01/01")||chk.equals("02/11")||chk.equals("02/12")||chk.equals("02/13")||chk.equals("03/01")||chk.equals("05/05")||chk.equals("05/19")||chk.equals("06/06")||chk.equals("08/15")||chk.equals("09/20")||chk.equals("09/21")||chk.equals("09/22")||chk.equals("10/03")||chk.equals("10/09")||chk.equals("12/25"));
		
		System.out.printf("���� ��ȣ: %s\n���� Ư�̻���: %s\n",carNum,carType[ct]);
		if(ct == 0) {
			if (holidayChk == true || today.get(Calendar.DAY_OF_WEEK)==1 || today.get(Calendar.DAY_OF_WEEK) == 7) {			
				System.out.println("������ �� �޹����� ������ �Դϴ�.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==2 && (carNum.endsWith("1") || carNum.endsWith("6"))) {
				System.out.println("�ش� ������ �������� ����Դϴ�.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==3 && (carNum.endsWith("2") || carNum.endsWith("7"))) {			
				System.out.println("�ش� ������ �������� ����Դϴ�.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==4 && (carNum.endsWith("3") || carNum.endsWith("8"))) {			
				System.out.println("�ش� ������ �������� ����Դϴ�.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==5 && (carNum.endsWith("4") || carNum.endsWith("9"))) {			
				System.out.println("�ش� ������ �������� ����Դϴ�.");
			}else if(today.get(Calendar.DAY_OF_WEEK)==6 && (carNum.endsWith("5") || carNum.endsWith("0"))) {
				System.out.println("�ش� ������ �������� ����Դϴ�.");
			}else {			
				System.out.println("�ش� ������ ������ ��� �˴ϴ�.");
			}			
		}else {
			System.out.println("���� ��� �����Դϴ�.");
		}
	}

}

package quiz;

import java.util.Scanner;

public class A08_GuessAge {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		int year_of_birth, this_year, age;
		
		System.out.print("�¾ �ذ� �����ΰ���? ");
		year_of_birth = sc.nextInt();
				
		System.out.print("���ش� ����ΰ���?");
		this_year = sc.nextInt();
		
		age = this_year - year_of_birth + 1;
		
		System.out.printf("����� %d�� �Դϴ�.",age);
		
	}
}

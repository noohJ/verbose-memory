package quiz;

import java.util.Scanner;

public class A08_GuessAge {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		int year_of_birth, this_year, age;
		
		System.out.print("태어난 해가 언제인가요? ");
		year_of_birth = sc.nextInt();
				
		System.out.print("올해는 몇년인가요?");
		this_year = sc.nextInt();
		
		age = this_year - year_of_birth + 1;
		
		System.out.printf("당신은 %d살 입니다.",age);
		
	}
}

package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean chk =true;
		while(chk) {
			try {
				System.out.println("숫자를 입력하세요");
				int num = sc.nextInt();
				System.out.println("입력하 숫자는 : "+num);		
				break;
			} catch(InputMismatchException e){
				System.out.println("숫자를 입력하세요.");
				System.out.println("스캐너에 걸려있던 값: " + sc.next());
			}
		}
	}
}

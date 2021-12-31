
import java.util.Scanner;

public class A08_Scanner {
	
	/*
	  	# java.util.Scanner 클래스
	  	
	  	 - 프로그램 외부로부터의 입력을 프로그램에서 받을 수 있는 기능들이 구현되어 있는 클래스
	  	 - 어디에서 입력 받을지 결정한 뒤에 다양한 값들을 문자열로 입력받을 수 있다.
	  	 
	  	# System
	  	
	  	 - 현재 운영체제를 콘솔을 뜻한다.
	  	 - System.out : 프로그램에서 콘솔로 데이터를 내보낼 수 있는 통료 (출력)
	  	 - System.in : 프로그램이 콘솔의 데이터를 읽어들일 수 있는 통로 (입력)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		  	# Scanner 클래스의 nextInt()
		  	
		  	 - 다음으로 입력받는 정수를 하나 꺼낸다.
		   	 - 스캐너에 꺼낼 값이 아무것도 없을 때는 프로그램을 멈추고 입력을 기다린다.
		   	 - 정수만 입력받아야 한다.
		   	 - next 뒤에 다른 타입 함수들을 통해 다른 타입들도 입력받을 수 있다.
		 */
		System.out.print("정수를 하나 입력해보세요 > ");
		int num = sc.nextInt();
		
		System.out.printf("입력하신 정수는 %d입니다.\n", num);
		
		System.out.print("사과의 개수를 입력해보세요 > ");
		int apple = sc.nextInt();
		
		System.out.printf("지불하실 금액은 %d원 입니다.\n", apple * 500);
		
		System.out.println("화물의 무게를 입력해보세요 > ");
		double weight = sc.nextDouble();
		
		System.out.printf("화물의 무게: %.2fkg\n", weight);
		
		
	}
}

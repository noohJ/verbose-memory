
public class B04_SwitchCase {

	/*
	  	 # switch-case
	  	
	  	  - ()안의 값에 따라 실행할 코드를 결정하는 문법
	  	  - ()안에는 정수, 문자열, 열거형(enum) 타입만 들어갈 수 있다.
	  	  - default는 if문의 else 역할을 한다
	  	  - break를 쓰지 않으면 break를 만날 때까지의 모든 코드를 실행한다.
	  	  - if문으로 완벽하게 대체 가능하다.
	 */
	
	public static void main(String[] args) {
		int num = 4;
		switch (num) {
		case 1: case 4: 
			System.out.println("거북이");
			break;
		case 2:
			System.out.println("판다");
			break;
		case 3:
			System.out.println("토끼");
			break;	
		default:
			System.out.println("철갑상어");
			break;
		}
	}
	
}

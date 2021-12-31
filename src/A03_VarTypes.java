import java.io.PrintStream;

public class A03_VarTypes {

		/*
		  	# 정수 타입
		  	
		  	 - byte  (1byte, 8bit)   -128 ~ +127
		  	 - short (2byte, 16bit)  -32768 ~ +32767
		  	 - char  (2byte, 16bit)  ※ 문자 코드는 음수가 없다. 0 ~ 65535
		  	 - int   (4byte, 32bit)  -21억 ~ +21억
		  	 - long  (8byte, 64bit)  ...
		 */
	public static void main(String[] args) {
		byte min_byte = Byte.MIN_VALUE; //-128;
		byte max_byte = Byte.MAX_VALUE; //127;
		short min_short = Short.MIN_VALUE; //-32768;
		short max_short = Short.MAX_VALUE; //32767;
		int min_int = Integer.MIN_VALUE;
		int max_int = Integer.MAX_VALUE;
		long min_long = Long.MIN_VALUE;
		long max_long = Long.MAX_VALUE;
		
		// 정수 리터럴은 기본 타입이 int 타입이다.
		// int의 범위를 벗어나는 정수 리터럴을 사용하고 싶다면 뒤에 L을 붙여야 한다.
		long _long = 10000000000L;
		
		System.out.println(max_int);
		System.out.println(max_long);
		
		// 해당 타입 값을 원하는 진법 문자열로 바꾸기
		System.out.println(Integer.toString(min_int, 8));
		System.out.println(Long.toString(_long, 2));
		
		/*
		  	# 실수 타입
		  	
		  	 - float  (4byte)
		  	 - double (8byte)
		  	 
		  	 실수는 주로 그래픽 계산에 사용되며 웹 분야에서는 거의 사용하지 않는
		 */
		
		// 실수 리터럴의 기본 타입은 double 타입이다.
		double _double = 123.1234;
		
		// 실수 리터럴을  float 변수에 넣기 위해서는 뒤에 F를 붙여야한다.
		float _float = 123.1234F;
		
		/*
		  	# 참/거짓 타입
		  	
		  	- boolean
		  	- boolean 타입에 들어갈 수 있는 값은 true와 false빡에 없다.
		 */
		boolean male = true;
		boolean powerOn = true;
		boolean overEighteen = false;
		
		/*
		 	# 참조형 타입
		 	
		 	 - 대문자로 시작하는 모든 타입
			 - 위에서 배운 소문자로 시작하는 모든 타입들은 기본형 타입이라고 부른다.
			 - String
			 - 그 외 모든 클래스 타입들...
		 */
		String hello1 = "안녕하세요~";
		String hello2 = "반갑습니다!";
		
		PrintStream stream = System.out;
		
		System.out.println(hello1);
		System.out.println(hello2);
		stream.println(hello1);
		stream.println(hello2);
	}
	
}

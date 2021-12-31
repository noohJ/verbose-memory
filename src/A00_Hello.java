//한줄 주석

/*
   여
   러
   줄
   주
   석 
 */

/*
 	# 프로그램
 	 - 실행하면 정해진 동작을 하는 것
 	 
  	# 프로그래밍
  	 - 프로그래밍 언어를 사용해 프로그램을 만드는 것
  	 
  	# 기계어 (Assembly Language)
 	 - 컴퓨터가 알아들을 수 있는 언어
 	 - 사람이 기계어를 이해하기 위해서는 엄청난 시간과 노력이 필요하다. 
 	 
 	# 프로그래밍 언어
 	 - 사람이 사용하는 언어와 기계가 알아들을 수 있는 언어의 중간 지점 언어
 	 - 기계 친화적인 언어는 개발 속도가 느리고(많은 개발 비용 발생) 실행 속도가 빠르다.
 	 - 사람 친화적인 언어는 개발 속도가 빠르고(개발 비용 적음) 실행 속도가 느리다.
 	 
 	# 컴파일
 	 - 작성된 프로그래밍 언어를 한번에 기계어로 번역하는 것
 	 - 다 작성된 코드를 한번에 목적 파일(컴퓨터가 실핼할 수 있는 형태의 파일)로 변환하는 과정을 말한다.
 	 - 수정한 코드를 반영하기 위해서는 다시 컴파일을 하여 새로운 목적 파일을 생성해야 한다.
 	 - C, JAVA, C++, ...
 	 
 	# 컴파일러
 	 - 프로그래밍 언어로 작성된 코드를 기계어로 번역하는 프로그램
 	 
 	# JDK (Java Development Kit, 자바 개발 도구)
 	 - 자바로 프로그램을 만들기 위한 개발 도구 모음
 	  - JDK는 JRE(Java Runtime Environmnet), 자바 컴파일러(javac)등의 프로그램들이 포함되어 있다.
 	 
 	# 인터프리터
 	 - 작성된 프로그래밍 언어를 한줄씩 기계어로 번역하는 것
 	 - 목적 파일을 생성하지 않고 코드를 한줄씩 읽기때문에 수정한 코드가 실시간으로 반영된다.
 	 - HTML, CSS, Javascript, Python, ...
 	 
 	# IDE ( Integrated Development Environment, 통합 개발 환경)
 	 - 개발을 진행하기 위해서는 필연적으로 
 	   "코드(.java) 작성 -> 컴파일 -> 목적 파일 생성(.class) -> 실행 ->버그 수정 (코드 작성)"의
 	   절차를 수행해야 한다.
 	 - 개발에 필요한 모든 절차를 하나의 프로그램으로 수행할 수 있게끔 통합해 놓은 프로그램을 IDE라고 한다.
 */

// ※ public class의 이름은 반드시 파일명과 같아야 한다.
public class A00_Hello {
	// 빨간 줄이 생겼을 때는 그곳에 마우스를 올리거나, 커서를 두고 F2를 눌러
	// 해당 에러에 대한 정보와 해결책을 볼 수 있다.
	
	/*
 		# main() 함수
 		 - 프로그램의 시작 지점
 		 - 사용자가 프로그램을 실행하면 가장 먼저 main() 함수가 실행된다.
 		 - 함수의 범위는 {}로 결정된다.
 		 - {}의 범위를 알기 쉽게 표현하기 위해 {} 내부에 있는 것들에는 들여쓰기를 사용한다.
 		 - main()이 끝나면 프로그램도 끝난다.
 		 - 앞에 붙어있는 키워드들이 다르면 main()을 찾지 못한다.
 		
 		# 함수
 		 - 어떤 단어 뒤에 ()가 붙어 있으면 함수다.
	 */
	
	public static void main(String[] args) {
		// 프로그램 시작
		
		// 주석(Comment)
		// - 프로그램 실행에 영향을 미치지 않는 개발자들의 메모
		// - 해당 프로그램에 대한 설명 또는 메모하고 싶은 것들을 적어두는 용도로 사용한다.				
		/* 
		   # System.out.println() 함수
		    - ()안에 전달한 데이터를 콘솔에 출력해주는 함수
		    
		   # 세미콜론 (;)
		    - 명령어 뒤에 붙여 한 명령어가 끝났음을 표시하는 용도
		 */
		System.out.println("Hello, world!");
		
		System.out.println("┌────────────┐");
		System.out.println("│            │");
		System.out.println("│            │");
		System.out.println("└────────────┘");
		
		/*
		   # Java의 데이터 종류 (리터럴의 종류)
		   
		    - 자바에서 사용하는 여러가지 값들을 리터럴이라고 부른다.
		    - "" 사이에 적는 것들 : 문자열(String), 문자를 여러개 쓸 수 있는 데이터 타입
		    - '' 사이에 적는 것 : 문자 (Character), 단하나의 문자를 표현하는 데이터 타입
		    - 숫자를 적는 것 : 정수 (Integer)
		    - 소수를 적는 것 : 실수 (float, double)
		      ※ 정수 타입과 실수 타입은 다양한 계산이 가능하다.
		      ※ 문자 타입은 다른 타입과 +로 이어붙일 수 있다.
		 */
		System.out.println("ABCDEFG");
		System.out.println("家價可加假歌");
		System.out.println('街');
		System.out.println("10" + "20");
		System.out.println(10 + "20");
		System.out.println("10" + 20);
		System.out.println(33.55 * 103023);
		System.out.println(10);
		System.out.println(10.33);
		System.out.println(10 + 35);
		System.out.println(22.22 + 33.33);
		System.out.println("22.22 + 33.33");
		System.out.println(true);
		System.out.println(false);
		
		// 정수 + 실수의 결과는 실수다
		System.out.println(3.14 + 10);
		
		// ""을 사용하는 문자열 타입과 다른 타입을 더하면 계산하는 것이 아니라 이어붙인다.
		System.out.println("10" + 123.12345 );
		
		//실수를 정수로 변환하면 소수점 아래를 삭제한다. (반올림 X)
		System.out.println((int)3.14);
		System.out.println((int)3.999999);
		System.out.println((int)3.6 +3.6);
		System.out.println((int)(3.6 + 3.6));
		
		// ''을 사용하는 문자 타입은 실제로는 해당 문자의 번호를 가지고 있다.
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println('A' + 10);
		System.out.println((int)'한');
		System.out.println((char)54621);
		System.out.println((char)(54622+10));
		System.out.println((char)1);
		
		// 프로그램 끝
	}
	
}
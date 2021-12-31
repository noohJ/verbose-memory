
public class A05_Print {
	public static void main(String[] args) {
		/*
		  	# 콘솔에 출력하는 함수
		  	
		  	 1. print()
		  	  - 줄을 자동으로 바꿔주지 않는 가장 기본 출력 함수
		  	  
		  	 2. println()
		  	  - 출력을 다 한 후 자동으로 \n을 추가하는 편리한 출력 함수
		  	 
		  	 3. printf()
		  	  - print format
		  	  - 서식을 이용해 원하는 출력 형태를 만들어 출력하는 함수
		  	  - 서식 문자 자리에 값을 순서대로 채워서 사용한다.
		  	  - 줄을 자동으로 바꿔주지 않는다.
		  	  
		  	  ※ 서식 문자의 종류
		  	  
		  	  %d : 해당 자리에 전달한 정수값을 10진수로 출력 (decimal)
		  	  %x : 해당 자리에 전달한 정수값을 16진수로 출력 (hexa decimal)
		  	  %X : 해당 자리에 전달한 정수값을 16진수로 출력 (hexa decimal) / ABCDEF 대문자로 출력
		  	  %o : 해당 자리에 전달한 정수값을 8진수로 출력 (octal)
		  	  %s : 해당 자리에 문자열을 전달할 수 있다.
		  	  %f : 해당 자리에 실수를 전달할 수 있다.
		  	  %c : 해당 자리에 문자를 전달할 수 있다.
		  	  
		 */
		
		String name = "홍길동";
		double weight = 75.0;
		float height = 187F;
		char gender = 'M';
		
		System.out.printf("이름\t: %s\n몸무게\t: %f\n신장\t: %f\n성별\t: %c\n",
				name, weight, height, gender);
		
		int year, month, day, hour, minute, second, millisecond;
		
		year = 2021;
		month = 11;
		day = 10;
		hour = 9;
		minute = 28;
		second = 35;
		millisecond = 58;
		
		System.out.print("Hello, world!");
		System.out.print("Hello, world!\n");
		System.out.print("Hello, world!");
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + ":" + minute + ":" + second + "." + millisecond);
		
		System.out.printf("%d년 %d월 %d일 %d:%d:%d.:03%d\n",
				year, month, day, hour, minute, second, millisecond);
		
		
	/*
	  	# 서식 문자 옵션들
	  	
	  	1. %숫자d
	  	 - 자릿수를 숫자만큼 확보하면서 출력한다. 
	  	 
	  	2. %-숫자d
	  	 - 자릴수를 숫자만큼 확보하면서 왼쪽 정렬하여 출력한다.
	  	 
	  	3. %0숫자d
	  	 - 자릿수를 숫자만큼 확보하고 빈자리에 0을 채워 출력한다.
	  	
	  	4. %.숫자f
	  	 - 실수의 소수점 아래 자릿수를 설정한다.
	  
	 */
		System.out.printf("%10s\n", "abcd");
		System.out.printf("%15s\n", "abcd");
		System.out.printf("%20s\n", "abcd");
		
		System.out.printf("%-5s:\n", "Name");
		System.out.printf("%-10s:\n", "Name");
		System.out.printf("%-15s:\n", "Name");
		System.out.printf("%-20s:\n", "Name");
		
		System.out.printf("%04d\n", 123);
		System.out.printf("%06d\n", 123);
		System.out.printf("%012d\n", 123);
		
		System.out.printf("%.2f\n", 1123.1234567);
		System.out.printf("%.4f\n", 1123.1234567);
		System.out.printf("%.6f\n", 1123.1234567);
		System.out.printf("%.10f\n", 1123.1234567);
		
	}
}

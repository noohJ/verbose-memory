import java.util.Scanner;

public class B11_Array {
	
	/* 
	   	# 배열 (Array)
	   	
	   	 - 같은 타입 변수를 한번에 여러개 선언하는 방법
	  	 - 같은 이름으로 변수를 여러개 선언한 뒤에 인덱스로 구분한다.
	  	 - 배열의 방 번호(인덱스)는 0부터 전체 길이 -1번 까지 있다.
	  	 - 배열은 한번 크기가 정해지면 크기를 변경할 수 없다.
	  	 - 배열은 생성과 동시에 모든 값이 초기화 되어 있다.
	  	   (정수: 0. 실수: 0.0, booldean: false, 참조형: null
	 */
	public static void main(String[] args) {
		
		Scanner[] sc = new Scanner[5];
		
		sc[0] = new Scanner(System.in);
		sc[1] = new Scanner(System.in);
		sc[2] = new Scanner(System.in);
		sc[3] = new Scanner(System.in);
		sc[4] = new Scanner(System.in);
		
		
		String[] msg = new String[3];
		
		msg[0] = "hello";
		msg[1] = "bye";
		
		int[] stu = new int[5];
		int[] stu = new int[6];
		
		stu[0] = 1;
		stu[1] = 23;
		stu[2] = 99;
		stu[3] = 43;
		stu[4] = 50;
		
		System.out.println("3번째 학생의 점수: " + stu[3]);
		
		/*
		    # 배열 선언 방법
		    
		  	 1. 타입[] 변수 = new 타입[크기];
		  	 2. 타입[] 변수 = { 값1, 값2, 값3, ...}; 
		  	 3. 타입[] 변수 =  new 타입[]{값1, 값2, ...}; 
		 */
		
		short[] numbers = new short[10];
		char[] GRADES = {'A', 'B', 'C', 'D', 'F'};
		String[] names = new String[] {"김철수", "안철수", "박철수", "최철수"};
		String[] names2 =names;
		
		// System.out.println()으로 배열을 그냥 출력해보면 해당 배열의 주소값이 나온다.
		// 예외적으로 char[]은 문자열 처럼 출력된다.
		
		System.out.println(numbers);
		System.out.println(GRADES);
		System.out.println(names);
		
		// 배열.length를 통해 해당 배열의 길이를 알 수 있다.
		System.out.println(numbers.length);
		System.out.println(GRADES.length);
		System.out.println(names.length);
		System.out.println("ABCDEF".length());
		
		// 배열은 반복문으로 쉽게 사용할 수 있게끔 설계되어 있다.
		for (int i = 0; i < names.length; ++i) {
			System.out.printf("names[%d] : %s\n", i, names[i] );
		}
		// String 타입은 char[]로 변환하여 사용할 수 있다.
		String helloo = "Hello, world!";
		char[] message = helloo. toCharArray();
		numbers[9]=10;
		numbers[10]=10;
		System.out.println(numbers[9]);
	}
}

package quiz;

import java.util.Arrays;

public class C01_MethodQuiz {
	public static boolean english(char lng) {
		return (lng >= 'a' && lng <='z') || (lng >= 'A' && lng <= 'Z');
	}
	
	public static boolean third (int num) {
		return num % 3 == 0;
	}
	
	public static String odd_even (int num) {
		return num % 2 == 0 || num == 0 ? "짝수입니다." : "홀수입니다.";
	}
	public static int[] measure (int num) {
		int count = 0;
		for (int i = 1 ; i <= num; ++i) {
			if (num % i == 0) {
				++count;
			}
		}
		int[] numbers = new int[count];
		for (int i = 1 ,j =0; i <= num; ++i) {
			if (num % i == 0) {
				numbers[j++] = i;
			}
		}
		return numbers;		
	}
	//전달한 정수가 소수라면 true 반환 아니면 false 반환 함수
	public static boolean decimal (int num) {
		for (int i = 2; i < num; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
//	숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	//factorial : (n) * (n-1) * (n-2) ... 3*2*1
	public static int factorial (int num) {
		int answer = num;
		for (int i = num-1; i > 1; --i) {
			answer *= i;
		}
		return answer;
	}
	/*
	    # 재귀 함수 ( 
	   
	   	 - 함수 자기 자신을 불러서 사용하는 함수
	   	 - 성능이 떨어지지만 멋있다.
	 */
	public static int recursive(int num) {
//		return num == 2 ?2 : num * recursive(num-1);
		if (num == 2) {
			return 2;
		}
		return num * recursive(num - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(english('a'));
		System.out.println(third(99));
		System.out.println(odd_even(27));
		System.out.println(Arrays.toString(measure(20)));
		System.out.println(decimal(20));
		System.out.println(factorial(5));
	}
}


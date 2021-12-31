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
		return num % 2 == 0 || num == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
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
	//������ ������ �Ҽ���� true ��ȯ �ƴϸ� false ��ȯ �Լ�
	public static boolean decimal (int num) {
		for (int i = 2; i < num; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
//	���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	//factorial : (n) * (n-1) * (n-2) ... 3*2*1
	public static int factorial (int num) {
		int answer = num;
		for (int i = num-1; i > 1; --i) {
			answer *= i;
		}
		return answer;
	}
	/*
	    # ��� �Լ� ( 
	   
	   	 - �Լ� �ڱ� �ڽ��� �ҷ��� ����ϴ� �Լ�
	   	 - ������ ���������� ���ִ�.
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


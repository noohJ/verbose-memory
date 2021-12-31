package quiz;

import java.util.Arrays;

public class C01_MethodQuiz2 {
	public static int[] range(int maximum) {
		
		int len = maximum;
		int[] numbers = new int [len];
		for (int i = 0; i < len; ++i) {
			numbers[i] = i;
		}
		return numbers;
	}
	
	
	public static int[] range(int minimum, int maximum) {
		int temp = maximum;
		if (maximum < minimum) {
			System.out.println("최대값과 최소값의 순서가 바뀌었습니다.");
			maximum = minimum;
			minimum = temp;
		}
		int len = maximum - minimum;
		int[] numbers = new int[len];
		for (int i = minimum, j = 0; i < maximum; ++i) {
			numbers[j++] = i;
		}
		return numbers;		
	}
	
	public static int[] range(int minimum, int maximum, int rise) {
		int temp = maximum;
		if (maximum < minimum) {
			System.out.println("최대값과 최소값의 순서가 바뀌었습니다.");
			maximum = minimum;
			minimum = temp;
		}
		int len = (maximum - minimum) % rise == 0 ? (maximum - minimum) / rise : ((maximum - minimum) / rise) + 1;
		int[] numbers = new int[len];
		for (int i = minimum, j = 0; i < maximum; i += rise) {
			if (j != len) {
				numbers[j++] = i;				
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(range(10)));
		System.out.println("--------------------------------------------------");
		System.out.println(Arrays.toString(range(10, 5)));
		System.out.println("--------------------------------------------------");
		System.out.println(Arrays.toString(range(40, 50, 3)));
	}
}

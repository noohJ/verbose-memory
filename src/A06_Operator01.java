
public class A06_Operator01 {
	/*
	 	# 연산자 (Operator)
	 	
	 	 - 계산할 때 사용하는 것
	 	 - +, -, *, /, >, <, <=, >= ...
	 	 
	 	# 산술 연산자
	 	 -  +, -, *, /, % 
	 */
	public static void main(String[] args) {
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		// 정수끼리 나누면 몫만 구한다.
		System.out.println(a / b);
		// 나누기 연산에 실수가 포함되어 있으면 정확한 계산을 한다.
		System.out.println(a / c);
		
		// 나머지 연산
		System.out.println(a % b);
		
		// ※ ^는 제곱이 아니라 비트 연산이다.
		System.out.println(a ^ b);
		
		// Math.pow(a, b) : a의 b제곱을 계산하여 반환해주는 함수
		double result = Math.pow(3, 5);
		System.out.println(result);
		System.out.println(Math.pow(3, 10));
		
		// Math.sqrt(a) : a의 제곱근을 구해서 반환한다.
		System.out.println(Math.sqrt(49));
		
		// Math.abs(a) : a의 절대값을 구해서 반환한다
		System.out.println(Math.abs(55));
		System.out.println(Math.abs(-55));
		
		// Math.round(a) : a를 소수 첫째 자리에서 반올림한 결과를 반환한다.
		System.out.println(Math.round(1234.6));
		System.out.println(Math.round(521.3));
		
		// Math.rount()로 원하는 자릿수에서 반올림하기
		// - 반올림하고 싶은 자리를 소수 첫째 자리로 만들만큼 곱한후 다시 나눈다.
		double value = 333.34567;
		
		value = value *10000;
		System.out.println(Math.round(value)/10000.0);
	}
}

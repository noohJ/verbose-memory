
public class B01_Operator02 {

	public static void main(String[] args) {
		
		/*
		   # 비교 연산
		   
		 	- 두 값을 비교하여 참 또는 거짓의 결과를 내는 연산
		 	- 비교 연산의 결과는 boolean 타입 값이다.
		 	- 산술 연산과 함꼐 사용하면 산술 연산을 먼저 계산한다.
		 */
		int a = 7, b = 8;
		
		System.out.printf("a가 %d이고, b가 %d일때\n", a,b);
		System.out.println("a > b : " + (a > b));
		System.out.println("a > b : " + (a < b));
		System.out.println("a > b : " + (a >= b));
		System.out.println("a > b : " + (a >= b));
		System.out.println("a > b : " + (a == b));
		System.out.println("a > b : " + (a != b));
		
		// >=, <= 사용시 반드시 부등호가 먼저 나와야 하낟. (=<, => 는 금지)
		
		/*
		  	# 논리 연산자
		  
		  	 - boolean 타입 값으로 하는 연사
		  	 - 비교 연산과 논리 연산이 함께 있으면 비교 연산을 먼저 계산하다.
		  	 - && : 두 값이 모두 true일 떄만 true (AND 연산)
		  	 - || : 두 값 중 하나만 true여도 ture (OR 연산)
		  	 - !  : true면 false, false면 true로 변환 (NOT 연산)
		 */
		System.out.println("\n#### AND ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && true);
		
		System.out.printf("TEST: %s\n", a > b - 5 && a < 20);
		
		System.out.println("\n#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\n#### NOT ####");
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
	}
}

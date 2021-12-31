
public class B10_Random {

	/*
	  	# 무작위 숫자 생성하기
	  	
	  	 1. Math.random() 함수 이용하기 	 
	  	 
	  	  - 0 <= x < 1 의 double타입 랜덤 소수를 생성한다.
	  	  - 이 랜덤 소수를 활용하여 원하는 범위의 숫자를 만들어 사용한다
	  	  
	  	  ※ 원하는 범위의 정수를 만드는 절차 (ex : 15 ~ 65)
	  	  
	  	  (1) 생성된 소수에 원하는 숫자의 개수를 곱한다. (51)
	  	   0 * 51 <= x < 1 * 51 
	  	  
	  	  (2) 원하는 숫자 중 가장 작은 숫자를 더한다 (+15)
	  	   0 + 15 <= x < 51 +15
	  	   
	  	  (3) 소수점 아래를 삭제한다 (int)
	 */
	
	public static void main(String[] args) {
		System.out.println((int)(Math.random() * 51 +15));
		
		// 연습문제 : 1 ~ 45의 랜덤 숫자를 7개 출력해보세요
		for (int i = 1 ; i <= 7; ++i) {
			System.out.println((int)(Math.random() * 45 + 1));
		}
	}
}

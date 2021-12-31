
public class B06_For {
	
	/*
	   	# 반복문 (loop)
	  
	  	 - for, while, for-each, do-while(X)
	  	 - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
	  	 
	  	# for 문
	  	
	  	 for (초기값; 반복조건; 증가폭) {
	  	 	가운데의 반복 조건이 참인 동안 반복될 내용
	  	 }
	  	 
	  	 - 초기값, 반복조건, 증가폭을 자유롭게 변경하며 용도에 맞게 사용해야 한다.
	  	 - 초기값, 반복저건, 증가폭은 꼭 넣지 않아도 된다 
	 */
	public static void main(String[] args) {
		/*
		    1. 가장 기본적인 형태의 for문
		  	 - 초기값에는 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다.
		  	 - 증가는 1씩 한다.
		  	 - 원하는 횟수만큼 반복하기 가장 좋은 for문
		 */
		for (int i = 0; i <10; ++i) {
			System.out.println("Hello, world! " + i);
		}
		String str = "Common sense is not so common";
		
		// 문자열 한글자식 똑바로 읽기
		
		for (int index = 0; index < str.length(); ++index ) {
			System.out.println("한 글자씩 출력해보기: " + str.charAt(index));
		}
		
		System.out.println("----------------------------");
		
		//문자열 한글자씩 거꾸로 읽기
		int len = str.length();
		for (int index = len - 1; index >= 0; --index) {
			System.out.println("한 글자씩 출력해보기: " + str.charAt(index));
		}
	}
}

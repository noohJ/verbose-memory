
public class A04_VarNaming {

	public static void main(String[] args) {
		/*
		  	# 우리가 변수를 사용하는 이유
		  	
		  	1.값을 한번에 변경할 수 있다.
		  	 - 같은 의미를 지닌 값을 일일이 찾아다니면서 여러번 수정할 필요가 없어진다.
		  	 
		  	2. 값에 의미를 부여할 수 있다.
		  	 - 변수의 이름을 잘 지어두면 해당 변수의 용도를 쉽고 빠르게 파악할 수 있다.
		 */
		int apple_count = 5;
		int apple_price = 833;
		int apple_calorie = 90;
		
		System.out.println("사과의  개수: " + apple_count);
		System.out.println("개당 가격: " + apple_price);
		System.out.println("사과의 총 가격: " + apple_count * apple_price);
		System.out.println("사과의 총 칼로리: " + apple_count * apple_calorie);
		
		/*
		  	# 변수의 작명 규칙 (권장 사항)
		  
		  	 (1) 두 단어 이상을 이어붙인 변수명을 사용할 때 _를 활용한다.(sanke_case)
		  	   ex: apple_count, apple_price, minse_age
		  	   
		  	 (2) 두 단어 이상을 이어붙인 변수명을 사용할 때 대문자를 활용한다.(camelCase)
		  	   ex: javaStudy, appleCount, applePrice, minsuAge
		  	   
		  	 (3) 변수명을 첫 글자는 소문자를 사용한다.
		  	 
		  	 (4) 클래스명의 첫 글자는 대문자를 사용한다 (참조형 변수)
		  	 
		  	 (5) 프로그램 실행 도중 값이 변하지 않는 변수(상수)는 모두 대문자를 사용한다.
		  	   ex: MAX_VALUE, BASKET_SIZE, MAX_SCORE, PI, APPLE_CALORIE
		  	   
		  	 (6) 변수의 용도를 파악할 수 있도록 이름을 잘 지어야 한다.
		  	 
		    # 변수의 작명 규칙2 (필수, 안지키면 에러)
		     (1) 변수의 첫 번째 글자는 숫자가 될 수 없다.
		     
		     (2) 변수명 사이에는 공백을 사용할 수 없다.
		     
		     (3) 특수문자는 _와$만 사용할 수 있다.
		     
		     (4) 이미 해당 언어에서 사용중인 키워드는 변수명으로 사용할 수 없다.
		         (Eclipse의 경우 보라색으로 표시된다.)
		       ex: int, long, void, public, static ...
		 */
	}
}

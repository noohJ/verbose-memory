
public class A02_Variable {
	/*
	 	# 변수 (Variable)
	  
	  	 - 데이터를 담을 수 있는 공간
	  	 - 변수는 반드시 먼저 사용하겠다고 선언한 뒤에 사용해야 한다.
	  	 - 같은 {} 내부에서 같은 이름의 변수는 다시 선언할 수 없다.
	  	 - 변수는 선언한 {}를 벗어나면 죽는다.(변수의 생명주기)
	  	 - 변수 선언시에는 그 변수에 저장할 데이터의 타입을 정해주어야 한다..
	  	 
	  	# 데이터 타입
	  	 
	  	 - 
	 */
	public static void main(String[] args) {
		// ※ 프로그래밍 언어에서 =은 왼쪽의 변수에 오른쪽의 값을 넣으라는 뜻이다. (대입 연산)
		
		/*
		 	# 변수의 선언 (declare, declaration)
		 	
		 	 - 변수를 선언할 때는 앞에 타입을 적고 뒤에 변수명을 적는다.
		 	 - 선언 후에 해당 변수에 처음으로 값을 넣는 것을 초기호라고 부른다.
		 	 - 선언 후에 초기화 하지 않는 변수는 사용할 수 없다.
		 	 - 선언과 동시에 초기화 할 수도 있고 나중에 초기화 할 수도 있
		 
		 */
		
		// 1. 선언만 하고 나중에 초기화 하기
		int a, b, c, d;
		int apple;
		int banana;
		
		apple = 50;
		a = 1;
		b = 2;
		c = a + b;
		
		System.out.println(apple);
		System.out.println(a*b*a*b*b*b*a*b*a*b*a*b*b*a);
		
		// 2. 선언과 동시에 초기화하기
		int x = 3, y = 7, z = 11;
		int peach = 500;
		int grape = 1200;
		
		System.out.println(peach = peach * x);
		System.out.println(peach = peach * y);
		
		System.out.println(peach);
	}
}


public class C01_Method {
	
	/* 
	  	  # 변수 (Variable)
	  	  
	  	   - 값을 미리 정의해두고 나중에 가져다 쓰는 것
	  	   
	  	  # 함수 (Function)
	  	  
	  	   - 기능을 미리 정해두고 나중에 가져다 쓰는 것
	  	   - 정의한 시점에서는 실행되지 않고 나중에 호출되었을 때 실행된다.
	  	   - 함수 이름 뒤에 ()를 붙여 해당 함수를 호출할 수 있다.
	  	   - 나중에 재사용 할 가능성이 있는 기능들을 함수로 만들어두면 작업의 반복을 줄일 수 있다.
	  	   - 자바에서 함수는 반드시 클래스 내부에 선언해야 한다.
	  	     (클래스 내부에 선언된 함수는 보통 메서드라고 부른다.)
	  	     
	  	  # 함수의 리턴 (return)
	  	  
	  	   - 함수를 정의할 때 함수명 앞에 해당 함수가 반환하는 값의 타입을 지정할 수 있다.
	  	   - 해당 함수를 호출하면 호출한 자리에 함수의 실행 결과가 반환(return)된다.
	  	   - 리턴 타입에 void를 적으면 해당 함수가 반환하는 값이 없다는 것을 의미한다.
	  	   - 함수 내부에서 return을 만나면 해당 함수를 즉시 종료한다.
	  	   
	  	  # 함수의 매개변수 (argument)
	  	  
	  	   - 함수를 호출할 때 ()안에 전달하는 값을 인자라고 한다.
	  	   - 함수를 정의할 떄 ()안에 인자값을 받을 수 있는  변수들을 선언하는데 이를 매개변수라고 한다.
	 */
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >&");
	}
	
	// ex: 사과의 개수를 전달하면 바구니가 몇 개 필요한지 알려주는 함수
	public static int appleBasket(int apple) {
		if (apple < 0 ) {
			return -1;
		}
		return apple % 10 == 0 ? apple / 10 : apple / 10+ 1;
		
	}
	
	public static void main(String[] args) {
		int need = appleBasket(123);
		System.out.println(need);
		printRabbit();
	
	}
}

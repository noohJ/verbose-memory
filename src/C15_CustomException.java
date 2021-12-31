
public class C15_CustomException {
	/*
	  	# 원하는 예외 직접 만들어서 사용하기
	  	
	  	 - Exception 을 상속 받으면 반드시 처리해야 하는 예외
	  	 - RuntimeException을 상속받으면 처리하지 않아도 되는 예외
	 */
	
	public static void main(String[] args) {
		try {
			test(213);			
		}catch (NotEvenException e) {
			e.printStackTrace();
		}
		
	}
	//Object : 모든 타입의 부모
	public static void test2(Object obj) throws NotSwimmerException{
		if (!(obj instanceof Swimmer)) {
			((Swimmer)obj).swim();
		}else {
			throw new NotSwimmerException();			
		}
	}
	
	public static boolean test(int num) throws NotEvenException  {
		if (num%2 ==0) {
			return true;
		}else {
			throw new NotEvenException();
		}
	}
}

class NotSwimmerException extends Exception{
	public NotSwimmerException() {
		super("수영을 못하는 객체");
	}
}

class NotEvenException extends Exception{
	
	public NotEvenException() {
		super("홀수입니다.");
	}
	public NotEvenException(String message) {
		super(message);
	}
}

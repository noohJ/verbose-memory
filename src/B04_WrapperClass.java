
public class B04_WrapperClass {
	/*
	  	# Wrapper Class
	  	
	  	 - 기본 타입들은 참조형 타입으로 감싸놓은 클래스
	  	 - 각 기본 타입들에 대한 유용한 기능들이 모여있다.
	  	
	  	# 기본형 타입들
	  	
	  	 - byte, short, char, int, long, float, double, oolean
	  	
	  	# 각 기본형 타입에 대한 참조형 이름들
	  	
	  	 - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
	
	public static void main(String[] args) {
		/*
		  	# Parsing
		  	
		  	 - 문자열을 해당 타입의 값으로 변환하는 것
		  	 - 각 Wrapper 클래스에 static 메서드로 존재한다.
		 */
		int num = Integer.parseInt("123456");
		System.out.println(num);
		
		float value = Float.parseFloat("123.4567");
		System.out.println(value);
		
		// true는 대소문자 관계없이 true로 적용 나머진 false.
		boolean result = Boolean.parseBoolean("Treu"); 
		System.out.println(result);
		
		/*
		  	# toString
		  	
		  	 - 각 타입의 값을 문자열로 변환하는 기능
		  	 - 원하는 진법(radix)을 선택할 수도 있다.		  
		 */
		
		String Hex = Double.toHexString(56542145465.4715467);
		System.out.println(Hex);
		
		System.out.println(Integer.toString(52345));
		System.out.println(Integer.toString(52345, 2));
		System.out.println(Integer.toString(52345, 8));
		System.out.println(Integer.toString(52345, 16));
		System.out.println(Integer.toString(52345, 32));
		
		// 각 타입들의 최대/최소값을 가지고 있는 상수들
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Character.MAX_RADIX);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		
		// Character에는 문자를 편하게 다룰 수 있는 static 메서드들이 많다.
		System.out.println(Character.isAlphabetic('3'));
		System.out.println(Character.isAlphabetic('Y'));
		
		System.out.println(Character.isDigit('3'));
		System.out.println(Character.isDigit('Y'));
		
		System.out.println(Character.isSpaceChar(' '));
		
	}
}

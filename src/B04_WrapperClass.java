
public class B04_WrapperClass {
	/*
	  	# Wrapper Class
	  	
	  	 - �⺻ Ÿ�Ե��� ������ Ÿ������ ���γ��� Ŭ����
	  	 - �� �⺻ Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�.
	  	
	  	# �⺻�� Ÿ�Ե�
	  	
	  	 - byte, short, char, int, long, float, double, oolean
	  	
	  	# �� �⺻�� Ÿ�Կ� ���� ������ �̸���
	  	
	  	 - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
	
	public static void main(String[] args) {
		/*
		  	# Parsing
		  	
		  	 - ���ڿ��� �ش� Ÿ���� ������ ��ȯ�ϴ� ��
		  	 - �� Wrapper Ŭ������ static �޼���� �����Ѵ�.
		 */
		int num = Integer.parseInt("123456");
		System.out.println(num);
		
		float value = Float.parseFloat("123.4567");
		System.out.println(value);
		
		// true�� ��ҹ��� ������� true�� ���� ������ false.
		boolean result = Boolean.parseBoolean("Treu"); 
		System.out.println(result);
		
		/*
		  	# toString
		  	
		  	 - �� Ÿ���� ���� ���ڿ��� ��ȯ�ϴ� ���
		  	 - ���ϴ� ����(radix)�� ������ ���� �ִ�.		  
		 */
		
		String Hex = Double.toHexString(56542145465.4715467);
		System.out.println(Hex);
		
		System.out.println(Integer.toString(52345));
		System.out.println(Integer.toString(52345, 2));
		System.out.println(Integer.toString(52345, 8));
		System.out.println(Integer.toString(52345, 16));
		System.out.println(Integer.toString(52345, 32));
		
		// �� Ÿ�Ե��� �ִ�/�ּҰ��� ������ �ִ� �����
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Character.MAX_RADIX);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		
		// Character���� ���ڸ� ���ϰ� �ٷ� �� �ִ� static �޼������ ����.
		System.out.println(Character.isAlphabetic('3'));
		System.out.println(Character.isAlphabetic('Y'));
		
		System.out.println(Character.isDigit('3'));
		System.out.println(Character.isDigit('Y'));
		
		System.out.println(Character.isSpaceChar(' '));
		
	}
}

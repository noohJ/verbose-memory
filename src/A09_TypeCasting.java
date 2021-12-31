
public class A09_TypeCasting {
	
	/*
	   	# Ÿ�� ĳ����
	   	
	   	 - �������� Ÿ���� ��ȭ��Ű�� ��
	   	 - Ÿ���� �ڿ������� ���ϴ� ���� ������ ��ȯ��Ű�� ��찡 �ִ�.
	   	 
	   	# �Ϲ��� Ÿ�� ĳ���� (Ÿ���� �ڿ������� ���ϴ� ���)
	   	
	   	 - ���� Ÿ�Կ��� ū Ÿ������ ���� ���� �ƹ� ������ ������ �ʴ´�.
	   	 - �� �ܿ��� ������ ������ ���� Ÿ�� ��ȯ�� ĳ������ �������� �ʾƵ� ������ ���Ѵ�.
	   	
	   	# ����� Ÿ�� ĳ���� (���α׷��Ӱ� ���� ������ ��ȭ��Ű�� ���)
	   	
	   	 - ū Ÿ���� ���� ���� Ÿ������ ��ȯ ��ų ���� ������ ���� ���ɼ��� �ִ�.
	   	 - �� �ܿ��� ������ ���� ���ɼ��� �ִ� Ÿ�� ��ȯ�� ��������� Ÿ���� ��ȯ���Ѿ� �Ѵ�.
	   	 
	   	# Ÿ���� ũ�� ����
	   	
	   	 byte < short < int < long < float < double
	   	 
	   	 char : ��ȣ�� ���� Ÿ��
	 */
	public static void main(String[] args) {
		long _long = Long.MAX_VALUE;
		float _float = _long;
		
		int _int = 29950;
		byte _byte = 127;
		
		_byte = (byte)_int;
		
		System.out.println("longŸ�� �ִ밪�� float�� ���� ��: " + _float);
		System.out.println("longŸ�� �ּҰ��� float�� ���� ��: " + (float)Long.MIN_VALUE );
		System.out.println("������ byte�� ��ȯ��Ų 30000: " +_byte);
		
		// ũ�⿡ ������� ������ ���� ���ɼ��� �ִ� ��� Ÿ�� ĳ������ �ʿ��ϴ�.
		byte _byte2 = -1; 
		char ch = (char)_byte2;
		System.out.println("ch: " + (int)ch);
		
		//������ ������ ������ ���� �ٸ��� �ؼ��� �ʿ䰡 �ִ� ��쿡�� Ÿ���ɽ����� ����Ѵ�.
		System.out.println((char)122);
		System.out.println((int)122);
	}
}

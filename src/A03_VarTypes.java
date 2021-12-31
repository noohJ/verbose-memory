import java.io.PrintStream;

public class A03_VarTypes {

		/*
		  	# ���� Ÿ��
		  	
		  	 - byte  (1byte, 8bit)   -128 ~ +127
		  	 - short (2byte, 16bit)  -32768 ~ +32767
		  	 - char  (2byte, 16bit)  �� ���� �ڵ�� ������ ����. 0 ~ 65535
		  	 - int   (4byte, 32bit)  -21�� ~ +21��
		  	 - long  (8byte, 64bit)  ...
		 */
	public static void main(String[] args) {
		byte min_byte = Byte.MIN_VALUE; //-128;
		byte max_byte = Byte.MAX_VALUE; //127;
		short min_short = Short.MIN_VALUE; //-32768;
		short max_short = Short.MAX_VALUE; //32767;
		int min_int = Integer.MIN_VALUE;
		int max_int = Integer.MAX_VALUE;
		long min_long = Long.MIN_VALUE;
		long max_long = Long.MAX_VALUE;
		
		// ���� ���ͷ��� �⺻ Ÿ���� int Ÿ���̴�.
		// int�� ������ ����� ���� ���ͷ��� ����ϰ� �ʹٸ� �ڿ� L�� �ٿ��� �Ѵ�.
		long _long = 10000000000L;
		
		System.out.println(max_int);
		System.out.println(max_long);
		
		// �ش� Ÿ�� ���� ���ϴ� ���� ���ڿ��� �ٲٱ�
		System.out.println(Integer.toString(min_int, 8));
		System.out.println(Long.toString(_long, 2));
		
		/*
		  	# �Ǽ� Ÿ��
		  	
		  	 - float  (4byte)
		  	 - double (8byte)
		  	 
		  	 �Ǽ��� �ַ� �׷��� ��꿡 ���Ǹ� �� �о߿����� ���� ������� �ʴ�
		 */
		
		// �Ǽ� ���ͷ��� �⺻ Ÿ���� double Ÿ���̴�.
		double _double = 123.1234;
		
		// �Ǽ� ���ͷ���  float ������ �ֱ� ���ؼ��� �ڿ� F�� �ٿ����Ѵ�.
		float _float = 123.1234F;
		
		/*
		  	# ��/���� Ÿ��
		  	
		  	- boolean
		  	- boolean Ÿ�Կ� �� �� �ִ� ���� true�� false���� ����.
		 */
		boolean male = true;
		boolean powerOn = true;
		boolean overEighteen = false;
		
		/*
		 	# ������ Ÿ��
		 	
		 	 - �빮�ڷ� �����ϴ� ��� Ÿ��
			 - ������ ��� �ҹ��ڷ� �����ϴ� ��� Ÿ�Ե��� �⺻�� Ÿ���̶�� �θ���.
			 - String
			 - �� �� ��� Ŭ���� Ÿ�Ե�...
		 */
		String hello1 = "�ȳ��ϼ���~";
		String hello2 = "�ݰ����ϴ�!";
		
		PrintStream stream = System.out;
		
		System.out.println(hello1);
		System.out.println(hello2);
		stream.println(hello1);
		stream.println(hello2);
	}
	
}

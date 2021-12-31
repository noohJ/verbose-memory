
public class A06_Operator01 {
	/*
	 	# ������ (Operator)
	 	
	 	 - ����� �� ����ϴ� ��
	 	 - +, -, *, /, >, <, <=, >= ...
	 	 
	 	# ��� ������
	 	 -  +, -, *, /, % 
	 */
	public static void main(String[] args) {
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		// �������� ������ �� ���Ѵ�.
		System.out.println(a / b);
		// ������ ���꿡 �Ǽ��� ���ԵǾ� ������ ��Ȯ�� ����� �Ѵ�.
		System.out.println(a / c);
		
		// ������ ����
		System.out.println(a % b);
		
		// �� ^�� ������ �ƴ϶� ��Ʈ �����̴�.
		System.out.println(a ^ b);
		
		// Math.pow(a, b) : a�� b������ ����Ͽ� ��ȯ���ִ� �Լ�
		double result = Math.pow(3, 5);
		System.out.println(result);
		System.out.println(Math.pow(3, 10));
		
		// Math.sqrt(a) : a�� �������� ���ؼ� ��ȯ�Ѵ�.
		System.out.println(Math.sqrt(49));
		
		// Math.abs(a) : a�� ���밪�� ���ؼ� ��ȯ�Ѵ�
		System.out.println(Math.abs(55));
		System.out.println(Math.abs(-55));
		
		// Math.round(a) : a�� �Ҽ� ù° �ڸ����� �ݿø��� ����� ��ȯ�Ѵ�.
		System.out.println(Math.round(1234.6));
		System.out.println(Math.round(521.3));
		
		// Math.rount()�� ���ϴ� �ڸ������� �ݿø��ϱ�
		// - �ݿø��ϰ� ���� �ڸ��� �Ҽ� ù° �ڸ��� ���鸸ŭ ������ �ٽ� ������.
		double value = 333.34567;
		
		value = value *10000;
		System.out.println(Math.round(value)/10000.0);
	}
}


public class B05_Operator03 {
	/*
	   	# ���� ����
	    
	     - = : ������ ������ �������� ���� �����Ѵ�
	     
	    # ���� ���� ������
	    
	     - ������ ����� ������Ű�� ������ �ٿ��� ǥ���Ѵ�
	     - +=, -=, *=, ...
	 */
	public static void main(String[] args) {
		int num = 10;
		
		num = num *2;
		num*=2; //numb = num * 2;
		num*=2;
		num*=2;
		
		System.out.println(num);
		
		num = 30;
		
		num += 3;
		
		System.out.println(num);
		num -= 15;
		System.out.println(num);
		num *= 3;
		System.out.println(num);
		num /= 5;
		System.out.println(num);
		num %= 3;
		System.out.println(num);
		
		/*
		    # ���� ������
		  
		  	 - 1�� ������Ű�� ������ �� �ٿ��� ǥ���� ����
		  	 - ++, --�� ��ġ�� ���� ����� �޶�����.
		  	 - ++, --�� �ڿ� ���̸� �ش� ���� ��� ����� ������ �Ŀ� ���� ��ȭ��Ų��.
		  	 - ++, --�� �տ� ���̸� �ش� ���� ����� �����ϱ� ���� ���� ��ȭ��Ų��.��
		 */
		num = 10;
		System.out.println(num += 7);
		System.out.println(num += 1);
		
		System.out.println("------------------------");
		
		num = 10;
		
		System.out.println(num++);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);

	}
}


public class A04_VarNaming {

	public static void main(String[] args) {
		/*
		  	# �츮�� ������ ����ϴ� ����
		  	
		  	1.���� �ѹ��� ������ �� �ִ�.
		  	 - ���� �ǹ̸� ���� ���� ������ ã�ƴٴϸ鼭 ������ ������ �ʿ䰡 ��������.
		  	 
		  	2. ���� �ǹ̸� �ο��� �� �ִ�.
		  	 - ������ �̸��� �� ����θ� �ش� ������ �뵵�� ���� ������ �ľ��� �� �ִ�.
		 */
		int apple_count = 5;
		int apple_price = 833;
		int apple_calorie = 90;
		
		System.out.println("�����  ����: " + apple_count);
		System.out.println("���� ����: " + apple_price);
		System.out.println("����� �� ����: " + apple_count * apple_price);
		System.out.println("����� �� Į�θ�: " + apple_count * apple_calorie);
		
		/*
		  	# ������ �۸� ��Ģ (���� ����)
		  
		  	 (1) �� �ܾ� �̻��� �̾���� �������� ����� �� _�� Ȱ���Ѵ�.(sanke_case)
		  	   ex: apple_count, apple_price, minse_age
		  	   
		  	 (2) �� �ܾ� �̻��� �̾���� �������� ����� �� �빮�ڸ� Ȱ���Ѵ�.(camelCase)
		  	   ex: javaStudy, appleCount, applePrice, minsuAge
		  	   
		  	 (3) �������� ù ���ڴ� �ҹ��ڸ� ����Ѵ�.
		  	 
		  	 (4) Ŭ�������� ù ���ڴ� �빮�ڸ� ����Ѵ� (������ ����)
		  	 
		  	 (5) ���α׷� ���� ���� ���� ������ �ʴ� ����(���)�� ��� �빮�ڸ� ����Ѵ�.
		  	   ex: MAX_VALUE, BASKET_SIZE, MAX_SCORE, PI, APPLE_CALORIE
		  	   
		  	 (6) ������ �뵵�� �ľ��� �� �ֵ��� �̸��� �� ����� �Ѵ�.
		  	 
		    # ������ �۸� ��Ģ2 (�ʼ�, ����Ű�� ����)
		     (1) ������ ù ��° ���ڴ� ���ڰ� �� �� ����.
		     
		     (2) ������ ���̿��� ������ ����� �� ����.
		     
		     (3) Ư�����ڴ� _��$�� ����� �� �ִ�.
		     
		     (4) �̹� �ش� ���� ������� Ű����� ���������� ����� �� ����.
		         (Eclipse�� ��� ��������� ǥ�õȴ�.)
		       ex: int, long, void, public, static ...
		 */
	}
}

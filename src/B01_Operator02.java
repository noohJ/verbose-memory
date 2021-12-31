
public class B01_Operator02 {

	public static void main(String[] args) {
		
		/*
		   # �� ����
		   
		 	- �� ���� ���Ͽ� �� �Ǵ� ������ ����� ���� ����
		 	- �� ������ ����� boolean Ÿ�� ���̴�.
		 	- ��� ����� �Բ� ����ϸ� ��� ������ ���� ����Ѵ�.
		 */
		int a = 7, b = 8;
		
		System.out.printf("a�� %d�̰�, b�� %d�϶�\n", a,b);
		System.out.println("a > b : " + (a > b));
		System.out.println("a > b : " + (a < b));
		System.out.println("a > b : " + (a >= b));
		System.out.println("a > b : " + (a >= b));
		System.out.println("a > b : " + (a == b));
		System.out.println("a > b : " + (a != b));
		
		// >=, <= ���� �ݵ�� �ε�ȣ�� ���� ���;� �ϳ�. (=<, => �� ����)
		
		/*
		  	# �� ������
		  
		  	 - boolean Ÿ�� ������ �ϴ� ����
		  	 - �� ����� �� ������ �Բ� ������ �� ������ ���� ����ϴ�.
		  	 - && : �� ���� ��� true�� ���� true (AND ����)
		  	 - || : �� �� �� �ϳ��� true���� ture (OR ����)
		  	 - !  : true�� false, false�� true�� ��ȯ (NOT ����)
		 */
		System.out.println("\n#### AND ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && true);
		
		System.out.printf("TEST: %s\n", a > b - 5 && a < 20);
		
		System.out.println("\n#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\n#### NOT ####");
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
	}
}

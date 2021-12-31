
public class A05_Print {
	public static void main(String[] args) {
		/*
		  	# �ֿܼ� ����ϴ� �Լ�
		  	
		  	 1. print()
		  	  - ���� �ڵ����� �ٲ����� �ʴ� ���� �⺻ ��� �Լ�
		  	  
		  	 2. println()
		  	  - ����� �� �� �� �ڵ����� \n�� �߰��ϴ� ���� ��� �Լ�
		  	 
		  	 3. printf()
		  	  - print format
		  	  - ������ �̿��� ���ϴ� ��� ���¸� ����� ����ϴ� �Լ�
		  	  - ���� ���� �ڸ��� ���� ������� ä���� ����Ѵ�.
		  	  - ���� �ڵ����� �ٲ����� �ʴ´�.
		  	  
		  	  �� ���� ������ ����
		  	  
		  	  %d : �ش� �ڸ��� ������ �������� 10������ ��� (decimal)
		  	  %x : �ش� �ڸ��� ������ �������� 16������ ��� (hexa decimal)
		  	  %X : �ش� �ڸ��� ������ �������� 16������ ��� (hexa decimal) / ABCDEF �빮�ڷ� ���
		  	  %o : �ش� �ڸ��� ������ �������� 8������ ��� (octal)
		  	  %s : �ش� �ڸ��� ���ڿ��� ������ �� �ִ�.
		  	  %f : �ش� �ڸ��� �Ǽ��� ������ �� �ִ�.
		  	  %c : �ش� �ڸ��� ���ڸ� ������ �� �ִ�.
		  	  
		 */
		
		String name = "ȫ�浿";
		double weight = 75.0;
		float height = 187F;
		char gender = 'M';
		
		System.out.printf("�̸�\t: %s\n������\t: %f\n����\t: %f\n����\t: %c\n",
				name, weight, height, gender);
		
		int year, month, day, hour, minute, second, millisecond;
		
		year = 2021;
		month = 11;
		day = 10;
		hour = 9;
		minute = 28;
		second = 35;
		millisecond = 58;
		
		System.out.print("Hello, world!");
		System.out.print("Hello, world!\n");
		System.out.print("Hello, world!");
		
		System.out.println(year + "�� " + month + "�� " + day + "�� " + hour + ":" + minute + ":" + second + "." + millisecond);
		
		System.out.printf("%d�� %d�� %d�� %d:%d:%d.:03%d\n",
				year, month, day, hour, minute, second, millisecond);
		
		
	/*
	  	# ���� ���� �ɼǵ�
	  	
	  	1. %����d
	  	 - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ����Ѵ�. 
	  	 
	  	2. %-����d
	  	 - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ���� �����Ͽ� ����Ѵ�.
	  	 
	  	3. %0����d
	  	 - �ڸ����� ���ڸ�ŭ Ȯ���ϰ� ���ڸ��� 0�� ä�� ����Ѵ�.
	  	
	  	4. %.����f
	  	 - �Ǽ��� �Ҽ��� �Ʒ� �ڸ����� �����Ѵ�.
	  
	 */
		System.out.printf("%10s\n", "abcd");
		System.out.printf("%15s\n", "abcd");
		System.out.printf("%20s\n", "abcd");
		
		System.out.printf("%-5s:\n", "Name");
		System.out.printf("%-10s:\n", "Name");
		System.out.printf("%-15s:\n", "Name");
		System.out.printf("%-20s:\n", "Name");
		
		System.out.printf("%04d\n", 123);
		System.out.printf("%06d\n", 123);
		System.out.printf("%012d\n", 123);
		
		System.out.printf("%.2f\n", 1123.1234567);
		System.out.printf("%.4f\n", 1123.1234567);
		System.out.printf("%.6f\n", 1123.1234567);
		System.out.printf("%.10f\n", 1123.1234567);
		
	}
}

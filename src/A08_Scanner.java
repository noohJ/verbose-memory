
import java.util.Scanner;

public class A08_Scanner {
	
	/*
	  	# java.util.Scanner Ŭ����
	  	
	  	 - ���α׷� �ܺηκ����� �Է��� ���α׷����� ���� �� �ִ� ��ɵ��� �����Ǿ� �ִ� Ŭ����
	  	 - ��𿡼� �Է� ������ ������ �ڿ� �پ��� ������ ���ڿ��� �Է¹��� �� �ִ�.
	  	 
	  	# System
	  	
	  	 - ���� �ü���� �ܼ��� ���Ѵ�.
	  	 - System.out : ���α׷����� �ַܼ� �����͸� ������ �� �ִ� ��� (���)
	  	 - System.in : ���α׷��� �ܼ��� �����͸� �о���� �� �ִ� ��� (�Է�)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		  	# Scanner Ŭ������ nextInt()
		  	
		  	 - �������� �Է¹޴� ������ �ϳ� ������.
		   	 - ��ĳ�ʿ� ���� ���� �ƹ��͵� ���� ���� ���α׷��� ���߰� �Է��� ��ٸ���.
		   	 - ������ �Է¹޾ƾ� �Ѵ�.
		   	 - next �ڿ� �ٸ� Ÿ�� �Լ����� ���� �ٸ� Ÿ�Ե鵵 �Է¹��� �� �ִ�.
		 */
		System.out.print("������ �ϳ� �Է��غ����� > ");
		int num = sc.nextInt();
		
		System.out.printf("�Է��Ͻ� ������ %d�Դϴ�.\n", num);
		
		System.out.print("����� ������ �Է��غ����� > ");
		int apple = sc.nextInt();
		
		System.out.printf("�����Ͻ� �ݾ��� %d�� �Դϴ�.\n", apple * 500);
		
		System.out.println("ȭ���� ���Ը� �Է��غ����� > ");
		double weight = sc.nextDouble();
		
		System.out.printf("ȭ���� ����: %.2fkg\n", weight);
		
		
	}
}

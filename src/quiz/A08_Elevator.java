package quiz;

import java.util.Scanner;

public class A08_Elevator {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);  // Ctrl + shift + O (�ڵ� import)
		
		double first_stuff, second_stuff; 
		
		System.out.print("�� ȭ���� ���Ը� �Է��ϼ��� > ");
		first_stuff = sc.nextDouble();
		second_stuff = sc.nextDouble();
		
		System.out.println("ȭ��1:" + first_stuff + "kg");
		System.out.println("ȭ��2:" + second_stuff + "kg");
		System.out.printf("��밡���� ���Դ� %.2fkg �Դϴ�.\n", 600-(first_stuff+second_stuff));
		
	}
}

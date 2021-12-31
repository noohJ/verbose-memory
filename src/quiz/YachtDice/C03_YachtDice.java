package quiz.YachtDice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_YachtDice {
	/*
	  	# Yacht Dice�� ��������
	  	
	  	1. �÷��̾�� �ڱ� ���ʿ� �ټ� ���� �ֻ����� ������. (�ֻ��� ���� 1 ~ 6)
	  
	  	2. �ټ� ���� �ֻ����� ����� ���� ������ �����ؾ� �Ѵ�.
	  	
	  	 (1) Ǯ�Ͽ콺 (���� ���� 2�� /3��) ex: 11333, 31313,66655
	  	 (2) ������Ʈ����Ʈ (���ӵǴ� 4���� ��) ex: 1234, 2345, 3456
	  	 (3) ���� ��Ʈ����Ʈ (���ӵǴ� 5���� ��) ex: 12345. 23456
	  	 (4) 4 ���̽� (���� ���� 4��)
	  	 (5) 5 Yacht (���� ���� 5��)
	  	 (6) �ƹ��͵� �������� ���� ��� �ֻ��� �� ������  ������ ����.
	  	 
	  	3. �÷��̾�� �ٽ� ������ ���� �ֻ����� ��� �ٽ� ���� �� �ִ�. (2ȸ) 	  	 
	 */
	public static void main(String[] args) {
		RandomDice Player1 = new RandomDice();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		Player1.throwing();  // �ֻ��� ������
		Player1.myDice();  // �� �ֻ���
		Player1.check();  // �ֻ��� üũ
		
		
		while (count <2) {
			System.out.print("�ֽ����� ��ü �Ͻðڽ��ϱ�?> \n (1.�� 2.�ƴϿ�)");
			int yn = sc.nextInt();
			
			if (yn == 2) {
				break;
			}
			++count;
			System.out.println("��� �ֻ����� ��ü �ϰڽ��ϱ�?");
			
			int throwDice = sc.nextInt();
			
			System.out.println("��� �ֻ����� ��ü �ϰڽ��ϱ�?");
			for (int i = 0; i < Player1.array.length; ++i) {
				Player1.array[i] = 0;
			}
			int[] num = new int[throwDice];
			for (int i = 0; i < num.length; ++i) {
				num[i] = sc.nextInt();
			}
			for (int i = 0; i <num.length; ++i) {				
				Player1.dice[num[i]-1] =(int)(Math.random()*6+1);
			}
			
			Player1.myDice();  // �� �ֻ���
			Player1.check();  // �ֻ��� üũ
			
		}
	}
}

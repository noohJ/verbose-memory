package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C03_PirateGame {
	
	/*
	  	������� ������ ����� ������
	  	
	  	0. ������ ���۵Ǹ� �÷��̾ ����̴� ���Ѵ�.
	  	
	  	1. ���� �÷��̾ ���ư��鼭 ���ϴ� ��ġ�� Į�� ���.
	  	
	  	2. Į�� � �� �ִ� Ȩ�� 20���� �ְ�, ���� 2���� ���� �ȴ�. (���Ǹ��� �������� ����)
	  	
	  	3. �߸��� ���� Į�� � �÷��̾ ���ӿ� �й��Ѵ�.
	  	
	  	4. ������ ��� �̾ �÷��� �� �� �ְ�, �� �÷��̾��� ������ ���� ����Ǿ�� �Ѵ�. 
	 */
	
	public static void main(String[] args) {

		boolean start = true;
		boolean game = true;
		int insertNum, con, user;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �÷��̾ ���� �մϱ�? > ");
		int totalPlayer = sc.nextInt();
		int[] defeat = new int[totalPlayer];

		while (start) {
			Barrel barrel1 = new Barrel();
			while(game) {
				user = 1;
				while (user <= totalPlayer && game ) {
					System.out.println("����� ��ڽ��ϴ�? (1 ~ 20)");
					System.out.printf( "%d�� �÷��̾� > ",user);
					insertNum = sc.nextInt();
					
					if (barrel1.tong[insertNum] != 99) {
						if(barrel1.tong[insertNum] == 0) {
							System.out.println("��");
							++defeat[user-1];
							game =false;
							System.out.print("1.����ϱ� / 2.�׸��α�");
							con = sc.nextInt();
							if (con ==2 ) {
								start =false;
								break;
							}else {
							game =false;
							start =true;
							}
						} else {
							barrel1.tong[insertNum] = 99;
							++user;
						}					
					}else {
						System.out.println("�̹� ������ ��ȣ�Դϴ�.");
					}
				}				
			}
		}

		
		for (int i = 0 ; i < defeat.length; ++i) {
			System.out.printf("%d��° �÷��̾��� �й�� : %d\n",i+1,defeat[i]);
		}
	}
}
//���� ����
class Barrel {
	int[] tong = new int[20];
	
	Barrel() {
		for (int i = 0, num = 1; i < tong.length; ++i, ++num) {
			tong[i] = num; 
		}
		int fail1 = (int)(Math.random() * 20 );
		tong[fail1] = 0;
		while(true) {
			int fail2 = (int)(Math.random() * 20 );
			if (tong[fail2] != 0) {
				tong[fail2] = 0;
				break;
			}
		}
	}
}

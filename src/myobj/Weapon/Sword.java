package myobj.Weapon;

public class Sword extends Weapon{
	
	public Sword() {
		super("Į",30,1);
	}
	
	public void upgrade() {
		if (level < 6) {
			if (ceiling == 100) {
				System.out.println("������ ����� 100 �Դϴ�");
				System.out.println("��ȭ ����");
				level +=1;
				ceiling = 0;
				attack +=13;
			}else if ((int)(Math.random()*100 + 1) > 10) {
				level +=1;
				ceiling = 0;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=13;
			}else {
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				ceiling +=30;
			}
		} else if (level < 10) {
			if (ceiling == 100) {
				System.out.println("������ ����� 100 �Դϴ�");
				System.out.println("��ȭ ����");
				level +=1;
				ceiling = 0;
				attack +=20;
			}else if ((int)(Math.random()*100+1) > 20) {
				level +=1;
				ceiling = 0;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=20;
			}else {
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				ceiling +=20;
			}
		} else if (level < 12) {
			if (ceiling == 100) {
				System.out.println("������ ����� 100 �Դϴ�");
				System.out.println("��ȭ ����");
				level +=1;
				ceiling = 0;
				attack +=30;
			}else if ((int)(Math.random()*100+1) > 30) {
				level +=1;
				ceiling = 0;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=30;
			}else {
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				ceiling +=10;
			}
		} else if (level < 14) {
			if (ceiling == 100) {
				System.out.println("������ ����� 100 �Դϴ�");
				System.out.println("��ȭ ����");
				level +=1;
				ceiling = 0;
				attack +=40;
			}else if ((int)(Math.random()*100+1) > 50) {
				level +=1;
				ceiling = 0;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=40;
			}else {
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				ceiling +=7;
			}
		} else if (level < 16) {
			if (ceiling == 100) {
				System.out.println("������ ����� 100 �Դϴ�");
				System.out.println("��ȭ ����");
				level +=1;
				ceiling = 0;
				attack +=50;
			}else if ((int)(Math.random()*100+1) > 75) {
				level +=1;
				ceiling = 0;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=50;
			}else {
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				ceiling +=5;
			}
		} else if (level < 18) {
			if (ceiling == 100) {
				System.out.println("������ ����� 100 �Դϴ�");
				System.out.println("��ȭ ����");
				level +=1;
				ceiling = 0;
				attack +=60;
			}else if ((int)(Math.random()*100+1) > 80) {
				level +=1;
				ceiling = 0;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=60;
			}else {
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				ceiling +=3;
			}
		} else if (level < 20) {
			if (ceiling == 100) {
				System.out.println("������ ����� 100 �Դϴ�");
				System.out.println("��ȭ ����");
				System.out.println("��ȭ ��ġ�� �ִ� �Դϴ�.");
				level +=1;
				ceiling = 0;
				attack +=100;
			}else if((int)(Math.random()*100+1) > 99) {
				level +=1;
				ceiling = 0;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=100;
				System.out.println("��ȭ ��ġ�� �ִ� �Դϴ�.");
			}else {
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				ceiling +=1;
			}
		}else {
			System.out.println("���̻� ��ȭ�� �� �� �����ϴ�.");

		}
	}
}
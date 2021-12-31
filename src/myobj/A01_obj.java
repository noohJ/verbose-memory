package myobj;
/*
  	��������
  	
  	 - myobj ��Ű���� ��� ���迡 �ִ� Ŭ�������� ������ ������
  	 - �θ� Ŭ����, �ڽ� Ŭ����, �������̵�, �� ĳ���� ���� �ǽ��� �� �ִ� ������ ���� ��
  	 - ���� ����, ���� ����, �Ĺ� ����, ���� ����, Ŀ�� ����
  
 */

import java.util.Scanner;

public class A01_obj {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Menu totla = new Menu();
		
		MainMenu mm1 = new MainMenu("1. ġ�����", 2000);
		MainMenu mm2 = new MainMenu("2. ����ġ�����", 4500);
		MainMenu mm3 = new MainMenu("3. �Ұ�����", 4100);
		MainMenu mm4 = new MainMenu("4. �������", 4100);
		MainMenu mm5 = new MainMenu("5. ��������", 6100);
		
		SideMenu sm1 = new SideMenu("1. ġ�ƽ", 1000);
		SideMenu sm2 = new SideMenu("2. ġŲ�ʰ�", 1800);
		SideMenu sm3 = new SideMenu("3. �ڿｽ��", 1400);
		SideMenu sm4 = new SideMenu("4. ����Ƣ��", 1600);
		SideMenu sm5 = new SideMenu("5. ġ�", 2000);
		
		Drink dm1 = new Drink("1. �ݶ�", 1000);
		Drink dm2 = new Drink("2. ���̴�", 1000);
		Drink dm3 = new Drink("3. ��", 500);
		Drink dm4 = new Drink("4. ������ �ֽ�", 800);
		Drink dm5 = new Drink("5. Ŀ��", 1200);
		

		
		boolean bill = true;
		while (bill) {
			System.out.println("� �޴��� ���ðڽ��ϱ�. (1. ���� �޴�/2. ���̵� �޴�/3. ����)> ");
			int num = sc.nextInt();
			if (num == 1) {
				mm1.info(); mm2.info(); mm3.info(); mm4.info(); mm5.info();
				System.out.println("�߰��Ͻ� �޴��� �����ϼ��� (1~5)");
				int mmn = sc.nextInt();
				if (mmn == 1) {
					mm1.addMenu();
				} else if (mmn == 2) {
					mm2.addMenu();
				} else if (mmn == 3) {
					mm3.addMenu();
				} else if (mmn == 4) {
					mm4.addMenu();
				} else if (mmn == 5) {
					mm5.addMenu();
				}
				System.out.println("�޴��� �߰� �Ͻðڽ��ϱ�? (1.�� 2.�ƴϿ�)");
				int ch = sc.nextInt();
				if (ch == 1) {
					continue;
				} else if (ch == 2) {
					bill = false;
				}
			} else if (num == 2) {
				sm1.info(); sm2.info(); sm3.info(); sm4.info(); sm5.info();
				System.out.println("�߰��Ͻ� �޴��� �����ϼ��� (1~5)");
				int smn = sc.nextInt();
				if (smn == 1) {
					sm1.addMenu();
				} else if (smn == 2) {
					sm2.addMenu();
				} else if (smn == 3) {
					sm3.addMenu();
				} else if (smn == 4) {
					sm4.addMenu();
				} else if (smn == 5) {
					sm5.addMenu();
				}
				System.out.println("�޴��� �߰� �Ͻðڽ��ϱ�? (1.�� 2.�ƴϿ�)");
				int ch = sc.nextInt();
				if (ch == 1) {
					continue;
				} else if (ch == 2) {
					bill = false;
				}
			} else if (num == 3) {
				dm1.info(); dm2.info(); dm3.info(); dm4.info(); dm5.info();
				System.out.println("�߰��Ͻ� �޴��� �����ϼ��� (1~5)");
				int dmn = sc.nextInt();
				if (dmn == 1) {
					dm1.addMenu();
				} else if (dmn == 2) {
					dm2.addMenu();
				} else if (dmn == 3) {
					dm3.addMenu();
				} else if (dmn == 4) {
					dm4.addMenu();
				} else if (dmn == 5) {
					dm5.addMenu();
				}
				System.out.println("�޴��� �߰� �Ͻðڽ��ϱ�? (1.�� 2.�ƴϿ�)");
				int ch = sc.nextInt();
				if (ch == 1) {
					continue;
				} else if (ch == 2) {
					bill = false;
				}
			}
			
		}
		System.out.println("��� �ϼž� �� �ݾ��� "+Menu.total+"�� �Դϴ�.");
	}
}

class Menu {
	String menu_name;
	int price;
	static int total = 0;		
	
	public Menu() {
		
	}
	
	public Menu(String menu_name, int price) {
		this.menu_name = menu_name;
		this.price = price;
		
	}
	
	void info() {
		System.out.printf("�� %s \n",menu_name);
		System.out.printf("��    %d��\n",price);
		System.out.println("");
	}
}

class MainMenu extends Menu{
	Scanner sc = new Scanner(System.in);

	public MainMenu(String menu_name, int price) {
		super(menu_name,price);
	}
	void addMenu() {
		System.out.println("������ "+price+"���� �ܹ���"+menu_name+"��(��) �߰��Ͽ����ϴ�.");
		total += price;
		System.out.println("");
		System.out.println("2000���� �߰� �Ͻø� ��Ʈ �޴��� ��ȯ �����Ͻʴϴ� ��ȯ �Ͻðڽ��ϱ�?(1.�� 2.�ƴϿ�) ");
		int coke = sc.nextInt();
		if (coke ==1) {
			total += 2000;
		}
	}
}

class SideMenu extends Menu{
	
	public SideMenu(String menu_name, int price) {
		super(menu_name,price);
	}
	void addMenu() {
		System.out.println("������ "+price+"���� ���̵�޴�"+menu_name+"��(��) �߰��Ͽ����ϴ�.");
		total += price;
	}
}

class Drink extends Menu{
	Scanner sc = new Scanner(System.in);
	
	public Drink(String menu_name, int price) {
		super(menu_name,price);
	}
	void addMenu() {
		System.out.println("������ "+price+"���� ����"+menu_name+"��(��) �߰��Ͽ����ϴ�.");
		total += price;
		System.out.println("");
		System.out.println("������ �߰� �Ͻðڽ��ϱ�? (1.�� 2.�ƴϿ�)");
		int ice = sc.nextInt();
	}
}
 
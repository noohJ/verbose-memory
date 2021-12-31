package myobj;
/*
  	연습문제
  	
  	 - myobj 패키지에 상속 관계에 있는 클래스들을 정의해 보세요
  	 - 부모 클래스, 자식 클래스, 오버라이드, 업 캐스팅 등을 실습할 수 있는 예ㅇ제 여야 함
  	 - 직업 금지, 동물 금지, 식물 금지, 과일 금지, 커피 금지
  
 */

import java.util.Scanner;

public class A01_obj {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Menu totla = new Menu();
		
		MainMenu mm1 = new MainMenu("1. 치즈버거", 2000);
		MainMenu mm2 = new MainMenu("2. 더블치즈버거", 4500);
		MainMenu mm3 = new MainMenu("3. 불고기버거", 4100);
		MainMenu mm4 = new MainMenu("4. 새우버거", 4100);
		MainMenu mm5 = new MainMenu("5. 갈릭버거", 6100);
		
		SideMenu sm1 = new SideMenu("1. 치즈스틱", 1000);
		SideMenu sm2 = new SideMenu("2. 치킨너겟", 1800);
		SideMenu sm3 = new SideMenu("3. 코울슬로", 1400);
		SideMenu sm4 = new SideMenu("4. 감자튀김", 1600);
		SideMenu sm5 = new SideMenu("5. 치즈볼", 2000);
		
		Drink dm1 = new Drink("1. 콜라", 1000);
		Drink dm2 = new Drink("2. 사이다", 1000);
		Drink dm3 = new Drink("3. 물", 500);
		Drink dm4 = new Drink("4. 오렌지 주스", 800);
		Drink dm5 = new Drink("5. 커피", 1200);
		

		
		boolean bill = true;
		while (bill) {
			System.out.println("어떤 메뉴를 보시겠습니까. (1. 메인 메뉴/2. 사이드 메뉴/3. 음료)> ");
			int num = sc.nextInt();
			if (num == 1) {
				mm1.info(); mm2.info(); mm3.info(); mm4.info(); mm5.info();
				System.out.println("추가하실 메뉴를 선택하세요 (1~5)");
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
				System.out.println("메뉴를 추가 하시겠습니까? (1.예 2.아니요)");
				int ch = sc.nextInt();
				if (ch == 1) {
					continue;
				} else if (ch == 2) {
					bill = false;
				}
			} else if (num == 2) {
				sm1.info(); sm2.info(); sm3.info(); sm4.info(); sm5.info();
				System.out.println("추가하실 메뉴를 선택하세요 (1~5)");
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
				System.out.println("메뉴를 추가 하시겠습니까? (1.예 2.아니요)");
				int ch = sc.nextInt();
				if (ch == 1) {
					continue;
				} else if (ch == 2) {
					bill = false;
				}
			} else if (num == 3) {
				dm1.info(); dm2.info(); dm3.info(); dm4.info(); dm5.info();
				System.out.println("추가하실 메뉴를 선택하세요 (1~5)");
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
				System.out.println("메뉴를 추가 하시겠습니까? (1.예 2.아니요)");
				int ch = sc.nextInt();
				if (ch == 1) {
					continue;
				} else if (ch == 2) {
					bill = false;
				}
			}
			
		}
		System.out.println("계산 하셔야 할 금액은 "+Menu.total+"원 입니다.");
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
		System.out.printf("┌ %s \n",menu_name);
		System.out.printf("└    %d원\n",price);
		System.out.println("");
	}
}

class MainMenu extends Menu{
	Scanner sc = new Scanner(System.in);

	public MainMenu(String menu_name, int price) {
		super(menu_name,price);
	}
	void addMenu() {
		System.out.println("가격이 "+price+"원인 햄버거"+menu_name+"를(을) 추가하였습니다.");
		total += price;
		System.out.println("");
		System.out.println("2000원을 추가 하시면 세트 메뉴로 변환 가능하십니다 변환 하시겠습니까?(1.예 2.아니요) ");
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
		System.out.println("가격이 "+price+"원인 사이드메뉴"+menu_name+"를(을) 추가하였습니다.");
		total += price;
	}
}

class Drink extends Menu{
	Scanner sc = new Scanner(System.in);
	
	public Drink(String menu_name, int price) {
		super(menu_name,price);
	}
	void addMenu() {
		System.out.println("가격이 "+price+"원인 음료"+menu_name+"를(을) 추가하였습니다.");
		total += price;
		System.out.println("");
		System.out.println("얼음을 추가 하시겠습니까? (1.예 2.아니요)");
		int ice = sc.nextInt();
	}
}
 
package myobj.Weapon;

public class Sword extends Weapon{
	
	public Sword() {
		super("칼",30,1);
	}
	
	public void upgrade() {
		if (level < 6) {
			if (ceiling == 100) {
				System.out.println("장인의 기운이 100 입니다");
				System.out.println("강화 성공");
				level +=1;
				ceiling = 0;
				attack +=13;
			}else if ((int)(Math.random()*100 + 1) > 10) {
				level +=1;
				ceiling = 0;
				System.out.println("강화에 성공 하였습니다.");
				attack +=13;
			}else {
				System.out.println("강화에 실패 하였습니다.");
				ceiling +=30;
			}
		} else if (level < 10) {
			if (ceiling == 100) {
				System.out.println("장인의 기운이 100 입니다");
				System.out.println("강화 성공");
				level +=1;
				ceiling = 0;
				attack +=20;
			}else if ((int)(Math.random()*100+1) > 20) {
				level +=1;
				ceiling = 0;
				System.out.println("강화에 성공 하였습니다.");
				attack +=20;
			}else {
				System.out.println("강화에 실패 하였습니다.");
				ceiling +=20;
			}
		} else if (level < 12) {
			if (ceiling == 100) {
				System.out.println("장인의 기운이 100 입니다");
				System.out.println("강화 성공");
				level +=1;
				ceiling = 0;
				attack +=30;
			}else if ((int)(Math.random()*100+1) > 30) {
				level +=1;
				ceiling = 0;
				System.out.println("강화에 성공 하였습니다.");
				attack +=30;
			}else {
				System.out.println("강화에 실패 하였습니다.");
				ceiling +=10;
			}
		} else if (level < 14) {
			if (ceiling == 100) {
				System.out.println("장인의 기운이 100 입니다");
				System.out.println("강화 성공");
				level +=1;
				ceiling = 0;
				attack +=40;
			}else if ((int)(Math.random()*100+1) > 50) {
				level +=1;
				ceiling = 0;
				System.out.println("강화에 성공 하였습니다.");
				attack +=40;
			}else {
				System.out.println("강화에 실패 하였습니다.");
				ceiling +=7;
			}
		} else if (level < 16) {
			if (ceiling == 100) {
				System.out.println("장인의 기운이 100 입니다");
				System.out.println("강화 성공");
				level +=1;
				ceiling = 0;
				attack +=50;
			}else if ((int)(Math.random()*100+1) > 75) {
				level +=1;
				ceiling = 0;
				System.out.println("강화에 성공 하였습니다.");
				attack +=50;
			}else {
				System.out.println("강화에 실패 하였습니다.");
				ceiling +=5;
			}
		} else if (level < 18) {
			if (ceiling == 100) {
				System.out.println("장인의 기운이 100 입니다");
				System.out.println("강화 성공");
				level +=1;
				ceiling = 0;
				attack +=60;
			}else if ((int)(Math.random()*100+1) > 80) {
				level +=1;
				ceiling = 0;
				System.out.println("강화에 성공 하였습니다.");
				attack +=60;
			}else {
				System.out.println("강화에 실패 하였습니다.");
				ceiling +=3;
			}
		} else if (level < 20) {
			if (ceiling == 100) {
				System.out.println("장인의 기운이 100 입니다");
				System.out.println("강화 성공");
				System.out.println("강화 수치가 최대 입니다.");
				level +=1;
				ceiling = 0;
				attack +=100;
			}else if((int)(Math.random()*100+1) > 99) {
				level +=1;
				ceiling = 0;
				System.out.println("강화에 성공 하였습니다.");
				attack +=100;
				System.out.println("강화 수치가 최대 입니다.");
			}else {
				System.out.println("강화에 실패 하였습니다.");
				ceiling +=1;
			}
		}else {
			System.out.println("더이상 강화를 할 수 없습니다.");

		}
	}
}
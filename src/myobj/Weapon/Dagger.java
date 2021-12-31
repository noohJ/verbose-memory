package myobj.Weapon;

public class Dagger extends Weapon{
	
	public Dagger() {
		super("단검",15,1);
	}
	
	public void upgrade() {
		if (level < 3) {
			if ((int)(Math.random()*100 + 1) > 20) {
				level +=1;
				System.out.println("강화에 성공 하였습니다.");
				attack +=10;
			}			
		} else if (level < 5) {
			if ((int)(Math.random()*100+1) > 34) {
				level +=1;
				System.out.println("강화에 성공 하였습니다.");
				attack +=15;
			}
		} else {
			if ((int)(Math.random()*100+1) > 50) {
				level +=1;
				System.out.println("강화에 성공 하였습니다.");
				attack +=20;
			}
		}
	}
}
package myobj.Weapon;

public class Spear extends Weapon{
	
	public Spear() {
		super("â",25,1);
	}
	
	public void upgrade() {
		if (level < 3) {
			if ((int)(Math.random()*100 + 1) > 30) {
				level +=1;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=13;
			}			
		} else if (level < 6) {
			if ((int)(Math.random()*100+1) > 50) {
				level +=1;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=23;
			}
		} else {
			if ((int)(Math.random()*100+1) > 70) {
				level +=1;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=30;
			}
		}
	}
}

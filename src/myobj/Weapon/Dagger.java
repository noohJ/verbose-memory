package myobj.Weapon;

public class Dagger extends Weapon{
	
	public Dagger() {
		super("�ܰ�",15,1);
	}
	
	public void upgrade() {
		if (level < 3) {
			if ((int)(Math.random()*100 + 1) > 20) {
				level +=1;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=10;
			}			
		} else if (level < 5) {
			if ((int)(Math.random()*100+1) > 34) {
				level +=1;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=15;
			}
		} else {
			if ((int)(Math.random()*100+1) > 50) {
				level +=1;
				System.out.println("��ȭ�� ���� �Ͽ����ϴ�.");
				attack +=20;
			}
		}
	}
}
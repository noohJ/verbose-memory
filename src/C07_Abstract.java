
public class C07_Abstract {

	/*
	  	# �߻� Ŭ���� (abstract class)
	  	
	  	 - �޼����� ���¸� ����� ���� �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
	  	 - ���� �Ǿ��ִ� �߻� �޼��尡 ���Ե� Ŭ����
	  	 
	  	# �߻� �޼��� (abstract method)
	  	
	  	 - ���� �Ǿ� �ְ� ������ ���� �޼���
	  	 - abstract�� �پ� �ִ� �޼���� body�� ���� �߰��� �� ����.
	  	 - �ݵ�� ��ӹ��� �� �ڽ� Ŭ�������� �������̵��Ͽ� �����ؾ� �Ѵ�.
	  	 - abstract �޼��带 �������� ���� Ŭ������ �ν��Ͻ�ȭ �� �� ����.
	 */
	public static void main(String[] args) {
		test(new Teemo());
		test(new Jinx());
		
		test(new Cup());
		test(new Ghost());
	}
	public static void test(Champion champ) {
		champ.q_skill();
		champ.w_skill();
		champ.e_skill();
		champ.r_skill();
	}
	public static void test(Monster monster) {
		monster.move1();
		monster.move2();
		monster.move3();
	}
	
	
}
abstract class Monster {
	abstract void move1();
	abstract void move2();
	abstract void move3();
}

class Cup extends Monster{
	void move1() {
		System.out.println("�������� ����");
	}

	@Override
	void move2() {
		System.out.println("���������� ����");
		
	}

	@Override
	void move3() {
		System.out.println("���� �ð��� ������ ��������");
		
	}
}
class Ghost extends Monster{
	void move1() {
		System.out.println("���� �밢������ ����");
	}

	@Override
	void move2() {
		System.out.println("������ �밢������ ����");
		
	}

	@Override
	void move3() {
		System.out.println("��������ٰ� ��Ÿ����");
		
	}
}

abstract class Champion {
	int ad;
	int ap;
	int def;
	int hp;
	int mp;
	abstract void q_skill();
	abstract void w_skill();
	abstract void e_skill();
	abstract void r_skill();
//	abstract void ctrl1();
//	abstract void ctrl2();
//	abstract void ctrl3();
//	abstract void ctrl4();
}
abstract class singed extends Champion {
	
	void q_skill() {
		System.out.println("���� �Ѹ��ϴ�.");
	}
	
}

class Surfsinged extends singed{

	@Override
	void w_skill() {
		System.out.println("�������� �Ѹ��ϴ�.");
	}

	@Override
	void e_skill() {
		System.out.println("������");
	}

	@Override
	void r_skill() {
		System.out.println("��Ա�");
	}
	
}

class Jinx extends Champion {
	boolean pink;
	
	
	void q_skill() {
		if (pink) {
			System.out.println("�Ķ��̷� �ٲߴϴ�");
			pink = false;
			
		} else {
			System.out.println("��ȫ�̷� �ٲߴϴ�");
			pink = true;
		}
	}
	void w_skill() {
		System.out.println("������ ���ϴ�");
	}
	void e_skill() {
		System.out.println("���� ���ϴ�.");
	}
	void r_skill() {
		System.out.println("�ʰ��� ����ȭ ������ ���ϴ�.");
	}	
}
class Teemo extends Champion{
	void q_skill() {
		System.out.println("��ħ�� ���ϴ�");
	}
	void w_skill() {
		System.out.println("�ż��� �޸��ϴ�");
	}
	void e_skill() {
		System.out.println("ħ�� �̸� ���� �߶� �����ϴ�");
	}
	void r_skill() {
		System.out.println("�������� ���ϴ�");
	}
}
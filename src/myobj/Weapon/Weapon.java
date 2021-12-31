package myobj.Weapon;

/*
�� Ŭ������ ��ӹ��� ���⸦ 3���� �̻� ����� ������
	
	�� ����� ��ȭ Ȯ�� �� ���ݷ��� �޶�� �մϴ�.
	�� Ŭ������ ���� �׽�Ʈ�� quiz.C11_UseWeapon Ŭ������ �����ϸ� 
	�ϰ������� ����Ǿ�� �մϴ�.
*/

abstract public class Weapon {
	String name;
	int attack;
	int level;
	int ceiling;
	
	public Weapon(String name, int attack, int level) {
		this.name = name;
		this.attack = attack;
		this.level = level;
	}
	public void print(){
		System.out.println("��������: "+name);
		System.out.println("���ݷ�: "+attack);
		System.out.println("��ȭ ��ġ: "+level);
	}
	
	final public void attack() {
		System.out.printf("'%s'�� ����ƺ� ������ '%d'�� �������� �������ϴ�.\n",name,attack);
	
	}

	abstract public void upgrade();

}
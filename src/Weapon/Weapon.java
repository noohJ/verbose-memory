package Weapon;

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
	
	final public void attack() {
		System.out.printf("'%s'�� ����ƺ� ������ '%d'�� �������� �������ϴ�.\n",name,attack);
		
	}
	
	abstract public void upgrad();
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
abstract class sward extends Weapon{
	public
	public void upgrad() {
		
	}
}

abstract class dagger extends Weapon{
	
}

abstract class spear extends Weapon{
	
}
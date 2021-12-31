package Weapon;

/*
    이 클래스를 상속받은 무기를 3가지 이상 만들어 보세요
  	
  	각 무기는 강화 확률 및 공격력이 달라야 합니다.
  	각 클래스에 대한 테스트는 quiz.C11_UseWeapon 클래스를 실행하면 
  	일괄적으로 진행되어야 합니다.
 */


abstract public class Weapon {
	String name;
	int attack;
	int level;
	
	final public void attack() {
		System.out.printf("'%s'로 허수아비를 공격해 '%d'의 데미지를 입혔습니다.\n",name,attack);
		
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

public class C07_Abstract {

	/*
	  	# 추상 클래스 (abstract class)
	  	
	  	 - 메서드의 형태만 만들어 놓고 완성은 자식 클래스에게 미루는 클래스
	  	 - 선언만 되어있는 추상 메서드가 포함된 클래스
	  	 
	  	# 추상 메서드 (abstract method)
	  	
	  	 - 선언만 되어 있고 몸통이 없는 메서드
	  	 - abstract가 붙어 있는 메서드는 body를 직접 추가할 수 없다.
	  	 - 반드시 상속받은 후 자식 클래스에서 오버라이드하여 구현해야 한다.
	  	 - abstract 메서드를 구현하지 않은 클래스는 인스턴스화 할 수 없다.
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
		System.out.println("왼족으로 움직");
	}

	@Override
	void move2() {
		System.out.println("오른쪽으로 움직");
		
	}

	@Override
	void move3() {
		System.out.println("일정 시간이 지나면 빨라진다");
		
	}
}
class Ghost extends Monster{
	void move1() {
		System.out.println("왼족 대각선으로 움직");
	}

	@Override
	void move2() {
		System.out.println("오른쪽 대각선으로 움직");
		
	}

	@Override
	void move3() {
		System.out.println("사ㅐ라졌다가 나타나기");
		
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
		System.out.println("독을 뿌립니다.");
	}
	
}

class Surfsinged extends singed{

	@Override
	void w_skill() {
		System.out.println("접착제를 뿌립니다.");
	}

	@Override
	void e_skill() {
		System.out.println("뒤집기");
	}

	@Override
	void r_skill() {
		System.out.println("약먹기");
	}
	
}

class Jinx extends Champion {
	boolean pink;
	
	
	void q_skill() {
		if (pink) {
			System.out.println("파랑이로 바꿉니다");
			pink = false;
			
		} else {
			System.out.println("분홍이로 바꿉니다");
			pink = true;
		}
	}
	void w_skill() {
		System.out.println("빠직을 쏩니다");
	}
	void e_skill() {
		System.out.println("덫을 깝니다.");
	}
	void r_skill() {
		System.out.println("초강력 초토화 로켓을 쏩니다.");
	}	
}
class Teemo extends Champion{
	void q_skill() {
		System.out.println("독침을 쏩니다");
	}
	void w_skill() {
		System.out.println("신속히 달립니다");
	}
	void e_skill() {
		System.out.println("침에 미리 독을 발라 놓습니다");
	}
	void r_skill() {
		System.out.println("독버섯을 깝니다");
	}
}
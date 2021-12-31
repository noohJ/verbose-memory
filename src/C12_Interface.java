
public class C12_Interface {
	/*
	  	# 인터페이스 (
	  
	  	 - 자바는 상속을 여러개 받을 수 없다.
	  	 - 해당 클래스에 여러가지 형태(업캐스팅)을 부여하기 위해서는 인터페이스를 사용해야 한다.
	  	 - 인터페이스 내부의 메서드는 기본적으로 abstract public 메서드가 된다.
	  	 - 메서드 앞에 default를 붙이면 오버라이드 하지 않았을 때의 기본 동작으로 정의할 수 있다.
	  	 - 인터페이스 내부의 변수는 기본적으로 finaal static 이다.
	 */
	
	public static void main(String[] args) {
		Runner run1 =new DanceExpert();
		Swimmer swim1 = new DanceExpert();
		Dancer dance1 = new DanceExpert();
		Human humna1 = new DanceExpert();
	}
}

interface Clickable {
	void click();
}

interface Kickable {
	void kick();
}

class AppleTree implements Clickable,Kickable{
	@Override
	public void click() {
		System.out.println("사과나무를 클릭해서 사과를 수확했습니다.");
	}
	@Override
	public void kick() {
		System.out.println("사과나무를 발로 차서 더 많은 사과를 수확했습니다.");
	}
}

interface Dancer {
	int a = 10;
	default void dance() {
		System.out.println("기본 춤 동작");
	};
}

interface Runner {
	abstract void run ();	
	abstract void walk();
}

abstract class Swimmer {
	abstract void swim();
}

class Salmon extends Swimmer{
	@Override
	void swim() {
		System.out.println("연어는 지느러미로 헤엄칩니다.");
	}
}

abstract class Human extends Swimmer implements Runner, Dancer {
	@Override
	void swim() {
		System.out.println("사람은 두 팔과 두 다리로 수영합니다.");
	}
	@Override
	public void run() {
		System.out.println("사람은 뛸 수 있습니다.");
	}
	@Override
	public void walk() {
		System.out.println("사람은 걸을 수 있습니다.");
	}

}

class DanceExpert extends Human{
	@Override
	public void dance() {
		System.out.println("춤 전문가는 헤드뱅잉을 돌았습니다.");		
	}
}

class DanceBeginner extends Human{
	@Override
	public void dance() {
		System.out.println("춤 초보자는 통아지씨 춤을 췄습니다.");
	}
}
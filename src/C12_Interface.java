
public class C12_Interface {
	/*
	  	# �������̽� (
	  
	  	 - �ڹٴ� ����� ������ ���� �� ����.
	  	 - �ش� Ŭ������ �������� ����(��ĳ����)�� �ο��ϱ� ���ؼ��� �������̽��� ����ؾ� �Ѵ�.
	  	 - �������̽� ������ �޼���� �⺻������ abstract public �޼��尡 �ȴ�.
	  	 - �޼��� �տ� default�� ���̸� �������̵� ���� �ʾ��� ���� �⺻ �������� ������ �� �ִ�.
	  	 - �������̽� ������ ������ �⺻������ finaal static �̴�.
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
		System.out.println("��������� Ŭ���ؼ� ����� ��Ȯ�߽��ϴ�.");
	}
	@Override
	public void kick() {
		System.out.println("��������� �߷� ���� �� ���� ����� ��Ȯ�߽��ϴ�.");
	}
}

interface Dancer {
	int a = 10;
	default void dance() {
		System.out.println("�⺻ �� ����");
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
		System.out.println("����� �������̷� ���Ĩ�ϴ�.");
	}
}

abstract class Human extends Swimmer implements Runner, Dancer {
	@Override
	void swim() {
		System.out.println("����� �� �Ȱ� �� �ٸ��� �����մϴ�.");
	}
	@Override
	public void run() {
		System.out.println("����� �� �� �ֽ��ϴ�.");
	}
	@Override
	public void walk() {
		System.out.println("����� ���� �� �ֽ��ϴ�.");
	}

}

class DanceExpert extends Human{
	@Override
	public void dance() {
		System.out.println("�� �������� �������� ���ҽ��ϴ�.");		
	}
}

class DanceBeginner extends Human{
	@Override
	public void dance() {
		System.out.println("�� �ʺ��ڴ� ������� ���� ����ϴ�.");
	}
}
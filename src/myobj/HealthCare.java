package myobj;

public class HealthCare extends Program{
	int walk = 0;
	public void create() {
		System.out.println("���ο� ����� ������ ����ϴ� ���");
	}
	
	public void read() {
		System.out.println("���� ����, ���� ����, ���ʴ�緮 ���� ��ȸ");
	}
	
	public void update() {
		System.out.println("���� ������ �����ϴ� ���");
	}
	
	public void delete() {
		System.out.println("���� ������ �����ϴ� ���");
	}
	
	public void walk() {
		walk++;
	}
	public void run() {
		walk += 3;
	}
	public void burn() {
		System.out.println("���� �Ϸ� �Ҹ��� Į�θ��� ����ϴ� ���");
	}
}

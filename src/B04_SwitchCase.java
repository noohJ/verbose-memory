
public class B04_SwitchCase {

	/*
	  	 # switch-case
	  	
	  	  - ()���� ���� ���� ������ �ڵ带 �����ϴ� ����
	  	  - ()�ȿ��� ����, ���ڿ�, ������(enum) Ÿ�Ը� �� �� �ִ�.
	  	  - default�� if���� else ������ �Ѵ�
	  	  - break�� ���� ������ break�� ���� �������� ��� �ڵ带 �����Ѵ�.
	  	  - if������ �Ϻ��ϰ� ��ü �����ϴ�.
	 */
	
	public static void main(String[] args) {
		int num = 4;
		switch (num) {
		case 1: case 4: 
			System.out.println("�ź���");
			break;
		case 2:
			System.out.println("�Ǵ�");
			break;
		case 3:
			System.out.println("�䳢");
			break;	
		default:
			System.out.println("ö�����");
			break;
		}
	}
	
}

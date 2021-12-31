import myobj.HealthCare;
import myobj.Program;

public class C06_Polymorphism {
	/*
	  	# ��ü�� ������
	  	
	  	- ��ü�� �پ��� ���¸� ���� �� �ִ�.
	  	- ������ �����̱⵵ �ϰ� ����̱⵵ �ϴ�.
	  	- ����� ��������� ������ �ƴ� ���� �ִ�.	  
	 */
	public static void main(String[] args) {
		Program p1 = new Program();
		HealthCare care = new HealthCare(); 
		
		// �ڽ� Ÿ���� �θ� Ÿ���� �� �� �ִ�. (�� ĳ����)
		Program p2 = care;
		
		// ��ĳ������ �Ǿ��� ���� �ڽ� Ŭ�������� ������ �ִ� ����� ��� �ؾ������.
//		p2.walk(); ��� �Ұ�
		
		// ��ĳ���� �� �ν��Ͻ��� �ڽ� Ŭ�������� �������̵��� �θ� Ŭ������ �޼��带 ����ϴ� ���
		// �������̵� �� ������ ����ȴ�.
		p2.create();
		p2.delete();
		
		// instanceof ������ : �ش� �ν��Ͻ��� � Ŭ������ �ν��Ͻ����� �˻��� �� �ִ�.
		System.out.println(p1 instanceof HealthCare);
		System.out.println(care instanceof HealthCare);
		System.out.println(p2 instanceof HealthCare);
		
		Program[] programs = {
				new Program(),new HealthCare(), new HealthCare(), new HealthCare(), new HealthCare() 
		};
		
		for (int i = 0; i < programs.length; ++i) {
			if (programs[i] instanceof HealthCare) {
				//��ĳ���� �� �ν��Ͻ��� ���� ����� ����ϱ� ���ؼ��� �ٿ� ĳ������ �ؾ� �Ѵ�.
				((HealthCare)programs[i]).walk();				
			}
		}
		execute(new Program());
		execute(new HealthCare());
		
	}
	
	public static void execute(Program p) {
		p.create();
	}
	
}

��
public class C05_Extend {
	/*
	  	# Ŭ���� ��� (Ȯ��)
	  	
	  	 - ������ �����ξ��� Ŭ������ �����޾Ƽ� ����ϴ� ��
	  	 - �������� �Ŀ��� �ش� Ŭ������ ������� �����ؼ� ����� �� �ִ�.
	  	   ������� ���ļ� ����� �� �ִ�. (�������̵�)
	  	 - �ڽ� Ŭ�������� �θ� Ŭ������ ���� ���ο� ����� �߰��� ���� �ֵ�.
	  	 
	  	# ����� ����
	  	
	  	 - class Ŭ������ extends �θ�Ŭ������
	  	 - �����ڿ��� �ݵ�� ���� ���� �θ� Ŭ������ ������(super())�� ȣ���ؾ� �Ѵ�.
	  	   (�����Ѵٸ� �θ��� �⺻ �����ڸ� ����Ѵ�)
	  	 - �θ� Ŭ������ �ڽ� Ŭ������ ���� �̸��� �ڿ��� �ִٸ�
	  	   super�� this�� ��Ȯ�ϰ� ������ �� �ִ�.  
	 
	 */
	public static void main(String[] args) {
		Person p1 = new Person("�Ѹ�", 6);
		Person p2 = new Person("ö��", 8);
		FireFighter f1 = new FireFighter("�μ�", 28);
		Police popo1 = new Police();
		Police popo2 = new Police("�ڰ���", 35);
		
		/*
		   	# �� ĳ���ð� �ٿ� ĳ����
		   	 
		   	 - �� ĳ���� : �ڽ� Ŭ������ �θ� Ŭ������ Ÿ�� ĳ���� �Ǵ� ��
		  	 - �ٿ� ĳ���� : �θ� Ŭ������ �ڽ� Ŭ������ Ÿ�� ĳ���õǴ� �� 
		 */
		
		// �Ϲ����� ���, �ٿ� ĳ������ �Ұ����ϴ�
//		Police popo3 = new Person("�̼���", 21); 
		
		// �ڽ� Ŭ������ �θ� Ŭ������ ��ĳ���� �� �� ������ ��ĳ���� �� ���¿����� ���� ����� �ؾ������.
		Person p3 = new FireFighter("��ҹ�", 31);
		
		// ��ĳ���� �Ǿ��� �ڽ� Ŭ������ �ٽ� ���� �ڽ��� Ŭ������ �ٿ� ĳ���� �� �� �ִ�.
//		FireFighter f3 = (FireFighter) p3 ;		
//		f3.dispatch("�뷮�� �������");
		
		//�ڽ� Ÿ���� �䱸�ϴ� �ڸ��� �θ� Ÿ�� �ν��Ͻ��� �� �� ����.
		popo2.duo(popo1);
//		popo2.duo(p1);
		System.out.println("------------------------------------------");
		p1.sayHi();
		p2.sayHi();
		System.out.println("------------------------------------------");		
		f1.sayHi();
		f1.dispatch("63����");
		System.out.println("------------------------------------------");
		//�θ� Ÿ���� �䱸�ϴ� �ڸ��� �ڽ� Ÿ�� �ν��Ͻ��� �� �� �ִ�.
		popo1.arrest(p1);
		popo1.arrest(p2);
		popo1.arrest(p3);
		popo1.arrest(f1);
		popo1.arrest(popo1);
		popo1.sayHi();
		popo2.sayHi();
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sayHi() {
		System.out.println("�ȳ�? �� �̸��� " + name + "�̾�. ���̴� " + age + "���̾�.");
	}
	
}

class FireFighter extends Person {

	public FireFighter(String name, int age) {
		super(name, age);
	}
	
	//�θ𿡰� ���� ���ο� ����� �߰��� ����ϱ�
	void dispatch(String building) {
		System.out.println("�ҹ�� "+ name + "���� " + building + "���� ���� ���� �⵿�߽��ϴ�.");
	}
	
}

class Police extends Person{
	
	public Police() {
		super("�����", 25);
	}
	
	public Police(String name, int age) {
		super (name,age);
	}
	
	//Override: �����.
	@Override
	void sayHi() {
		System.out.println("���� ���Խ��ϴ�.");
	}
	public void arrest(Person suspect) {
		System.out.printf("%s �������� ������ %s ���� ü���߽��ϴ�.\n", super.name,suspect.name);
	}
	
	public void duo(Police police) {
		System.out.printf("%s �������� %s �������� �Բ� ���縦 �����߽��ϴ�. \n", name, police.name);
	}
}
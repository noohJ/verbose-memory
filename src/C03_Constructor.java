
public class C03_Constructor {
	
	/*
	  	# Ŭ������ ������ (Constructor)
	  	
	  	 - Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
	  	 - �޼������� ���� Ÿ���� �������� �ʴ´�
	  	 - �ν��Ͻ��� ������ �� new�� �Բ� ȣ���Ѵ�.	  
	  	 - �ν��Ͻ� ������ ���� ���� ȣ��Ǵ� �޼����̱� ������
	  	   �ַ� �ν��Ͻ� ���� �ʱ�ȭ�� ���� ���ȴ�.
	  	 - �����ڸ� �ϳ��� �������� ���� Ŭ�������� �ڵ����� �⺻ �����ڰ� �����Ѵ�.
	  	   (�ƹ��͵� ���� ����)
	  	 - ���� ������ �����ڰ� �����ϴ� Ŭ������ �⺻ �����ڸ� �ڵ����� ���������� �ʴ´�.
	  	   (�⺻ �����ڸ� ����ϰ� �ʹٸ� �⺻ �����ڸ� ��������� �����ؾ� �Ѵ�.)
	 */
	public static void main(String[] args) {
		Banana b1 = new Banana();
		Banana b2 = new Banana(8, "Dole");
		Banana b3 = new Banana(9, "����Ʈ");
		
//		int[] numberBox = new int [1000];
//		String[] StrBox = new String[1500];
//		Banana[] bananaBox = new Banana[1500];
		
//		bananaBox[0].info();
		
//		for (int i = 0; i < bananaBox.length; ++i) {
//			bananaBox[i] = new Banana();
//			bananaBox[i].info();
//		}
		
		b1.qty = 15;
		
		b1.info();
		b2.info();
		b3.info();
		
		System.out.println(b1.qty);
		System.out.println(b1.brand);
		
		System.out.println(b2.qty);
		System.out.println(b2.brand);
	}
	
}

class Banana {
	int qty;
	String brand;
	
	// �⺻ ������ (�Ű������� �ƹ��͵� ���� ������)
	Banana() {
		System.out.println("�ٳ����� �����Ǿ����ϴ�.");
	}
	
	// ������ �����ε�
	Banana(int qty, String brand) {
		//this. : ���� �ν��Ͻ��� ��Ȯ�ϰ� ����Ű�� Ű����
		this.qty = qty;
		this.brand =brand;
	}
	
	void info() {
		System.out.println("= = �ٳ��� ���� = =");
		System.out.printf("����: %d\n�귣���: %s\n", this.qty,this.brand);
	}
}

class Peach {
	boolean white;
	
	Peach() {
		this.white = true;
	}
	
	//�⺻ �����ڰ� �ƴ� �����ڰ� �����ϸ�, �⺻ �����ڸ� �ڵ����� �������� �ʴ´�.
	Peach(boolean white) {
		this.white = white;
	}
}
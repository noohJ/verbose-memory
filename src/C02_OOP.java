import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class C02_OOP {
	
	/*
	 		# ��ü���� ���α׷� (Object Oriented Programming)
	 		
	 		 - ���� �����ϴ� ��� ��(��ü)���� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	 		 - ������ �Լ��� ���к��ϰ� ����ϴ� �ͺ��� ���ǿ� �����ϴ� ��ü ������ ���� ǥ���Ͽ�
	 		   ������ ȿ�������� ������ �� �ִ�.
	 		 - ��ü(Object) : ���� �����ϴ� ��� ����
	 		 - ��ü�� �޼���� �ش� ��ü�� ������ ��ȯ��Ű�� ��찡 ����.
	 		 
	 		ex: ���
	 		  
	 		 - ����� ���� : ũ��, ����, �絵, Į�θ�, ���, ������ ...
	 		 - ����� �޼��� (������ ��ȭ��Ű�� �͵�)
	 		   �Դ´� : ũ��� Į�θ��� ���� ����� Į�θ���
	 		   ������ : ũ�⿡ ����� �������� ������.
	 		   ����� �����Ѵ� : �ż����� õõ�� �����Ѵ�.
	 		   
	 		# Ŭ���� (class)
	 		
	 		 - ������ ��ü�� ���α׷��� ���� ǥ���� ��
	 		 - Ŭ������ �ش� ��ü�� ���赵 ������ �Ѵ�.
	 		 - Ŭ������ ������ ���������� ��ü�� ����.
	 		 - Ŭ������ �̿��� �� ���� ��ü�� '�ν��Ͻ�(instance)' ��� �θ���.
	 		 - Ŭ������ �̿��� ���� ��ü�� �����Ҷ��� new�� ����Ѵ�.
	 		 - ��� Ŭ������ ������ ���� Ÿ���̴�.	  
	 */
	
	//main�� �ݵ�� public class�� �����ؾ� �Ѵ�.
	//public class �ݵ�� ���ϸ�� ���� �̸��̾�� �Ѵ�.
	// -> �� ���Ͽ��� �ϳ��� public class�� ������ �� �ִ�.
	public static void main(String[] args) {
		
		//��� Ŭ������ �ν��Ͻ� ����
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.size = 10;
		a2.size = 12;
		a3.size = 11;
		
		a1.calorie = 100;
		a2.calorie = 120;
		a3.calorie = 130;
		
		for (int i = 0 ; i < 10; ++i) {
			a2.eat();
		}
		
		System.out.println(a1.size + "," + a1.calorie);
		System.out.println(a2.size + "," + a2.calorie);
		System.out.println(a3.size + "," + a3.calorie);
	}
}

class MyOos extends ObjectOutputStream implements Serializable{

	public MyOos(OutputStream out) throws IOException {
		super(out);	}
	
}

class Apple implements Serializable{
	/*
	 		# �ν��Ͻ� ����
	 		
	 		 - Ŭ���� ���ο� ������ ����
	 		 - �� �ν��Ͻ����� ���� �ٸ� �� �ִ� ����
	 		 - aka. �ʵ�, �Ӽ�, ��� ����, ���, ����,
	  
	 */
	int size;
	int calorie;
	int sweet;
	int price;
	char grade;
	MyOos out;
	/*
	 		# �ν��Ͻ� �޼���
	 		
	 		 - �ش� �ν��Ͻ��� ������ ��ȭ��Ű�� �޼���
	 */
	void eat( ) {
		size--;
		calorie -= 10;
	}
	public String toString() {
		return "�� ����� ũ�Ⱑ "+ size+"�Դϴ�.";
	}
}


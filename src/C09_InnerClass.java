
public class C09_InnerClass {
	
	/*
	  	# Ŭ���� ���ο� Ŭ���� ����ϱ�
	  	
	  	 - Ŭ���� ���ο��� Ŭ������ �����ϰ� ����� �� �ִ�.
	  	 - Ŭ���� ���ο� �����ϴ� Ŭ������ �ٱ��� Ŭ������ �ν��Ͻ��� �����ؾ� ����� �� �ִ�.
	 */
	
	public static void main(String[] args) {
		// static inner class �����ϱ�
		new OuterClass.StaticInnerClass();
		
		// instance inner class �����ϱ�
		new OuterClass().new InnerClass();
		
		Order order = new Order(true);
		Order order2 = new Order(false);
		
		Order.Americano ame1 = order.new Americano();
		Order.Americano ame2 = order2.new Americano();
		
		System.out.println(ame1);
		System.out.println(ame2);
		
		ame1 = ame2;
		
		System.out.println(ame1);
		System.out.println(ame2);
	}
}

class  Order {
	boolean ice ;
	
	public Order(boolean ice) {
		this.ice = ice;
	}
	
	class Americano {
	
		public Americano() {
			if (ice) {
				System.out.println("������ ���̽� �Ƹ޸�ī��");
			}else {
				System.out.println("�߾�");
			}
		}
	}	
}

class OuterClass {
	int a;
	int b;
	
	protected static class StaticInnerClass{
	
	}
	
	class InnerClass {
		
	}
}

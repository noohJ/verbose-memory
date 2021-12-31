
public class C09_InnerClass {
	
	/*
	  	# 클래스 내부에 클래스 사용하기
	  	
	  	 - 클래스 내부에도 클래스를 정의하고 사용할 수 있다.
	  	 - 클래스 내부에 존재하는 클래스는 바깥쪽 클래스의 인스턴스가 존재해야 사용할 수 있다.
	 */
	
	public static void main(String[] args) {
		// static inner class 생성하기
		new OuterClass.StaticInnerClass();
		
		// instance inner class 생성하기
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
				System.out.println("차가운 아이스 아메리카노");
			}else {
				System.out.println("뜨아");
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

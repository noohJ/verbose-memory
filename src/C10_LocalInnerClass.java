
public class C10_LocalInnerClass {
	/*
	  	# ���� ���� Ŭ����
	  	
	  	 - �޼��� ���ο� ������ Ŭ����
	  	 - �ش� �޼��尡 ������ ������ ���ϴ� Ŭ����
	  	 - �ش� �޼��� �ٱ������� ������ �� ����.
	 */
	
	public static void main(String[] args) {
		
		class Apple {
			int size;
			int price;
			
			public Apple(int size, int price) {
				this.size = size;
				this.price = price;
			}
		}
		
		Apple apple = new Apple(10, 12);
		System.out.println(apple.size);
		System.out.println(apple.price);
		
		Fruit something = test();
		something.printName();
		something.makeJuice();
		Fruit something2 = test2();
		something2.printName();
		something2.makeJuice();
	}
	
	public static Fruit test2() {
		// new Fruit() {} : Fruit�� ��ӹ��� �ڽ��� �ٷ� ������ �� �ִ�.
		// - ���� Ŭ������ �̸��� ũ�� �ǹ̰� ���� ��찡 ���� �̸��� �����ϰ� ���� ���� �ִ�.
		return new Fruit() {

			void printName() {
				System.out.println("Ű���Դϴ�.");
			}

			void makeJuice() {
				System.out.println("Ű���ֽ��Դϴ�.");
			}
		};
	}
	
	public static Fruit test() {
		class Mango extends Fruit{	
			void printName() {
				System.out.println("�����Դϴ�.");
			}
			void makeJuice() {
				System.out.println("�����ֽ��Դϴ�.");
			}
		}
		
		return new Mango();
	
	}
}

abstract class Fruit {

	abstract void printName();
	abstract void makeJuice();
}
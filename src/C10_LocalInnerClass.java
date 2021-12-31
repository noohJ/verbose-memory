
public class C10_LocalInnerClass {
	/*
	  	# 지역 내부 클래스
	  	
	  	 - 메서드 내부에 정의한 클래스
	  	 - 해당 메서드가 끝나면 수명이 다하는 클래스
	  	 - 해당 메서드 바깥에서는 접근할 수 없다.
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
		// new Fruit() {} : Fruit을 상속받은 자식을 바로 정의할 수 있다.
		// - 내부 클래스는 이름이 크게 의미가 없는 경우가 많아 이름을 생략하고 만들 수도 있다.
		return new Fruit() {

			void printName() {
				System.out.println("키위입니다.");
			}

			void makeJuice() {
				System.out.println("키위주스입니다.");
			}
		};
	}
	
	public static Fruit test() {
		class Mango extends Fruit{	
			void printName() {
				System.out.println("망고입니다.");
			}
			void makeJuice() {
				System.out.println("망고주스입니다.");
			}
		}
		
		return new Mango();
	
	}
}

abstract class Fruit {

	abstract void printName();
	abstract void makeJuice();
}
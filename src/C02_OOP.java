import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class C02_OOP {
	
	/*
	 		# 객체지향 프로그램 (Object Oriented Programming)
	 		
	 		 - 세상에 존재하는 모든 것(객체)들을 변수와 함수로 표현하려는 프로그래밍 방법론
	 		 - 변수와 함수를 무분별하게 상요하는 것보다 현실에 존재하는 객체 단위로 묶어 표현하여
	 		   개발을 효율적으로 진행할 수 있다.
	 		 - 객체(Object) : 세상에 존재하는 모든 개념
	 		 - 객체의 메서드는 해당 객체의 변수를 변환시키는 경우가 만다.
	 		 
	 		ex: 사과
	 		  
	 		 - 사과의 변수 : 크기, 색깔, 당도, 칼로리, 등급, 원산지 ...
	 		 - 사과의 메서드 (변수를 변화시키는 것들)
	 		   먹는다 : 크기▼ 칼로리▼ 먹은 사람의 칼로리▲
	 		   던진다 : 크기에 비례한 데미지를 입힌다.
	 		   냉장고에 보관한다 : 신선도가 천천히 감소한다.
	 		   
	 		# 클래스 (class)
	 		
	 		 - 현실의 객체를 프로그래밍 언어로 표현한 것
	 		 - 클래스는 해당 객체의 설계도 역할을 한다.
	 		 - 클래스를 정의한 시점에서는 실체가 없다.
	 		 - 클래스를 이용해 찍어낸 실제 객체를 '인스턴스(instance)' 라고 부른다.
	 		 - 클래스를 이용해 실제 객체를 생성할때는 new를 사용한다.
	 		 - 모든 클래스는 참조형 변수 타입이다.	  
	 */
	
	//main은 반드시 public class에 존재해야 한다.
	//public class 반드시 파일명과 같은 이름이어야 한다.
	// -> 한 파일에는 하나의 public class만 존재할 수 있다.
	public static void main(String[] args) {
		
		//사과 클래스로 인스턴스 생성
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
	 		# 인스턴스 변수
	 		
	 		 - 클래스 내부에 선언한 변수
	 		 - 각 인스턴스마다 값이 다를 수 있는 변수
	 		 - aka. 필드, 속성, 멤버 변수, 멤버, 상태,
	  
	 */
	int size;
	int calorie;
	int sweet;
	int price;
	char grade;
	MyOos out;
	/*
	 		# 인스턴스 메서드
	 		
	 		 - 해당 인스턴스의 변수를 변화시키는 메서드
	 */
	void eat( ) {
		size--;
		calorie -= 10;
	}
	public String toString() {
		return "이 사과는 크기가 "+ size+"입니다.";
	}
}


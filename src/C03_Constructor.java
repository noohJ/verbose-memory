
public class C03_Constructor {
	
	/*
	  	# 클래스의 생성자 (Constructor)
	  	
	  	 - 클래스의 이름과 똑같은 이름의 메서드
	  	 - 메서드지만 리턴 타입을 정의하지 않는다
	  	 - 인스턴스를 생성할 때 new와 함께 호출한다.	  
	  	 - 인스턴스 생성시 가장 먼저 호출되는 메서드이기 때문에
	  	   주로 인스턴스 변수 초기화에 많이 사용된다.
	  	 - 생성자를 하나도 정의하지 않은 클래스에는 자동으로 기본 생성자가 존재한다.
	  	   (아무것도 하지 않음)
	  	 - 따로 정의한 생성자가 존재하는 클래스는 기본 생성자를 자동으로 생성해주지 않는다.
	  	   (기본 생성자를 사용하고 싶다면 기본 생성자를 명시적으로 정의해야 한다.)
	 */
	public static void main(String[] args) {
		Banana b1 = new Banana();
		Banana b2 = new Banana(8, "Dole");
		Banana b3 = new Banana(9, "델몬트");
		
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
	
	// 기본 생성자 (매개변수에 아무것도 없는 생성자)
	Banana() {
		System.out.println("바나나가 생성되었습니다.");
	}
	
	// 생성자 오버로딩
	Banana(int qty, String brand) {
		//this. : 현재 인스턴스를 정확하게 가리키는 키워드
		this.qty = qty;
		this.brand =brand;
	}
	
	void info() {
		System.out.println("= = 바나나 정보 = =");
		System.out.printf("개수: %d\n브랜드명: %s\n", this.qty,this.brand);
	}
}

class Peach {
	boolean white;
	
	Peach() {
		this.white = true;
	}
	
	//기본 생성자가 아닌 생성자가 존재하면, 기본 생성자를 자동으로 생성하지 않는다.
	Peach(boolean white) {
		this.white = white;
	}
}
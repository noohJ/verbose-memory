import java.util.Arrays;

public class C04_Static {

	/*
	  	# static (정적 영역, 클래스 영역 <=> 인스턴스 영역)
	  
	  	 - static 영역은 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역이다.
	  	 - 앞에 static이 붙은 자원은 모든 인스턴스가 공동으로 사용하는 자원이 된다.
	  	 - static 영역은 아무리 인스턴스가 많아도 클래스당 하나밖에 생성되지 않기 때문에
	  	   클래스 이름에 .을 찍고 사용할 수 있다.
	  	 - static 영역을 통해 메모리를 절약할 수 있다.
	  	 - static 메스드는 인스턴스 가 만들어지지 않아도 불러올수 있다.
	  	 - static 메서드는 static 자원만을 활용할 수 있는 메서드다.
	  	 - 인스턴스 영역에서는 static 자원을 사용할 수 잇따
	  	 
	 */
	
	public static void main(String[] args) {
//		System.out.println(TrumphCard.width);
//		System.out.println(TrumphCard.height);
//		
//		TrumphCard sk = new TrumphCard(0, 13);
//		TrumphCard h10 = new TrumphCard(2, 10);
//		
//		sk.width = 150;
//		
//		System.err.println(sk.width);
//		System.err.println(sk.height);
//		System.err.println(h10.width);
//		System.err.println(h10.height);
//		System.out.println(TrumphCard.width);
//		System.out.println(TrumphCard.height);
		Lotto ticket1 = new Lotto();
		Lotto ticket2 = new Lotto();
		
		ticket1.random();
		ticket2.random();
		
		System.out.println(Arrays.toString(ticket1.my_num));
		System.out.println(Arrays.toString(ticket1.winning_number));
		System.out.println(Arrays.toString(ticket2.my_num));
		System.out.println(Arrays.toString(ticket2.winning_number));

		
	}
}

class YellowGomJelly{
	static int score;
	static int color;
	static int size_x;
	static int size_y;
	
	int x;
	int y;	
}

class TrumphCard {
	int suit;
	int number;
	static int width = 200;
	static int height = 400;
	
	public TrumphCard(int suit, int number) {
		this.suit = suit;
		this.number = number;
	}
	
//	public static void radom() {
//		 static method에서는 인스턴스 변수를 사용할 수 없다.
//		suit = (int)(Math.random()*4);
//		number = (int)(Math.random()*13);
//	}
	public  void random() {
		suit = (int)(Math.random()*4);
		number = (int)(Math.random()*13);
	}
}
// 연습문제 : static 자원을 포함한 클래스를 정의해 보세요(너비/높이, 크기 금지)
class  Lotto{
	static int price = 1000;
	static int size = 6;
	static int[] winning_number = new int[size];
	int[] my_num = new int[size];
	int num;
	
	public void random() {
		for (int i = 0; i < my_num.length; ++i) {
			winning_number[i] = (int)(Math.random()*45+1);
			my_num[i] = (int)(Math.random()*45+1);
		}
	}
}
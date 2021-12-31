import java.util.Arrays;

public class C04_Static {

	/*
	  	# static (���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����)
	  
	  	 - static ������ ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�.
	  	 - �տ� static�� ���� �ڿ��� ��� �ν��Ͻ��� �������� ����ϴ� �ڿ��� �ȴ�.
	  	 - static ������ �ƹ��� �ν��Ͻ��� ���Ƶ� Ŭ������ �ϳ��ۿ� �������� �ʱ� ������
	  	   Ŭ���� �̸��� .�� ��� ����� �� �ִ�.
	  	 - static ������ ���� �޸𸮸� ������ �� �ִ�.
	  	 - static �޽���� �ν��Ͻ� �� ��������� �ʾƵ� �ҷ��ü� �ִ�.
	  	 - static �޼���� static �ڿ����� Ȱ���� �� �ִ� �޼����.
	  	 - �ν��Ͻ� ���������� static �ڿ��� ����� �� �յ�
	  	 
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
//		 static method������ �ν��Ͻ� ������ ����� �� ����.
//		suit = (int)(Math.random()*4);
//		number = (int)(Math.random()*13);
//	}
	public  void random() {
		suit = (int)(Math.random()*4);
		number = (int)(Math.random()*13);
	}
}
// �������� : static �ڿ��� ������ Ŭ������ ������ ������(�ʺ�/����, ũ�� ����)
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
package BlackJack;

import java.util.Scanner;

public class C08_BlackJack {
	public static void main(String[] args) {
		MyCard mycard = new MyCard();
		DealerCard dealercard = new DealerCard();
		
//		int my_total = 0;
//		int dealer_totla = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("      ���� ���� ī��");
		mycard.fprint();
		System.out.println("    ���� ���� ����: "+mycard.my_total);
		System.out.println("");
		System.out.println("      ������ ���� ī��");
		dealercard.hide_fprint();
		
		
		
		while (MyCard.my_total  <= 21 ) {
			
			System.out.println("  -- 1.HIT  2.STAND --");
			int num = sc.nextInt();			
			if (num == 1) {
				mycard.plusCard();
				mycard.print();
				if (MyCard.my_total > 21) {
					System.out.println("BURST");
					break;
				}
			}else if(num ==2 ) {
				break;
			}
			
		}
		dealercard.print();
		while (DealerCard.dealer_total <=21) {
			if(DealerCard.dealer_total <=16) {
				dealercard.plusCard();
				dealercard.print();
			}else if(DealerCard.dealer_total >= 17) {
				break;
			}
		}
		System.out.println("����� ������ : "+ MyCard.my_total);
		System.out.println("������ ������ : "+ DealerCard.dealer_total);
		System.out.println();
		if(MyCard.my_total ==21){
			System.out.println("���� ����� �¸� �Դϴ�.");
		}else if (MyCard.my_total > 21) {
			System.out.println("����Ʈ�� ����� �й� �Դϴ�.");
		}else if((MyCard.my_total<=21 &&MyCard.my_total>DealerCard.dealer_total) ) {
			System.out.println("����� �¸� �Դϴ�.");
		}else if (MyCard.my_total<=21 && DealerCard.dealer_total>21) {
			System.out.println("������ ī�尡 �������ϴ�  ����� �¸�");
		}else if (MyCard.my_total > 21 && DealerCard.dealer_total > 21) {
			System.out.println("�Ѵ� 21�� �Ѱ���ϴ�. ���º�");
		}else if (MyCard.my_total ==DealerCard.dealer_total) {
			System.out.println("������ �����ϴ�. ���º�");
		}else {
			System.out.println("����� �й� �Դϴ�.");
		}
		
	}
}

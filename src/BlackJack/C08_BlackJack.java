package BlackJack;

import java.util.Scanner;

public class C08_BlackJack {
	public static void main(String[] args) {
		MyCard mycard = new MyCard();
		DealerCard dealercard = new DealerCard();
		
//		int my_total = 0;
//		int dealer_totla = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("      내가 가진 카드");
		mycard.fprint();
		System.out.println("    나의 시작 점수: "+mycard.my_total);
		System.out.println("");
		System.out.println("      딜러가 가진 카드");
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
		System.out.println("당신의 점수는 : "+ MyCard.my_total);
		System.out.println("딜러의 점수는 : "+ DealerCard.dealer_total);
		System.out.println();
		if(MyCard.my_total ==21){
			System.out.println("블랙잭 당신의 승리 입니다.");
		}else if (MyCard.my_total > 21) {
			System.out.println("버스트로 당신의 패배 입니다.");
		}else if((MyCard.my_total<=21 &&MyCard.my_total>DealerCard.dealer_total) ) {
			System.out.println("당신의 승리 입니다.");
		}else if (MyCard.my_total<=21 && DealerCard.dealer_total>21) {
			System.out.println("딜러의 카드가 터졌습니다  당신의 승리");
		}else if (MyCard.my_total > 21 && DealerCard.dealer_total > 21) {
			System.out.println("둘다 21을 넘겼습니다. 무승부");
		}else if (MyCard.my_total ==DealerCard.dealer_total) {
			System.out.println("점수가 같습니다. 무승부");
		}else {
			System.out.println("당신의 패배 입니다.");
		}
		
	}
}

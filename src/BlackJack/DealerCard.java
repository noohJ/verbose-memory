package BlackJack;

import java.util.Arrays;

public class DealerCard {
	int[] dealer_card,dealer_card2;
	static int dealer_total = 0;
	int start_card = 2;
	int number_of_cards = 2;
	public DealerCard() {
		dealer_card = new int[start_card];

		for (int i = 0 ; i <start_card; ++i) {
			int num = BJ_Public.rancard();
			dealer_card[i] = num;
			if (num >= 10) {
				dealer_total+=10;
			}else if(num == 1) {
				dealer_total+=11;
			}else {				
				dealer_total += num;
			}
		}
		if (dealer_total>21) {
			for (int i = 0; i <dealer_card.length; ++i) {
				if(dealer_card[i] ==1) {
					dealer_total-=10;
				}
			}			
		}
	}
	
	public void plusCard() {
		++number_of_cards;
		dealer_card2 = new int[number_of_cards];
		
		for (int i = 0; i <dealer_card.length;++i ) {
			dealer_card2[i] = dealer_card[i];
		}
		int num = BJ_Public.rancard();
		dealer_card2[number_of_cards-1] = num;
		if(dealer_total >21) {
			for(int i = 0;i < dealer_card.length;++i) {
				if (dealer_card[i]==1) {
					dealer_total-=10;
				}else {
					break;
				}
			}
		}
		if (num >= 10) {
			dealer_total+=10;
		}else if(num == 1) {
			if(dealer_total+11 >21) {
				dealer_total+=1;				
			}else {
				dealer_total+=11;
			}
		}else {				
			dealer_total += num;
		}
		if (dealer_total>21) {
			for (int i = 0; i <dealer_card.length; ++i) {
				if(dealer_card[i] ==1) {
					dealer_total-=10;
				}
			}			
		}
		dealer_card = dealer_card2;
	}
	public void hide_fprint() {
		System.out.println(" ������������������    ������������������");
		System.out.println(" ��       ��    ��       ��");
		System.out.printf(" ��   ?   ��    ��  %2d   ��\n",dealer_card[1]);
		System.out.println(" ��       ��    ��       ��");
		System.out.println(" ������������������    ������������������");
	}
	public void print() {
		System.out.println("���� ī�� " + Arrays.toString(dealer_card));
	}
	public void hide_print() {
		System.out.printf("���� ī�� [?, %d]\n",dealer_card[1]);
	}
}

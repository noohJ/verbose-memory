package BlackJack;

import java.util.Arrays;

public class MyCard {
	int[] my_card, my_card2;
	static int my_total = 0;
	int start_card = 2;
	int number_of_cards = 2;
	public MyCard() {
		my_card = new int[start_card];
		
		for (int i = 0 ; i <start_card; ++i) {
			int num = BJ_Public.rancard();
			my_card[i] = num;
			if (num >= 10) {
				my_total+=10;
			}else if(num == 1) {
				my_total+=11;
			}else {				
				my_total += num;
			}
		}
		if(my_total>21) {
			for (int i = 0; i <my_card.length; ++i) {
				if(my_card[i] ==1) {
					my_total-=10;
				}
			}			
		}
	}
	
	public void plusCard() {
		++number_of_cards;
		my_card2 = new int[number_of_cards];
		
		for (int i = 0; i <my_card.length;++i ) {
			my_card2[i] = my_card[i];
		}
		int num = BJ_Public.rancard();
		my_card2[number_of_cards-1] = num;
		
		if(my_total >21) {
			for(int i = 0;i < my_card.length;++i) {
				if (my_card[i]==1) {
					my_total-=10;
				}else {
					break;
				}
			}
		}
		if (num >= 10) {
			my_total+=10;
		}else if(num == 1) {
			if(my_total+11 >21) {
				my_total+=1;				
			}else {
				my_total+=11;
			}
		}else {				
			my_total += num;
		}	
		if(my_total>21) {
			for (int i = 0; i <my_card.length; ++i) {
				if(my_card[i] ==1) {
					my_total-=10;
				}
			}			
		}
		my_card = my_card2;
	}
	public void fprint() {
		System.out.println(" 忙式式式式式式式忖    忙式式式式式式式忖");
		System.out.println(" 弛       弛    弛       弛");
		System.out.printf(" 弛  %2d   弛    弛  %2d   弛\n",my_card[0],my_card[1]);
		System.out.println(" 弛       弛    弛       弛");
		System.out.println(" 戌式式式式式式式戎    戌式式式式式式式戎");
	}
	public void print() {
		System.out.println("頂 蘋萄 " + Arrays.toString(my_card));
	}
}

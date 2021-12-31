package BlackJackFinal;

import java.util.Scanner;

public class Game {
	
	private Scanner sc = new Scanner(System.in);
	private Deck deck = new Deck();
	
	private Card[] player = new Card [10];
	private Card[] dealer = new Card [10];
	
	private int p_index = 0;
	private int d_index = 0;
	
	private boolean stand = false;
	
	public Game() {
		
	}
	
	private void p_draw() {
		player[p_index++] = deck.draw();
	}
	
	private int valueCheck(Card[] cards) {
		int sum = 0, ace_count = 0; 
		
		for (int i = 0; cards[i] != null; ++i) {
			int value = cards[i].getRankValue();
			if(value == 11) {
				ace_count++;
			}
			sum += value;
			// 합이 21이 넘는다면 A의 개수만큼 10을 뺄 수 있다. 	
		}
		while (ace_count > 0 && sum >21) {
//			System.out.println("A하나를 1로 사용함");
			sum -=10;
			ace_count--;
		}
		return sum;
//		if (sum>21) {
//			System.out.println("[BUST] 현제 플레이어 총합 : " +sum);
//			return true;
//		}else {
//			System.out.println("[HIT] 현제 플레이어 총합 : " +sum);			
//			return false;
//		}
	}
	private void d_draw() {
		dealer[d_index++] = deck.draw();
	}
	
	
	
	private void printCardLine(Card[] cards,boolean hide) {
		for (int line = 0; line < 6 ; ++line) {
			for (int i = 0; cards[i] !=null; ++i ) {
				Card card = cards[i];
				switch (line) {
				case 0:
					System.out.print("┌──────────┐ ");
					break;
				case 1:
					if (hide  && i ==0) {
						System.out.printf ("│XX        │ ", card.getSuit());
					}else {
						System.out.printf ("│%2c        │ ", card.getSuit());						
					}
					break;
				case 2:
					System.out.print("│          │ ");
					break;
				case 3:
					System.out.print("│          │ ");
					break;
				case 4:
					if(hide && i ==0) {
						System.out.printf ("│       XX │ ", card.getRank());
					}else {
						System.out.printf ("│       %2s │ ", card.getRank());	
					}
					break;
				case 5:
					System.out.print("└──────────┘ ");
					break;
				}
				
			}
			System.out.println();			
		}

	}
	
	private void printCardLine(Card[] cards) {
		for (int line = 0; line < 6 ; ++line) {
			for (int i = 0; cards[i] !=null; ++i ) {
				Card card = cards[i];
				switch (line) {
				case 0:
					System.out.print("┌──────────┐ ");
					break;
				case 1:
					System.out.printf ("│%2c        │ ", card.getSuit());
					break;
				case 2:
					System.out.print("│          │ ");
					break;
				case 3:
					System.out.print("│          │ ");
					break;
				case 4:
					System.out.printf ("│       %2s │ ", card.getRank());
					break;
				case 5:
					System.out.print("└──────────┘ ");
					break;
				}
				
			}
			System.out.println();			
		}

	}
	private  void print() {
		System.out.println("DEALER:"+(stand ? valueCheck(dealer) : "??"));
		printCardLine(dealer, !stand);
		
		System.out.println("PLAYER:" + valueCheck(player)+"점");
		printCardLine(player);
	}
	

	
	public void play() {
		d_draw();
		d_draw();
		p_draw();
		p_draw();

		int playerValue = 0, dealerValue =0;
		while (true) {
			print();
			System.out.println("1. HIT\t2. STAND\n>> ");
			
			switch (sc.nextInt()){
			case 1:
				p_draw();
				playerValue =valueCheck(player);
				stand = playerValue >21;
				break;
			case 2:
				stand = true;
				break;
			default:
				break;
			}
			if (stand) {
				print();
				break;
			}
		}
		
		
		if (playerValue > 21) {
			System.out.println("플레이어 버스트 ..");
			return;
		}
		
		// 딜러는 17미만인 경우 무조건 뽑아야 함 
		while ((dealerValue = valueCheck(dealer)) <17) {
			d_draw();
			print();
		}
		
		if (dealerValue >21 || playerValue>dealerValue) {		
			System.out.println("플레이어 승!!");			
		}else if (playerValue < dealerValue) {
			System.out.println("딜러 승..");			
		}else {
			System.out.println("무승부 !");
		}
	}
	public static void main(String[] args) {
		new Game().play();
	}
}

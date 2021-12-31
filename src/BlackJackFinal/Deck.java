package BlackJackFinal;

public class Deck {	
	//ī�带 �� �� ����� ����
	private Card[] cards = new Card[Card.SUIT_SIZE * Card.RANK_SIZE*3];
	private int top = 0;
	private int bottom = 0;
	
	public Deck() {
		//ī����� �迭�� �߰��ϰ� �������� ����
		for (int i = 0, index = 0; i < 3; ++i) {
			for (int suit = 0 ; suit < Card.SUIT_SIZE; ++suit) {
				for (int rank = 0; rank < Card.RANK_SIZE; ++rank) {
					cards[index++] = new Card(suit, rank);					
				}
			}
		}
		shuffle();
	}
	public int getSize() {
		return cards.length;
	}
	
	public void printAll() {
		for (int i = 0; i < cards.length;++i) {
			cards[i].print();
			System.out.println(i + "��° ī��");
		}
	}
	
	public void shuffle() {
		for (int i = 0; i < 1000; ++i) {
			int ran = (int)(Math.random()*(cards.length - 1)+1);
			Card temp = cards[0];
			cards[0]= cards[ran];
			cards[ran] = temp;
		}
	}
	
	private boolean drawable() {
		return top < cards.length -bottom;
	}
	
	public Card draw() {
		if (drawable()) {
			return cards[top++];
		}else {
			System.out.println("[INFO] �� ���� ī�尡 ��� ���� �ٽ� �����ϴ�.");
			shuffle();
			top = 0;
			bottom =0;
			return cards[top++];
		}		
	}
	
	public Card underDraw() {
		if (drawable()) {
			return cards[(cards.length -1) - bottom++];
		}else {
			System.out.println("[INFO] �� ���� ī�尡 ��� ���� �ٽ� �����ϴ�.");
			shuffle();
			top = 0;
			bottom =0;
			return cards[bottom++];
		}			
	}
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		
		for (int i = 0; i < 200; ++i) {
			System.out.printf("����ī�� [%d]:\n", i);
			deck.draw().print();
		}
	}
	
}

package BlackJackFinal;

public class Card {
	final public static int SUIT_SIZE = 4;
	final public static int RANK_SIZE = 13;
	
	private static char[] SUITS = {'Ⅳ','Ⅷ','Ⅵ','～'};
	private static String[] RANKS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private static int[] RANK_VALUES = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
	private int suit;  // 0~3
	private int rank;
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	public String getRank() {
		return RANKS[rank];
	}

	public char getSuit() {
		return SUITS[suit];
	}
	public int getRankValue() {
		return RANK_VALUES[rank];
	}
	
	public void print() {
		System.out.println("忙式式式式式式式式式式忖");
		System.out.printf ("弛%2c        弛\n", SUITS[suit]);
		System.out.println("弛          弛");
		System.out.println("弛          弛");
		System.out.printf ("弛       %2s 弛\n", RANKS[rank]);
		System.out.println("戌式式式式式式式式式式戎");		
	}
	public static void main(String[] args) {
		for (int suit = 0 ; suit <4; ++suit) {
			for (int rank = 0; rank <13; ++rank) {
				new Card(suit, rank).print();
			}			
		}
	}

	
	
}

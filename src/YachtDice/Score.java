package YachtDice;

public class Score {
	// Yacht :5, FullHous: 4, FourDice: 3, Ls: 2, SS: 1, NM: 0
	int made; 
	// Yacht :50, FullHous: dot, FourDice: dot, Ls: 30, SS: 15, NM: dot
	int score;
	
	public Score(int made, int score) {
		this.made = made;
		this.score = score;
	}
}

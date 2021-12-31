package YachtDice;

public class DiceSet {
	
	int[] dices;
	int gameSize;
	
	final int DEFAULT_GAME_SIZE = 5;
	
	public DiceSet() {
		dices = new int[gameSize=DEFAULT_GAME_SIZE];	
		
		for (int i = 1; i <= DEFAULT_GAME_SIZE; ++i) {
			reroll(i);
		}
	}
	
	int ran() {
		return (int)(Math.random() * 6 + 1);
	}
	
	public void reroll(int dNum) {
		dices[dNum - 1] = ran();
	}
	public void print() {
		System.out.println("������������������������������������������");
		System.out.printf( "�� %d �� %d �� %d �� %d �� %d ��\n",
				dices[0], dices[1],dices[2],dices[3],dices[4]);
		System.out.println("������������������������������������������");
	}
	
	public int getGameSize() {
		return this.gameSize;
	}
	
	public int get(int index) {
		return dices[index];
	}
	
	public int getDot() {
		int sum = 0;
		for (int i = 0; i < gameSize; ++i ){
			sum += dices[i];
		}
		return sum;
	}
}

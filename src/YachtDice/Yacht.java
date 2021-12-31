package YachtDice;

import java.util.Arrays;
import java.util.Scanner;

public class Yacht {
	Scanner sc ;
	
	public Yacht() {
		sc = new Scanner(System.in);
	}
	boolean numContain(int[] numCount, int num) {
		return numCount[num - 1] >0;
	}
	
	boolean countContain(int[] numCount, int count) {
		for (int i = 0; i < numCount.length; ++i) {
			if(numCount[i] == count) {
				return true;
			}
		}
		return false;
	}
	
	Score calc(DiceSet set) {
		int[] numCount = new int[6];
		
		for (int i = 0; i < set.getGameSize(); ++i) {
			int num =set.get(i);
			numCount[num - 1]++;
		}
		
		if (countContain(numCount, 5)) {
			return new Score(5,50);
		} else if (countContain(numCount, 4)) {
			return new Score (4, set.getDot());
		} else if (countContain(numCount, 3) && countContain(numCount, 2)) {
			return new Score(3, set.getDot());
		} else if (numContain(numCount, 2) && numContain(numCount, 3) 
				&& numContain(numCount, 4) &&numContain(numCount, 5)
				&&(numContain(numCount, 1) ||numContain(numCount, 6))
		){	
			return new Score(2, 30);	
		} else if(
				numContain(numCount, 3) && numContain(numCount, 4)
				&& ((numContain(numCount, 1) && numContain(numCount, 2))||
					(numContain(numCount, 2) && numContain(numCount, 5)) ||
					(numContain(numCount, 5) && numContain(numCount, 6)))
		){
			return new Score(1, 15);
		}else {
			int total  = 0; 
			for (int i = 0; i < set.getGameSize(); ++i) {
				total += set.get(i);
			}
			return new Score(0, total);
		}

	}
	
	
	DiceSet turn() {
		DiceSet set = new DiceSet();
		
		
		
		int remain = 2;
		while(remain > 0) {
			set.print();
			System.out.printf("1. 바꾸기(%d)\t2. 안바꾸기\n>>", remain);
			int select = sc.nextInt();
			
			if (select==1) {
				int rNum = -1;
				System.out.print("다시 던지고 싶은 주사위 개수 >> ");				
							
				while(rNum <1 || rNum > 5) {
					rNum = sc.nextInt();					
				}
				
				boolean[] rerollable = new boolean[set.getGameSize()];
				Arrays.fill(rerollable,true);
				
				for (int i = 0; i < rNum; ++i) {
					int dNum = -1;
					System.out.printf("Reroll (%d/%d) >>" , i + 1, rNum);
					dNum = sc.nextInt();
					
					if (dNum < 1 || dNum > 5) {
						--i;
						continue;
					}
					
					if (rerollable[dNum - 1]) {
						set.reroll(dNum);
						rerollable[dNum - 1] = false;
					} else {
						--i;
					}
				}
				
				--remain;
			}else if (select == 2) {
				return set;
			}
		}
		
		set.print();
		return set;
	}
	
	public void play() {
		DiceSet a = turn();
		DiceSet b = turn();
		
		Score as = calc(a);
		Score bs = calc(b);
		
		System.out.println("A - made: " + as.made + ", score: " + as.score);
		System.out.println("B - made: " + bs.made + ", score: " + bs.score);
		
	}
}

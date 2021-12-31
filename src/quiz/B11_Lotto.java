package quiz;

import java.util.Arrays;

public class B11_Lotto {
	public static void main(String[] args) {
		
		final int LOTTO_SIZE= 7;
		int[]lotto = new int[LOTTO_SIZE];
		
		for (int i = 0; i < lotto.length; ++i) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for (int chk = 0; chk < i ; ++chk) {
				if(lotto[i] == lotto[chk]) {
					--i;
					break;
				}
			}
		}
		System.out.println("´çÃ·¹øÈ£: "+Arrays.toString(lotto));
		
		while(true) {
			int[] auto = new int[LOTTO_SIZE];
			
			for (int i = 0; i < auto.length; ++i) {
				auto[i] = (int)(Math.random() * 45 + 1);
				
				for (int chk = 0; chk < i ; ++chk) {
					if(auto[i] == auto[chk]) {
						--i;
						break;
					}
				}
			boolean win = true;
			
			for (int i = 0; i < LOTTO_SIZE; ++i) {
					if (lotto[i] == auto[i]) {
						correct++;
						break;
					}
				}
				if (win)
			}
		}	
	}
	
}

package quiz;

import java.util.Arrays;
import java.util.Random;

public class B12_Array2Quiz {
	public static void main (String[] args) {
		
		Random ran = new Random();
		
		int max_column = 0;
		int total =0;
		int[][] numArr = new int[][] {
			{1, 1, 1, 1, 1},
			{1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1}
		};
		double len = 0;
		
		for (int i = 0;  i < numArr.length; ++i ) {
			for (int j = 0; j < numArr[i].length; ++j) {
				numArr[i][j] = ran.nextInt(101);
			}
		}
		for (int i = 0;  i < numArr.length; ++i ) {
			System.out.println(Arrays.toString(numArr[i]));			
		}
		
		// ÀüÃ¼ ÃÑÇÕ
		for (int i = 0;  i < numArr.length; ++i ) {
			for (int j = 0; j < numArr[i].length; ++j) {
				total += numArr[i][j];	
			}
		}
		// length±¸ÇÏ±â
		for (int i = 0; i <numArr.length; ++i) {
			len += numArr[i].length;
		}

		System.out.println("---------------------------------------------------");		
		System.out.printf("ÃÑÇÕ : %d\n",total);
		System.out.printf("Æò±Õ : %f\n",total / len);		
		System.out.println("---------------------------------------------------");
		
		for (int i = 0;  i < numArr.length; ++i ) {
			total = 0;
			for (int j = 0; j < numArr[i].length; ++j) {
				total += numArr[i][j];
			}
			System.out.printf("%d¹øÂ° ÇàÀÇ ÃÑÇÕ : %d\n", i+1,total);
		}
		System.out.println("---------------------------------------------------");
		
		for (int i = 0;  i <8; ++i ) {
			total =0;
			for (int j = 0 ; j < numArr.length; ++j) {
				if (numArr[j].length <= i) {
					continue;
				}else {
					total += numArr[j][i];									
				}
			}
			System.out.printf("%d¹øÂ° ¿­ÀÇ ÃÑÇÕ : %d\n", i+1,total);
		}
	}
}

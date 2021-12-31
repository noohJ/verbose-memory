package quiz;

import java.util.Arrays;

public class B11_Sort {
	public static void main(String[] args) {
		int[] num = new int[10];
		int[] num_blank = new int[10];
		int temp;
		
		
		for (int i = 0 ; i < num.length ; ++i) {
			num[i] = (int)(Math.random() * 100000);
		}
		
		System.out.println(Arrays.toString(num));

        for(int i = 0; i < num.length-1; ++i ) {
            for(int j = i+1 ; j < num.length; ++j) {
            	if(num[j] < num[i]) {
            		temp = num[i];
            		num[i] = num[j];
            		num[j] = temp;
            	}
            }
        }

        
		
		System.out.println(Arrays.toString(num));
		
	}

}

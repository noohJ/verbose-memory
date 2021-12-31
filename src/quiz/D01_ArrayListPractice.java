package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice {
 /*
   		# ArrayList에 1000부터 9999의 랜덤 정수를 100개 추가한 후 다음 을 구해보세요
   		
   		1. 나온 숫자의 평균
   		
   		2. 나온 숫자 중 가장 큰 수
   		
   		3. 나온 숫자 중 가장 작은 수
   		
   		4. 77번째에 나온 수
   
  */
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		final int MAX_NUM = 9999, MIN_NUM = 1000;
		int big = MIN_NUM, small =MAX_NUM, total =0;
		
		
		for (int i =0; i < 100 ;) {
			numbers.add((int)(Math.random()*9000+1000));
			 ++i;
		}
		
//		for (int i = 0; i <numbers.size();++i) {
//			if(big <numbers.get(i)) {
//				big = numbers.get(i);
//			}
//		}
//		for (int i = 0; i <numbers.size();++i) {
//			if(small >numbers.get(i)) {
//				small = numbers.get(i);
//			}
//		}
//		for (int number:numbers) {
//			total +=number;
//		}
		for (int num : numbers) {
			big = Math.max(big, num);
			small = Math.min(small, num);
			total +=num;
		}
		
		System.out.println("숫자의 평균 : " + total/(double)numbers.size());
		System.out.println("가장 큰 수 : " + big);
		System.out.println("가장 작은 수 : " + small);
		System.out.println("77번째 에 나온 수 : " + numbers.get(76));
	}
}

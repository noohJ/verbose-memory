package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice {
 /*
   		# ArrayList�� 1000���� 9999�� ���� ������ 100�� �߰��� �� ���� �� ���غ�����
   		
   		1. ���� ������ ���
   		
   		2. ���� ���� �� ���� ū ��
   		
   		3. ���� ���� �� ���� ���� ��
   		
   		4. 77��°�� ���� ��
   
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
		
		System.out.println("������ ��� : " + total/(double)numbers.size());
		System.out.println("���� ū �� : " + big);
		System.out.println("���� ���� �� : " + small);
		System.out.println("77��° �� ���� �� : " + numbers.get(76));
	}
}

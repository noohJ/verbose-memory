package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class D07_CountFruit {
	static String[] fruit_names = {"apple", "banana", "orange", "dragonfruit", "strawberry"};
	/*
	  	�迭�� ������ �������� 1000�� �߰��� �Ŀ� �� ������ �� ���� �����ߴ��� �������.
	 */
	public static void main(String[] args) {
//		HashMap<String, ArrayList<String>> fruits = new HashMap();
//		HashMap<String, Integer> fruits_count = new HashMap();
//		ArrayList<String> fruit = new ArrayList<>();
//		HashMap<String, String[]> fruits1 = new HashMap();
//		int a_count = 0;
//		int g_count = 0;
//		int s_count = 0;
//		int w_count = 0;
//		int p_count = 0;
//		
//		
//		for (int i = 0; fruit.size() < 1000 ;++i) {
//			int rf = (int)(Math.random()*5+1);
//			if (rf == 1) {
//				fruit.add("���");
//			}else if (rf == 2) {
//				fruit.add("����");
//			}else if (rf == 3) {
//				fruit.add("����");
//			}else if (rf == 4) {
//				fruit.add("����");
//			}else {
//				fruit.add("������");
//			}
//		}
//		
//		fruits.put("����", fruit);
//		
//		for (int i = 0; i < fruit.size(); ++i) {
//			if(fruit.get(i) == "���") {
//				++a_count;
//			} else if (fruit.get(i) == "����") {
//				++g_count;
//			} else if (fruit.get(i) == "����") {
//				++s_count;
//			} else if (fruit.get(i) == "����") {
//				++w_count;
//			} else {
//				++p_count;
//			}
//		}
//		
//		fruits_count.put("��� ����", a_count);
//		fruits_count.put("���� ����", g_count);
//		fruits_count.put("���� ����", s_count);
//		fruits_count.put("���� ����", w_count);
//		fruits_count.put("������ ����", p_count);
//
//		for (String key : fruits_count.keySet()) {
//			System.out.println(key + " : " + fruits_count.get(key));
//		}
		
		String[] fruits = new String[1000];
		
		for (int i = 0; i<fruits.length;++i) {
			fruits[i] = fruit_names[(int)(Math.random()*fruit_names.length)];
		}
		answer2(fruits);
		answer3(fruits);
		
	}
	
	public static void answer3(String[] fruits) {
		HashMap<String, Integer> countMap = new HashMap<>();
		
		for (String fruit : fruits) {
			Integer cnt;
			if ((cnt = countMap.putIfAbsent(fruit, 1)) != null) {
				countMap.put(fruit,  cnt +1);
			}
		}
		System.out.println(countMap);
	}
	
	public static void answer2(String[] fruits) {
		List<String> list = Arrays.asList(fruits);
		for (int i = 0 ;i < fruit_names.length; ++i) {
			System.out.printf("%s : %d\n", 
					fruit_names[i],Collections.frequency(list, fruit_names[i]));
			
		}
	}
}

package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public class D03_Jiphap {
	/*
	  	������ ����� �ϴ� �޼������ �����غ�����
	  	
	  	1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	  	
	  	2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	  	
	  	3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	  
	 */
	
	/* �⺻���� ���� ���ο� ���� ������ ����ִ�
	 * �������� ���� ���ο� ���� ����������� �ʰ� �� ���� ��ġ�� ����ִ�.
	 * ���ڿ��� ���� ������ �ϸ� �� �ν��Ͻ��� �����Ѵ�.(���� �ν��Ͻ��� ������ �� ����)
	 */
//	public static Set<Integer> union (Collection<Integer> a, Collection<Integer> b) {
//		Set<Integer> union = new HashSet<>();
//		union.addAll(a);
//		union.addAll(b);
//		return union;
//	}
//	public static Set<Integer> intersection(Collection<Integer> a, Collection<Integer> b){
//		Set<Integer> inter = new HashSet<>();
//		inter.addAll(a);
//		inter.retainAll(b);
//		return inter;
//	}
//	public static Set<Integer> difference(Collection<Integer> a, Collection<Integer> b){
//		Set<Integer> diff = new HashSet<>();
//		diff.addAll(a);
//		diff.removeAll(b);
//		return diff;
//	}
	public static void main(String[] args) {
//		List<Integer> a = new ArrayList<>();
//		List<Integer> b = new ArrayList<>();
//		
//		Collections.addAll(a, 1, 3, 5, 7, 9, 11);
//		Collections.addAll(b, 7, 9, 11, 13, 15, 17, 33);
//
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(union(a,b));
//		System.out.println(intersection(a,b));
//		System.out.println(difference(a,b));
//		System.out.println(difference(b,a));
		
//	}
		// Integer
		HashSet<Integer> numbers1 = new HashSet<>();
		HashSet<Integer> numbers2 = new HashSet<>();
		Set<Integer> number = new Set<Integer>();
				
		for (int i = 1; i <11;++i ) {
			numbers1.add(i);
		}
		for (int i = 5; i < 16;++i ) {
			numbers2.add(i);
		}	
		
		System.out.println("���� �׷� 1 : " +(numbers1));
		
		System.out.println("���� �׷� 2 : " + (numbers2));
		
		System.out.println("������ : " + number.hap(numbers1, numbers2));
		
		System.out.println("������ : " + number.gyo(numbers1, numbers2));
		
		System.out.println("������ : " + number.cha(numbers1, numbers2));
		
		// String
		
		HashSet<String> words1 = new HashSet<>();
		HashSet<String> words2 = new HashSet<>();
		Set<String> words = new Set<String>();

		
		Collections.addAll(words1,"���","����","���","������","����","����","�ڸ�");
		Collections.addAll(words2, "���","����","�ڸ�","Ű��","û����","����");
		
		System.out.println("���� �׷� 1 : " +(words1));
		
		System.out.println("���� �׷� 2 : " + (words2));
		
		System.out.println("������ : " + words.hap(words1, words2));
		
		System.out.println("������ : " + words.gyo(words1, words2));
		
		System.out.println("������ : " + words.cha(words1, words2));
	}
}

//
//class Set<Type>{
//	HashSet<Type> hapnumbers = new HashSet<>();
//	HashSet<Type> gyonumbers = new HashSet<>();
//	HashSet<Type> chanumbers = new HashSet<>();
//	
//	 public HashSet<Type> hap(HashSet<Type> a, HashSet<Type> b){
//		 hapnumbers.addAll(a);
//		 hapnumbers.addAll(b);		 
//		return hapnumbers;
//	}
//	 
//	 public HashSet<Type> gyo(HashSet<Type> a, HashSet<Type> b){
//		 for(Type number: b) {
//			int chk = Collections.frequency(a, number);
//			if (chk != 0) {
//				gyonumbers.add(number);
//			}
//		}	
//		return gyonumbers;
//	}
//	 
//	public HashSet<Type> cha(HashSet<Type> a, HashSet<Type> b){
//		for(Type number: a) {
//			chanumbers.add( number);
//		}
//		 for(Object number: gyonumbers) {
//			chanumbers.remove(number);
//		}
//		return chanumbers;
//	}
//
//	public void add(Info info) {
//		// TODO Auto-generated method stub
//		
//	}
}

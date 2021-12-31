import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class D03_Collections {
	/*
	  	# java.util.Arrays
	  	
	  	 - �迭�� ���ϰ� �ٷ� �� �ִ� ��ɵ��� ���ִ� Ŭ����
	  	 
	  	# java.util.Collections
	  	
	  	 - �÷����� ���ϰ� �ٷ� �� �ִ� ��ɵ��� ���ִ� Ŭ����
	  
	 */
	
	// Collections Ŭ������ �޼������ ���� ã�Ƽ� �����ϰ� �����غ�����.
	
	public static void main(String[] args) {
		
		// addAll() : ������ �÷��ǿ� �ѹ��� �������� ���� �߰��� �� ����Ѵ�.
		Collection<String> flavor = new HashSet<>();
		
		Collections.addAll(flavor, "peaches 'n Plutonium", "Rocky Racoon", "�����");
		System.out.println(flavor);
		
		// fill(): ������ ����Ʈ�� ���ϴ� ������ ä�� �� �ִ�.
		ArrayList<String> address = new ArrayList<>();
		
		address.add("abc");
		address.add("abc");
		address.add("abc");
		address.add("abc");
		address.add("abc");
		address.add("abc");
		
		System.out.println(address);
		
		Collections.fill(address, "�⺻ �����");
		
		System.out.println(address);
		
		// frequency(): �ش� �÷��ǿ� ���ϴ� ���� � ����ִ��� �˾Ƴ��� ��ȯ�Ѵ�.
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("melon");
		fruits.add("melon");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("watermelon");
		fruits.add("watermelon");
		fruits.add("watermelon");
		fruits.add("watermelon");
		fruits.add("watermelon");
		
		int numofApple = Collections.frequency(fruits, "apple");
		System.out.println("����� ����: " + numofApple);
		
		ArrayList<String> sub_fruits = new ArrayList<>();
		
		sub_fruits.add("apple");
		sub_fruits.add("melon");
		
		// indexOfSubList(): �κ� ������ �տ������� ã�´�.
		// LastindexOfSubList(): �κ� ������ �ڿ������� ã�´�.
		int index =  Collections.indexOfSubList(fruits, sub_fruits);
		int index2 =  Collections.lastIndexOfSubList(fruits, sub_fruits);
		
		System.out.println("�տ������� ã�� �κ� ������ ��ġ: " + index);
		System.out.println("�ڿ������� ã�� �κ� ������ ��ġ: " + index2);
		
		// nCopies (): ������ ���� ���ϴ� ��ŭ ������ ����Ʈ�� ����� ��ȯ�Ѵ�.
		List<Integer> copies =Collections.nCopies(15, 12345);
		List<Apple> copies2 =Collections.nCopies(15, new Apple());
		
		
		System.out.println(copies);
		System.out.println(copies2);
		
		copies2.get(0).calorie = 321;
		System.out.println(copies2.get(7).calorie);
		
		
		//rotate(): ����Ʈ�� ���ϴ� ��ŭ ��ȯ��Ų��. (-1�� ����, +1�� ������)		
		//shuffle(): 
		List<Integer> numbers = new ArrayList<>();		
		
//		for (int i = 0; i < 10; ++i) {
//			numbers.add(i);
//		}
//		Collections.rotate(numbers, 2);		
//		System.out.println(numbers);
		
		for (int i = 0 ; i <10; ++i) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		System.out.println(numbers);
		
		// sort(): �ش� ����Ʈ�� �������ش�. (Set�� ������ ��� ������ �Ұ���)
		Collections.sort(numbers);
		System.out.println(numbers);
		
		// swap() : ����Ʈ���� ���ϴ� �� ��Ҹ� ��ü�Ѵ�.
		Collections.swap(numbers, 3, 5);
		System.out.println(numbers);
	}
}
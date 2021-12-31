
import java.util.ArrayList;

public class D01_ArrayList {
	/*
	  	# Java Documentation
	  	
	  	 - �ڹٴ� ����Ŭ�翡�� �ֱ������� ������Ʈ �� ������ �ϰ� �ִ� ����̴�.
	  	 - ��� �ڹ� ������ ����Ŭ�� ������ �ڼ��� ����Ǿ� �ִ�.
	  	 - https://docs.oracle.com/en/java/javase/17/docs/api/index.html
	  	 
	  	# Java Collection Interface
	  	
	  	 - Collection�� �ڹٿ��� �����ϴ� �ڷᱸ�� �������̽��̴�.
	  	 - Collection������ �������� �ٸ� �÷������� ��ȯ�� �����ϴ�.
	  	 - Collection �������̽��� ������ �ɷ����� List , Set ���� �ִ�.
	  	 
	  	# Java.util.ArrayList 
	  	
	  	 - �迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ���� ������ Ŭ����
	  	 - �迭ó�� �����͸� ���������� ������ �� ����.
	  	 - ��� �����͸� ������� �о�� �� �� ���� ������ ���� �÷����̴�.
	 */
	public static void main(String[] args) {
		
		/*
		  	# java.util.Arrays
		  
		  	 - �迭�� ���ϰ� �ٷ� �� �ִ� ��ɵ��� ���ִ� Ŭ����
		  	 - �÷����� �ƴϴ�.
		 */
						
		/*
		  	# Ÿ���� �����ϸ� ArrayList �����ϱ�	  
		 */
		
		ArrayList<String> fruits = new ArrayList<>(); 
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Character> cha = new ArrayList<>();
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		
		//add(item): ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰��Ѵ�. �߰��ϴ� �������� Ÿ���� <>�� �����Ѵ�.
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Grape");
		fruits.add("Melon");
		
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		
		numbers.add(15);
		numbers.add(20);
		
		System.out.println(fruits);
		System.out.println(numbers);
		
		// add(index, item): ���ϴ� ��ġ�� �����͸� �߰��� �� �ִ�.
		try {
			fruits.add(3, "WaterMelon");
			fruits.add(0, "WaterMelon");
			fruits.add(-1, "WaterMelon");			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("�̻��� �ε����� �־����ϴ�.");
		} finally {
			System.out.println(fruits);
		}
		
		// get(index): ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ��ȯ�Ѵ�.
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(numbers.get(0));
		
		System.out.println("fruits�� ũ��: "+fruits.size());
		
		for (int i = 0, size = fruits.size(); i < size; ++i) {
			System.out.println(fruits.get(i));
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		// remove(index): �ش� ��°�� �����͸� �����Ѵ�. ��� ������ �����͸� ��ȯ�Ѵ�.
		for (int i = 0; i <5; ++i) {
			System.out.println("������ ������: "+fruits.remove(0));
		}
		System.out.println("���� ���� ���: " +fruits);
		
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		
		//remove(item): �ش� �����Ͱ� �����Ѵٸ� �����Ѵ�. ���� ���� ���θ� ��ȯ�Ѵ�.
		for (int i = 0; i <7; ++i) {
			boolean result = fruits.remove("Orange");
			System.out.println("���� ���� ����: "+ result);
		}
	}
}

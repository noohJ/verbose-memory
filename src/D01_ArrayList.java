
import java.util.ArrayList;

public class D01_ArrayList {
	/*
	  	# Java Documentation
	  	
	  	 - 자바는 오라클사에서 주기적으로 업데이트 및 관리를 하고 있는 언어이다.
	  	 - 모든 자바 문법은 오라클의 문서에 자세히 서명되어 있다.
	  	 - https://docs.oracle.com/en/java/javase/17/docs/api/index.html
	  	 
	  	# Java Collection Interface
	  	
	  	 - Collection은 자바에서 제공하는 자료구조 인터페이스이다.
	  	 - Collection끼리는 언제든지 다른 컬렉션으로 변환이 가능하다.
	  	 - Collection 인터페이스를 구현한 믈래스는 List , Set 등이 있다.
	  	 
	  	# Java.util.ArrayList 
	  	
	  	 - 배열과 유사하지만 크기가 자동으로 조절되는 자료구조를 구현한 클래스
	  	 - 배열처럼 데이터를 순차적으로 저장할 때 좋다.
	  	 - 모든 데이터를 순서대로 읽어야 할 때 가장 성능이 좋은 컬렉션이다.
	 */
	public static void main(String[] args) {
		
		/*
		  	# java.util.Arrays
		  
		  	 - 배열을 편하게 다룰 수 있는 기능들이 모여있는 클래스
		  	 - 컬렉션이 아니다.
		 */
						
		/*
		  	# 타입을 지정하며 ArrayList 생성하기	  
		 */
		
		ArrayList<String> fruits = new ArrayList<>(); 
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Character> cha = new ArrayList<>();
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		
		//add(item): 리스트의 맨 뒤에 원하는 데이터를 추가한다. 추가하는 데이터의 타입은 <>에 지정한다.
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
		
		// add(index, item): 원하는 위치에 데이터를 추가할 수 있다.
		try {
			fruits.add(3, "WaterMelon");
			fruits.add(0, "WaterMelon");
			fruits.add(-1, "WaterMelon");			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("이상한 인덱스에 넣었습니다.");
		} finally {
			System.out.println(fruits);
		}
		
		// get(index): 리스트에서 해당 인덱스의 데이터를 하나 반환한다.
		System.out.println(fruits.get(0));
		System.out.println(fruits.get(1));
		System.out.println(numbers.get(0));
		
		System.out.println("fruits의 크기: "+fruits.size());
		
		for (int i = 0, size = fruits.size(); i < size; ++i) {
			System.out.println(fruits.get(i));
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		// remove(index): 해당 번째의 데이터를 삭제한다. 방금 삭제한 데이터를 반환한다.
		for (int i = 0; i <5; ++i) {
			System.out.println("삭제된 데이터: "+fruits.remove(0));
		}
		System.out.println("삭제 후의 모습: " +fruits);
		
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add("Orange");
		
		//remove(item): 해당 데이터가 존재한다면 삭제한다. 삭제 성공 여부를 반환한다.
		for (int i = 0; i <7; ++i) {
			boolean result = fruits.remove("Orange");
			System.out.println("삭제 성공 여부: "+ result);
		}
	}
}

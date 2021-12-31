import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class D03_Collections {
	/*
	  	# java.util.Arrays
	  	
	  	 - 배열을 편하게 다룰 수 있는 기능들이 모여있는 클래스
	  	 
	  	# java.util.Collections
	  	
	  	 - 컬렉션을 편하게 다룰 수 있는 기능들이 모여있는 클래스
	  
	 */
	
	// Collections 클래스의 메서드들을 직접 찾아서 공부하고 정리해보세요.
	
	public static void main(String[] args) {
		
		// addAll() : 전달한 컬렉션에 한번에 여러개의 값을 추가할 때 사용한다.
		Collection<String> flavor = new HashSet<>();
		
		Collections.addAll(flavor, "peaches 'n Plutonium", "Rocky Racoon", "딸기맛");
		System.out.println(flavor);
		
		// fill(): 전달한 리스트를 원하는 값으로 채울 수 있다.
		ArrayList<String> address = new ArrayList<>();
		
		address.add("abc");
		address.add("abc");
		address.add("abc");
		address.add("abc");
		address.add("abc");
		address.add("abc");
		
		System.out.println(address);
		
		Collections.fill(address, "기본 배송지");
		
		System.out.println(address);
		
		// frequency(): 해당 컬렉션에 원하는 값이 몇개 들어있는지 알아내서 반환한다.
		
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
		System.out.println("사과의 개수: " + numofApple);
		
		ArrayList<String> sub_fruits = new ArrayList<>();
		
		sub_fruits.add("apple");
		sub_fruits.add("melon");
		
		// indexOfSubList(): 부분 집합을 앞에서부터 찾는다.
		// LastindexOfSubList(): 부분 집합을 뒤에서부터 찾는다.
		int index =  Collections.indexOfSubList(fruits, sub_fruits);
		int index2 =  Collections.lastIndexOfSubList(fruits, sub_fruits);
		
		System.out.println("앞에서부터 찾은 부분 집합의 위치: " + index);
		System.out.println("뒤에서부터 찾은 부분 집합의 위치: " + index2);
		
		// nCopies (): 전달한 값을 원하는 만큼 복사한 리스트를 만들어 반환한다.
		List<Integer> copies =Collections.nCopies(15, 12345);
		List<Apple> copies2 =Collections.nCopies(15, new Apple());
		
		
		System.out.println(copies);
		System.out.println(copies2);
		
		copies2.get(0).calorie = 321;
		System.out.println(copies2.get(7).calorie);
		
		
		//rotate(): 리스트를 원하는 만큼 순환시킨다. (-1은 왼쪽, +1은 오른쪽)		
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
		
		// sort(): 해당 리스트를 정렬해준다. (Set은 순서가 없어서 정렬이 불가능)
		Collections.sort(numbers);
		System.out.println(numbers);
		
		// swap() : 리스트에서 원하는 두 요소를 교체한다.
		Collections.swap(numbers, 3, 5);
		System.out.println(numbers);
	}
}
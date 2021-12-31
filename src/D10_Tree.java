import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {
	/*
	  	# TreeSet, TreeMap
	  	
	  	 - �����͸� �߰��� �� �߰��ϸ鼭 �ڱ� �ڸ��� ã�ư��� �ڷᱸ��
	  	 - �̸� ������ �Ǿ��ֱ� ������ �߰��� ������ �ʿ䰡 ����.
	  	 - �߰�/������ ��� ���ı��� �ؾ��ϱ� ������ Hash���ٴ� ������.
	  	 - ���ļ����� ����Ǿ� �ֱ� ������ Hash�� ���� Ŭ������ �ٸ��� �ε����� ����� �� �ִ�.	  
	 */
	
	public static void main(String[] args) {
		
//		TreeSet<Apple> apples = new TreeSet<>();
//		apples.add(new Apple());
//		
		TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2)*-1;
			}
		});
		numbers.add(5);
		numbers.add(10);
		numbers.add(1);
		numbers.add(100);
		numbers.add(17);		
		
		System.out.println(numbers);
		
		// * TreeSet�� Set �� �Ϻκ��� �����ϴµ��� Ưȭ�Ǿ��ִ�.
		
		// headSet(toElement): Set�� �� ó������ ������ �̸������� Set�� ��ȯ�Ѵ�.
		// tailSet(fromeElement): ������ ���� Set�� �� �������� Set�� ��ȯ�Ѵ�.
		System.out.println(numbers.headSet(30));
		System.out.println(numbers.tailSet(30));
		
		// subSet(from, to): ���� ���� ��ҵ�� �̷���� Set�� ��ȯ�Ѵ�.
		System.out.println(numbers.subSet(40,5));
		
		// ���� ���� ����� �ݴ� ������ Set�� ��ȯ�Ѵ�.
		System.out.println(numbers.descendingSet());
		
		// first(): ù��° ���� ��ȯ�Ѵ�.
		System.out.println(numbers.first());
		
		// last(): ������ ���� ��ȯ�ϴ�.
		System.out.println(numbers.last());
		
		// pollFirst(): ù ��° ���� �����ϸ鼭 ������.
		System.out.println(numbers.pollFirst());
		System.out.println(numbers);
		
		// pollLast(): akwlakr ���� �����ϸ鼭 ������.
		System.out.println(numbers.pollLast());
		System.out.println(numbers);
		
		// TreeMap�� TreeSetó�� Ű�� �������� �����ؼ� �ִ´�.(���� �������� �Ҽ��� ����.)
		TreeMap<String, Integer> tree_map= new TreeMap<>();
		
		tree_map.put("apple", 100);
		tree_map.put("cat", 88);
		tree_map.put("airplane", 20);
		tree_map.put("delay",9999);
		tree_map.put("atm", 1234);
		
		System.out.println(tree_map);
		//* TreeSet�� ���� ������ �޼������ �ִ�.
		System.out.println("-------------------------------");
		System.out.println(tree_map.headMap("c"));
		System.out.println(tree_map.tailMap("c"));
		System.out.println(tree_map.pollFirstEntry());
		System.out.println(tree_map.pollLastEntry());
		System.out.println(tree_map);
	}
	
}

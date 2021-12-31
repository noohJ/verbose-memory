import java.util.ArrayList;
import java.util.HashSet;

public class D02_HashSet {
	/*
	  	# Set
	  
	  	 - ������ �����س��� Ŭ����
	  	 - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�.
	  	 
	  	# Hash
	  	 
	  	 - ���� ���� ������ �׻� ������ ���� ������ �˰���
	  	 - ��������� ������ ���� ������ �� ����� �Ѵ�.
	  	 - �ߺ� üũ�ÿ� ���� �پ ������ ���δ�.
	  	 - Hash �˰������� ������ Ŭ�������� �ε��� �������� �ʴ´�.
	 */
	public static void main(String[] args) {
		
		HashSet<String> animals = new HashSet<>();
		
		//add : List�� Set��� �÷��� �������̽��� ������ ������ ����� �޼��带 ������ �ִ�.
		
		animals.add("cat");
		animals.add("dog");
		animals.add("snake");
		animals.add("frog");
		animals.add("pig");
		animals.add("black cow");
		animals.add("yellow cow");
		animals.add("cash cow");
		
		System.out.println(animals);
		
		// HashSet��  index�� ���� ������ forEach�� ����� �� �ִ�.
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		// HashSet�� index�� ���� ������ �����θ� ������ �� �ִ�.
		animals.remove("snake");
		System.out.println(animals);
		
		// HashSet�� �ߺ��Ǵ� ���� �߰��� �� ����.
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");
		animals.add("cat");
		
		System.out.println(animals);
		
		// �÷����� �ٸ� �÷��������� ��ȯ�� �����Ӵ�.
		ArrayList<String> animal_list = new ArrayList<>(animals);
		
		animal_list.add("cat");
		animal_list.add("cat");
		animal_list.add("cat");
		animal_list.add("cat");
		
		System.out.println(animal_list);
		System.out.println(new HashSet<>(animal_list));
	}
}

import java.util.ArrayList;

public class D05_Generic {
	/*
	  	# Generic
	  	
	  	 - Ŭ���� ���� �ڿ��� Ÿ���� �ܺο��� ���߿� ������ �� �ְ� ����� ����
	  	 - �����ڰ� �ν��Ͻ� ������ ���׸��� ������ �� �ִ�.
	  	 - ������ ������ ���� �ִ�.	  	 	  
	  	 - ���׸����� �⺻ Ÿ���� ����� �� ���� ������ Wrapper Ŭ������ ����ؾ� �Ѵ�.
	  	 
	  	# Static Generic
	  	
	  	 - ����ƽ �޼��忡 ���׸��� ����� ���� ���� Ÿ�� �տ� ���׸��� �߰����ش�.
	  	 - Ŭ������.<T>�޼����() ���� ����� �� �ִ�.
	 */
	public static void main(String[] args) {
		Box<Integer, String, Character>box = new Box<>();

	}
}

class Box<Type1, Type2, Type3> {
	ArrayList<Type1> slot1 = new ArrayList<>();
	ArrayList<Type2> slot2 = new ArrayList<>();
	ArrayList<Type3> slot3 = new ArrayList<>();

}

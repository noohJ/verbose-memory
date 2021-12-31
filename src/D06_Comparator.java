import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_Comparator {
	
	/*
	  	# Compare
	  	 - ���ϴ�
	  
	  	# Comparable
	  	 - �� �����ϴ�.
	  	 - �� �������̽��� ������ Ŭ������ ���� ũ�� �񱳰� ������ Ŭ������ �ȴ�.
	  	 
	 	# Comparator
	 	 - �� �������̽��� ������ Ŭ������ ���� �������� ����� �� �ִ�.
	 	 
	 */
	public static void main(String[] args) {
		Grape gp1 = new Grape(1, 5, 21, 1);
		Grape gp2 = new Grape(1, 3, 17, 2);
		Grape gp3 = new Grape(0, 3, 34, 0);
		Grape gp4 = new Grape(0, 1, 24, 1);
		Grape gp5 = new Grape(1, 2, 29, 0);
		
		System.out.println(gp1.compareTo(gp2));
		
		ArrayList<Apple> apples = new ArrayList<>();
		
		apples.add(new Apple());
		apples.add(new Apple());
		apples.add(new Apple());
		
//		Collections.sort();
		
		ArrayList<Grape> grapes = new ArrayList<>();
		
		grapes.add(gp1);
		grapes.add(gp2);
		grapes.add(gp3);
		grapes.add(gp4);
		grapes.add(gp5);
		
		// sysout�� ��� �ش� �ν��Ͻ��� toString()�� ȣ���Ͽ� �ֿܼ� ����ϴ� �޼����.
		System.out.println(grapes);
		
		Collections.sort(grapes);		
		System.out.println(grapes);
		
		Collections.reverse(grapes);
		System.out.println(grapes);
		
		Collections.sort(grapes, new �����з���_ũ��());
		System.out.println(grapes);
	}
}

class Grape implements Comparable{
	// �߻�޼��带 �������̵� ����� �Ѵ�.
	static String[] ORIGIN_NAMES = {"ĥ��", "������", "������"};
	static String[] COLOR_NAMES = {"��", "û"};
	
	final public static int RED = 0;
	final public static int Green = 1;
	
	int color;
	int size;
	int qty;
	int origin;
	
	public Grape(int color, int size, int qty, int origin) {
		this.color = color;
		this.size = size;
		this.qty = qty;
		this.origin = origin;
	}
	public String toString() {
		// �� Ŭ������ ���ڿ��� ��ȯ�Ѵٸ� � ������� �����ϴ� �޼���
		// toString()�� �⺻ ������ ���� �ν��Ͻ��� Ŭ���� �̸��� �ּҰ��� ���ڿ��� ��ȯ�ϴ� ���̴�.
		return String.format("[%s/%d/%d/%s]", COLOR_NAMES[color],size, qty, ORIGIN_NAMES[origin]);
	}
	@Override
	public int compareTo(Object o) {
		/*
		   	# �񱳸޼����� ��Ģ
		 
		   	 - ���� �ν��Ͻ��� �Ű������� ���޵� �ν��Ͻ����� ������ -1�� �����ؾ� �Ѵ� .(�Ǵ� ����)
		   	 - ���� �ν��Ͻ��� �Ű������� ���޵� �ν��Ͻ����� ũ�� 1�� �����ؾ� �Ѵ�.(�Ǵ� ���)
		   	 - �� �ν��Ͻ��� ���� ���� ���̶�� 0�� �����ؾ� �Ѵ�.
		   	 - �� �⺻ Ÿ���� compare �޼��带 ���� ���� ũ�� �񱳸� �� �� �ִ�.
		 */
//		if (this.qty < ((Grape) o).qty){
//			return -1;
//		} else if (this.qty > ((Grape) o).qty) {
//			return 1;
//		} else {
//			return 0;
//		}
		return Integer.compare(this.qty, ((Grape)o).qty);
	}
}

class �����з���_ũ�� implements Comparator<Grape> {

	@Override
	public int compare(Grape o1, Grape o2) {
		//ũ�Ⱑ ���� ���� ���� ������ ������ �ϱ�
		int compare1 = Integer.compare(o1.size, o2.size);
		
		if (compare1==0) {
			return Integer.compare(o1.color, o2.color);
		} else {
			return compare1;
		}		
	}
	
}

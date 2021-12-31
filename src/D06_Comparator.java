import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_Comparator {
	
	/*
	  	# Compare
	  	 - 비교하다
	  
	  	# Comparable
	  	 - 비교 가능하다.
	  	 - 이 인터페이스를 구현한 클래스는 서로 크기 비교가 가능한 클래스가 된다.
	  	 
	 	# Comparator
	 	 - 이 인터페이스를 구현한 클래스는 비교의 기준으로 사용할 수 있다.
	 	 
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
		
		// sysout은 사실 해당 인스턴스의 toString()을 호출하여 콘솔에 출력하는 메서드다.
		System.out.println(grapes);
		
		Collections.sort(grapes);		
		System.out.println(grapes);
		
		Collections.reverse(grapes);
		System.out.println(grapes);
		
		Collections.sort(grapes, new 포도분류기_크기());
		System.out.println(grapes);
	}
}

class Grape implements Comparable{
	// 추상메서드를 오버라이드 해줘야 한다.
	static String[] ORIGIN_NAMES = {"칠레", "스페인", "프랑스"};
	static String[] COLOR_NAMES = {"적", "청"};
	
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
		// 이 클래스를 문자열로 변환한다면 어떤 모양일지 정의하는 메서드
		// toString()의 기본 동작은 현재 인스턴스의 클래스 이름과 주소값을 문자열로 반환하는 것이다.
		return String.format("[%s/%d/%d/%s]", COLOR_NAMES[color],size, qty, ORIGIN_NAMES[origin]);
	}
	@Override
	public int compareTo(Object o) {
		/*
		   	# 비교메서드의 규칙
		 
		   	 - 현재 인스턴스가 매개변수로 전달된 인스턴스보다 작으면 -1을 리턴해야 한다 .(또는 음수)
		   	 - 현재 인스턴스가 매개변수로 전달된 인스턴스보다 크면 1을 리턴해야 한다.(또는 양수)
		   	 - 두 인스턴스가 서로 같은 값이라면 0을 리턴해야 한다.
		   	 - 각 기본 타입의 compare 메서드를 통해 쉽게 크기 비교를 할 수 있다.
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

class 포도분류기_크기 implements Comparator<Grape> {

	@Override
	public int compare(Grape o1, Grape o2) {
		//크기가 같을 때는 색상 순서로 나오게 하기
		int compare1 = Integer.compare(o1.size, o2.size);
		
		if (compare1==0) {
			return Integer.compare(o1.color, o2.color);
		} else {
			return compare1;
		}		
	}
	
}

package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_Compare {

	public static void main(String[] args) {
		Grape gp1 = new Grape(1, 5, 21, 1);
		Grape gp2 = new Grape(1, 3, 17, 2);
		Grape gp3 = new Grape(0, 3, 34, 0);
		Grape gp4 = new Grape(0, 1, 24, 1);
		Grape gp5 = new Grape(1, 2, 29, 0);
		
//		ArrayList<Grape> grapes = new ArrayList<>();
//		grapes.add(gp1);
//		grapes.add(gp2);
//		grapes.add(gp3);
//		grapes.add(gp4);
//		grapes.add(gp5);
		
//		Collections.sort(grapes);
//		System.out.println(grapes);
		System.out.println(gp1);
	}
}

class Grape implements Comparable{
	static String[] ORIGIN_NAMES = {"Ä¥·¹", "½ºÆäÀÎ", "ÇÁ¶û½º"};
	static String[] COLOR_NAMES = {"Àû", "Ã»"};
	
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
	public int compareTo(Object o) {
		return Integer.compare(this.qty, ((Grape)o).qty)*-1;
	}
	public String toString() {
		return String.format("|%s/%d/%d/%s|",COLOR_NAMES[color],size, qty, ORIGIN_NAMES[origin]);
	}
	
}

//class origin implements Comparable<Grape>{
//	public int compare(Grape o1, Grape o2) {
//		int compare1 = Integer.compare(o1.qty, o2.qty);
//		
//		if (compare1 == 0) {
//			return String.compare(o1.ORIGIN_NAMES[origin], o2.ORIGIN_NAMES[origin]);
//		}
//	}	
//}

class GrapeComparatorQtyDesc implements Comparator<Grape>{
	public int compare(Grape o1, Grape o2) {
		int compare1 = Integer.compare(o1.qty, o2.qty)*-1;
		
		if (compare1 == 0) {
			return o1.ORIGIN_NAMES[o1.origin].compareTo(o2.ORIGIN_NAMES[o2.origin]);
		} else {
			return compare1;
		}
	}
}

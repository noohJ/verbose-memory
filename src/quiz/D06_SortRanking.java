package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_SortRanking {
	/*
	  	���� ������� ����� ������ �� �ִ� ������ Ŭ������ �ϳ� �����ϰ�
	  	 �ش� ����� Ŭ���� Ÿ�Ӽ�/���������� ����غ�����.	  
	 */
	
	public static void main(String[] args) {
		Record rc1 = new Record("����1", 14201, "08:41:27", 1 , 17 );
		Record rc2 = new Record("����2", 14571, "07:14:21", 0 , 16 );
		Record rc3 = new Record("����3", 12411, "08:46:48", 0 , 21 );
		Record rc4 = new Record("����4", 14241, "08:33:11", 1 , 14 );
		Record rc5 = new Record("����5", 14421, "06:48:33", 0 , 19 );
		Record rc6 = new Record("����6", 11042, "08:12:28", 1 , 20 );
		Record rc7 = new Record("����7", 17420, "08:45:44", 0 , 21 );
		Record rc8 = new Record("����8", 11159, "08:44:12", 0 , 21 );
		
		ArrayList<Record> records = new ArrayList<>();
		
		records.add(rc1);
		records.add(rc2);
		records.add(rc3);
		records.add(rc4);
		records.add(rc5);
		records.add(rc6);
		records.add(rc7);
		records.add(rc8);
		
		Collections.sort(records);
		System.out.println("\t    ������ ");
		for (int i = 0; i <records.size();++i) {
			System.out.println(records.get(i));
		}
		System.out.println("");
		Collections.sort(records, new Timerank());
		System.out.println("            �ð��� ");
		for (int i = 0; i <records.size();++i) {
			System.out.println(records.get(i));
			
		}
	}
}

class Record implements Comparable{
	static String[] gen = {"����", "����"};
	final public static int woman = 0;
	final public static int man = 1;
	
	String id;
	int score;
	String time;
	int gender;
	int age;
	
	public Record(String id, int score, String time, int gender, int age) {
		this.id = id;
		this.score = score;
		this.time = time;
		this.gender = gender;
		this.age = age;
	}
	public String toString() {
		return String.format("|%s/%d/%s/%s/%d|", id,score,time,gen[gender],age);
	}
	@Override
	public int compareTo(Object o) {
		return Integer.compare(this.score, ((Record)o).score);
	}
}
class Timerank implements Comparator <Record>{
	@Override
	public int compare(Record o1, Record o2) {

		return o1.time.compareTo(o2.time);
	}
}
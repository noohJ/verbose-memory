import java.util.Scanner;

public class B11_Array {
	
	/* 
	   	# �迭 (Array)
	   	
	   	 - ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
	  	 - ���� �̸����� ������ ������ ������ �ڿ� �ε����� �����Ѵ�.
	  	 - �迭�� �� ��ȣ(�ε���)�� 0���� ��ü ���� -1�� ���� �ִ�.
	  	 - �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����.
	  	 - �迭�� ������ ���ÿ� ��� ���� �ʱ�ȭ �Ǿ� �ִ�.
	  	   (����: 0. �Ǽ�: 0.0, booldean: false, ������: null
	 */
	public static void main(String[] args) {
		
		Scanner[] sc = new Scanner[5];
		
		sc[0] = new Scanner(System.in);
		sc[1] = new Scanner(System.in);
		sc[2] = new Scanner(System.in);
		sc[3] = new Scanner(System.in);
		sc[4] = new Scanner(System.in);
		
		
		String[] msg = new String[3];
		
		msg[0] = "hello";
		msg[1] = "bye";
		
		int[] stu = new int[5];
		int[] stu = new int[6];
		
		stu[0] = 1;
		stu[1] = 23;
		stu[2] = 99;
		stu[3] = 43;
		stu[4] = 50;
		
		System.out.println("3��° �л��� ����: " + stu[3]);
		
		/*
		    # �迭 ���� ���
		    
		  	 1. Ÿ��[] ���� = new Ÿ��[ũ��];
		  	 2. Ÿ��[] ���� = { ��1, ��2, ��3, ...}; 
		  	 3. Ÿ��[] ���� =  new Ÿ��[]{��1, ��2, ...}; 
		 */
		
		short[] numbers = new short[10];
		char[] GRADES = {'A', 'B', 'C', 'D', 'F'};
		String[] names = new String[] {"��ö��", "��ö��", "��ö��", "��ö��"};
		String[] names2 =names;
		
		// System.out.println()���� �迭�� �׳� ����غ��� �ش� �迭�� �ּҰ��� ���´�.
		// ���������� char[]�� ���ڿ� ó�� ��µȴ�.
		
		System.out.println(numbers);
		System.out.println(GRADES);
		System.out.println(names);
		
		// �迭.length�� ���� �ش� �迭�� ���̸� �� �� �ִ�.
		System.out.println(numbers.length);
		System.out.println(GRADES.length);
		System.out.println(names.length);
		System.out.println("ABCDEF".length());
		
		// �迭�� �ݺ������� ���� ����� �� �ְԲ� ����Ǿ� �ִ�.
		for (int i = 0; i < names.length; ++i) {
			System.out.printf("names[%d] : %s\n", i, names[i] );
		}
		// String Ÿ���� char[]�� ��ȯ�Ͽ� ����� �� �ִ�.
		String helloo = "Hello, world!";
		char[] message = helloo. toCharArray();
		numbers[9]=10;
		numbers[10]=10;
		System.out.println(numbers[9]);
	}
}

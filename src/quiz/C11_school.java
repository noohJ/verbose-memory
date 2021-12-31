package quiz;

import java.util.Scanner;

public class C11_school {

	/*
	  	1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �����, �ڷᱸ�� ������ �ִ�.
	  	
	  	2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�.
	  	
	  	3. �ӽŷ��� �� �л����� ������ ����, ����, ����, �����, �ӽŷ��� ������ �ִ�.
	  	
	  	4. �� ���� ������ 25 ~ 35���̴�.
	  	
	  	5. ��� �л��� ��ȸ� ������ �̸��� �������� �����Ѵ�.
	  	   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�. (�Ǵ� �ߺ����� ������ ����)
	  	   
	  	6. �� �л��� ����ǥ �޼��带 ���� "�̸�/�й�/�� ���� ����/����/�������"�� �� �� �־�� �Ѵ�.
	  
	 */
	//���� �ѱ� �̸�
	
	
	
	public static void main(String[] args) {
		boolean school_score = true;
		Scanner sc = new Scanner(System.in);

		int pst = (int)(Math.random()*11+25);
		String[][] Programming_students = new String[pst][];
		
		for (int index = 0 ; index < Programming_students.length;++index) {
			Programming_students[index] = Programming.Pro();
		}
		
		int nst = (int)(Math.random()*11+25);
		String[][] network_students = new String[nst][];
		
		for (int index = 0 ; index < network_students.length;++index) {
			network_students[index] = Network.Net();
		}
		
		int mst = (int)(Math.random()*11+25);
		String[][] Machine_learning_students = new String[mst][];
		
		for (int index = 0 ; index < Machine_learning_students.length;++index) {
			Machine_learning_students[index] = Machine_learning.Ml();
		}
		

		while(school_score) {
			System.out.println("��� �� �л��� ������ ���ðڽ��ϱ�>\n(1. ���α׷��� �� 2. ��Ʈ��ũ �� 3. �ӽŷ��� ��)");
			int subnum = sc.nextInt();
			if (subnum == 1) {
				System.out.println("------------------------------------------------------------------------------");
				String[] all = new String[]{"�̸�","�й�","����","����","����","PL","�ü��","�ڷᱸ��","����","�������"};
				for (int i = 0; i < 10; ++i) {
					System.out.printf("%s\t",all[i]);				
				}
				System.out.println();
				System.out.println("------------------------------------------------------------------------------");
				for (int i = 0 ; i < pst;++i) {
					for (int j = 0; j<10;++j) {
						System.out.printf("%s\t",Programming_students[i][j]);
					}
					System.out.println();
				}
			} else if (subnum == 2) {
				System.out.println("----------------------------------------------------------------------");
				String[] all = new String[]{"�̸�","�й�","����","����","������","��Ʈ��ũ","CCNA","����","�������"};
				for (int i = 0; i < 9; ++i) {
					System.out.printf("%s\t",all[i]);				
				}
				System.out.println();
				System.out.println("----------------------------------------------------------------------");
				for (int i = 0 ; i < nst;++i) {
					for (int j = 0; j<9;++j) {
						System.out.printf("%s\t",network_students[i][j]);
					}
					System.out.println();
				}
			} else if (subnum ==3) {
				System.out.println("----------------------------------------------------------------------");
				String[] all = new String[]{"�̸�","�й�","����","����","����","�����","�ӽŷ���","����","�������"};
				for (int i = 0; i < 9; ++i) {
					System.out.printf("%s\t",all[i]);				
				}
				System.out.println();
				System.out.println("----------------------------------------------------------------------");
				for (int i = 0 ; i < pst;++i) {
					for (int j = 0; j < 9;++j) {
						System.out.printf("%s\t",Machine_learning_students[i][j]);
					}
					System.out.println();
				}
			}
			System.out.println("");
			System.out.println("�ٸ� ���� ������ ���ðڽ��ϱ�? (1. �� 2.�ƴϿ�)");
			int chk = sc.nextInt();
			if(chk == 2) {
				System.out.println("�ý����� ���� �մϴ�.");
				school_score = false;
			}
		}		
	}
}
abstract class Subject{
	String [] sub = new String[]{};
	
	static int studentId = 1001;
	protected static String RandomName() {
		String name ="";
		String[] last_name = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","Ȳ","��","��","��","��"};
		String[] first_name = new String[] {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "â", "ä", "õ", "ö", "��", "��", "��", "ġ", "Ž", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "ȣ", "ȫ", "ȭ", "ȯ", "ȸ", "ȿ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ȥ", "Ȳ", "��", "��", "��", "��",
		        "��", "��", "��", "Ź", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "��", "��", "Ÿ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		        "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};
		int random_last = (int)(Math.random()*last_name.length);
		int frandom_first = (int)(Math.random()*first_name.length);
		int srandom_first = (int)(Math.random()*first_name.length);
		return name =last_name[random_last]+first_name[frandom_first]+first_name[srandom_first];
	}
	
}
class Programming extends Subject{
	public static String[] Pro() {
		int total = 0;
		String[] sub = new String[10];
		sub[0] = RandomName();
		sub[1] = Integer.toString(studentId);
		++studentId;
		for (int index = 2;index < 8 ;++index) {
			int random_score= (int)(Math.random()*101);
			sub[index]=Integer.toString(random_score)+"��";
			total += random_score;
		}
		sub[8] = Integer.toString(total)+"��";
		sub[9] = Integer.toString(total/6)+"��";
		return sub;
	}
}
class Network extends Subject{
	public static String[] Net() {
		int total = 0;
		String[] sub = new String[9];
		sub[0] = RandomName();
		sub[1] = Integer.toString(studentId);
		++studentId;
		for (int index = 2;index < 7 ;++index) {
			int random_score= (int)(Math.random()*101);
			sub[index]=Integer.toString(random_score)+"��";
			total += random_score;
		}
		sub[7] = Integer.toString(total)+"��";
		sub[8] = Integer.toString(total/5)+"��";
		return sub;
	}
}
class Machine_learning extends Subject{
	public static String[] Ml() {
		int total = 0;
		String[] sub = new String[9];
		sub[0] = RandomName();
		sub[1] = Integer.toString(studentId);
		++studentId;
		for (int index = 2;index < 7 ;++index) {
			int random_score= (int)(Math.random()*101);
			sub[index]=Integer.toString(random_score)+"��";
			total += random_score;
		}
		sub[7] = Integer.toString(total)+"��";
		sub[8] = Integer.toString(total/5)+"��";
		return sub;
	}
}

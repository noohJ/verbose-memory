package quiz;

import java.util.Scanner;

public class B06_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String world, reverse_world;
		reverse_world="";
				
		System.out.print("�ܾ �Է��ϼ��� > ");
		world = sc.next();
		int len = world.length();

		for (int i = 1 ;i <= len;++i ) {
			reverse_world += world.charAt(len-i);
		}
		if (world.equals(reverse_world)) {
			System.out.print("PALINDROME");
		}else {
			System.out.print("NOT PALINDROME");
		}
	}	
}
/*   
 *   # ���׿�����
 *   - ������ if, else�� ����ؼ� ����� �� �ִ� ������
 *   - ���� ? �� : �ƴϿ�
 *   String result \ error >0 ? "����ġ" : "��ġ"
 * 
 */

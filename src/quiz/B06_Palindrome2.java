package quiz;

import java.util.Scanner;

public class B06_Palindrome2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�¿��Ī > ");
		String word = sc.next();
		
		String reversed = "";
		
		for (int i = 0, len = word.length(); i < len; ++i) {
			reversed += word.charAt(len - 1 - i);
		}
		
		String result = word.equals(reversed) ? "��Ī" : "���Ī";
		System.out.println("�˻� ���: " + result);
	}
}

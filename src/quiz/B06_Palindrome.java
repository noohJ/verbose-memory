package quiz;

import java.util.Scanner;

public class B06_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String world, reverse_world;
		reverse_world="";
				
		System.out.print("단어를 입렵하세요 > ");
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
 *   # 삼항연산자
 *   - 간단한 if, else를 축약해서 사용할 수 있는 연산자
 *   - 저건 ? 예 : 아니요
 *   String result \ error >0 ? "불일치" : "일치"
 * 
 */

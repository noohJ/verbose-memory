package quiz;

import java.util.Scanner;

public class B09_31Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int player, insert_no, total, user;
		total = 0;
		
		System.out.print("������ �÷��̾��� ���� �Է��ϼ���. : ");
		player = sc.nextInt();
		
		while (total < 31) {
			user = 1;		
			while (user <= player) {
				System.out.printf("player%d > ",user );
				insert_no = sc.nextInt();
				
				if (insert_no <=3 && !(insert_no <= 0)) {
					total += insert_no;	
					System.out.printf("���� ���� %d �Դϴ�. \n", total);
				} else {
					System.out.print("���ڸ� �߸� ���� �Ͽ����ϴ�. (1~3) \n");
				}
			if(total >= 31) {
				System.out.printf("player%d �й�",user);	
				break;
			}
			++user;
			}
		}
		
	}
}

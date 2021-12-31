package quiz;

import java.util.Scanner;

public class B09_31Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int player, insert_no, total, user;
		total = 0;
		
		System.out.print("진행할 플레이어의 수를 입력하세요. : ");
		player = sc.nextInt();
		
		while (total < 31) {
			user = 1;		
			while (user <= player) {
				System.out.printf("player%d > ",user );
				insert_no = sc.nextInt();
				
				if (insert_no <=3 && !(insert_no <= 0)) {
					total += insert_no;	
					System.out.printf("현재 수는 %d 입니다. \n", total);
				} else {
					System.out.print("숫자를 잘못 기입 하였습니다. (1~3) \n");
				}
			if(total >= 31) {
				System.out.printf("player%d 패배",user);	
				break;
			}
			++user;
			}
		}
		
	}
}

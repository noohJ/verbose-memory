package quiz.pirate;

import java.util.Arrays;
import java.util.Scanner;
 

public class PiratGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many players? ");
		int pNum = sc.nextInt();
		
		Player[] players= new Player[pNum];
		
		for (int i = 0; i < players.length; ++i) {
			players[i] = new Player("�÷��̾�" + (i+1));
			players[i].info();
		}
		
		while (true) {
			Barrel barrel = new Barrel();
			System.out.println("[System] �� ���� �����Ǿ����ϴ�.");
			
			int turn = 0;
			
			while(true) {
				barrel.print();
				System.out.print(players[turn % pNum].getLabel());
				
				int result = barrel.stab(sc.nextInt());
				
				if (result == 1) {
					for (int i = 0; i < players.length; ++i) {
						if (turn % pNum ==i) {
							players[i].fail();
						} else {
							players[i].win();
						}
					}
					// ���������� ��� �÷��̾��� ���� ���
					
					
					break;
				} else if (result ==0 ) {
					players[turn % pNum].success();
				} else if (result == -1) {
					turn--;
				}
				
				turn++;
			}
			boolean nextgame = true;
			while (nextgame) {
				System.out.print("1. ����ϱ� 2. �������� \n>> ");
				switch (sc.nextInt()) {
				case 1 :
					nextgame = false;
					break;
				case 2 :
					for (int i = 0; i < players.length; ++i) {
						players[i].info();
					}
					break;
				default:
					break;
				}				
			}
		}
		
		
	}
}

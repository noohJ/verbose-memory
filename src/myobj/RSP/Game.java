package myobj.RSP;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);
	String id;
	int win,dra,lose,score;
	public Game(String id, int win, int draw, int lose, int score) {
		int winningStreak = 0;
		while(true) {
			
			int ran = (int)(Math.random()*3);
			Crsp csrp = new Crsp(ran);
			System.out.println("���� ���� �� > ");
			String srp = sc.next();
			
			if((srp.equals("����")&&ran == 0)||(srp.equals("����")&&ran == 1)||(srp.equals("��")&&ran == 2)) {
				System.out.println("�����ϴ�.");
				winningStreak = 0;
				++draw;
				score += 50;
			}else if((srp.equals("����")&&ran == 1)||(srp.equals("����")&&ran == 2)||(srp.equals("��")&&ran == 0)) {
				System.out.printf("�� : %s \n��� : %s\n",srp,csrp);
				System.out.println("�й� �Ͽ����ϴ�.");
				++lose;
				System.out.printf("Win %d Draw %d Loss %d Score %d\n",win,draw,lose,score);
				break;
			}else if((srp.equals("����")&&ran == 2)||(srp.equals("����")&&ran == 0)||(srp.equals("��")&&ran == 1)) {
				System.out.printf("�� : %s \n��� : %s\n",srp,csrp);
				System.out.println("�¸� �Ͽ����ϴ�.");
				if (winningStreak == 0) {
					++win;
					winningStreak = 1;
					score +=100;
				}else {
					++win;
					++winningStreak;
					score = score+100*winningStreak;
					System.out.printf("%d ������\n",winningStreak);
				}
			}else {
				System.out.println("�߸� ���� �Ͽ����ϴ�.\n ex)���� ���� ��");
			}
		}
		while(true) {
			System.out.println("���� ��� / ���� Ȯ��\n(1/2)");
			int chk = sc.nextInt();
			if(chk == 1) {
				new Save(id, win, draw, lose, score);

			}else if(chk == 2) {
				new Ranking();
				break;
			}
		}
	}
}

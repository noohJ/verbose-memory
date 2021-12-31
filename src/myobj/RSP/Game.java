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
			System.out.println("가위 바위 보 > ");
			String srp = sc.next();
			
			if((srp.equals("가위")&&ran == 0)||(srp.equals("바위")&&ran == 1)||(srp.equals("보")&&ran == 2)) {
				System.out.println("비겼습니다.");
				winningStreak = 0;
				++draw;
				score += 50;
			}else if((srp.equals("가위")&&ran == 1)||(srp.equals("바위")&&ran == 2)||(srp.equals("보")&&ran == 0)) {
				System.out.printf("나 : %s \n상대 : %s\n",srp,csrp);
				System.out.println("패배 하였습니다.");
				++lose;
				System.out.printf("Win %d Draw %d Loss %d Score %d\n",win,draw,lose,score);
				break;
			}else if((srp.equals("가위")&&ran == 2)||(srp.equals("바위")&&ran == 0)||(srp.equals("보")&&ran == 1)) {
				System.out.printf("나 : %s \n상대 : %s\n",srp,csrp);
				System.out.println("승리 하였습니다.");
				if (winningStreak == 0) {
					++win;
					winningStreak = 1;
					score +=100;
				}else {
					++win;
					++winningStreak;
					score = score+100*winningStreak;
					System.out.printf("%d 연승중\n",winningStreak);
				}
			}else {
				System.out.println("잘못 기입 하였습니다.\n ex)가위 바위 보");
			}
		}
		while(true) {
			System.out.println("전적 등록 / 전적 확인\n(1/2)");
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

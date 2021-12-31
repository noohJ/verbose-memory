package myobj.RSP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NewGame {
	Scanner sc = new Scanner(System.in);
	FileInputStream in = null;
	
	int win,draw,lose,score,winningStreak;
	String player;
	
	public NewGame() {
		while(true) {
			
			win = 0;
			draw = 0;
			lose = 0;
			score = 0;
			winningStreak = 0;
			System.out.println("�÷��̾� �̸� ���ϱ� >");
			player = sc.next();
			try {
				in = new FileInputStream("Record/record.txt");
			} catch (FileNotFoundException e) {
				System.out.println("������ ��ϵ� ������ ã�µ� ���� �Ͽ����ϴ�.");
				e.printStackTrace();
			}
			try {
				String allData = new String(in.readAllBytes());
				
				if(!allData.contains(player)) {
					new Game(player, win, draw, lose, score);	
					in.close();
					break;
				}else {
					System.out.println("�̹� ��ϵ� ���̵� �Դϴ�. ");
					in.close();
				}
				
			} catch (IOException e) {
				System.out.println("����� �дµ� ���� �Ͽ����ϴ�.");
				e.printStackTrace();
			}
								
		}		
	}			
}

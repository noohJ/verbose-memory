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
			System.out.println("플레이어 이름 정하기 >");
			player = sc.next();
			try {
				in = new FileInputStream("Record/record.txt");
			} catch (FileNotFoundException e) {
				System.out.println("정보가 등록된 파일을 찾는데 실패 하였습니다.");
				e.printStackTrace();
			}
			try {
				String allData = new String(in.readAllBytes());
				
				if(!allData.contains(player)) {
					new Game(player, win, draw, lose, score);	
					in.close();
					break;
				}else {
					System.out.println("이미 등록된 아이디 입니다. ");
					in.close();
				}
				
			} catch (IOException e) {
				System.out.println("기록을 읽는데 실패 하였습니다.");
				e.printStackTrace();
			}
								
		}		
	}			
}

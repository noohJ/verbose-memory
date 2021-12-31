package myobj.RSP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Save {
	File record = new File("Record/record.txt");
	FileOutputStream out = null;
	FileInputStream in = null;
	int win, draw, lose, score;
	String player;
	public Save(String player,int win, int draw, int lose, int score) {
		this.player = player;
		this.win = win;
		this.draw = draw;
		this.lose = lose;
		this.score = score;
		try {
			in = new FileInputStream("Record/record.txt");
		} catch (FileNotFoundException e1) {
			System.out.println("정보가 등록된 파일을 찾는데 실패 하였습니다.");
			e1.printStackTrace();
		}
		try {
			String allData = new String(in.readAllBytes());
			if (!allData.contains(player)) {
				try {
					out = new FileOutputStream("Record/record.txt",true);
					out.write((player+" 전적").getBytes());
					out.write(("\nW/D/L/Score : "+win+"/"+draw+"/"+lose+"/"+score+"점\n").getBytes());
					
					out.close();
				} catch (FileNotFoundException e) {
					System.out.println("파일이 없습니다.");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("전적 기록 실패");
					e.printStackTrace();
				}
				System.out.println("전적 기록 완료");
			}else {
				try {
					out = new FileOutputStream("Record/record.txt",true);
					out.write((player+" 전적").getBytes());
					out.write(("\nW/D/L/Score : "+win+"/"+draw+"/"+lose+"/"+score+"점\n").getBytes());
					
					out.close();
				} catch (FileNotFoundException e) {
					System.out.println("파일이 없습니다.");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("전적 기록 실패");
					e.printStackTrace();
				}
				System.out.println("전적 기록 완료");
			}
		} catch (IOException e1) {
			System.out.println("기록을 읽는데 실패 하였습니다.");
			e1.printStackTrace();
		}
		
	}
}

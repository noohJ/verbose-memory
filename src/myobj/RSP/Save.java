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
			System.out.println("������ ��ϵ� ������ ã�µ� ���� �Ͽ����ϴ�.");
			e1.printStackTrace();
		}
		try {
			String allData = new String(in.readAllBytes());
			if (!allData.contains(player)) {
				try {
					out = new FileOutputStream("Record/record.txt",true);
					out.write((player+" ����").getBytes());
					out.write(("\nW/D/L/Score : "+win+"/"+draw+"/"+lose+"/"+score+"��\n").getBytes());
					
					out.close();
				} catch (FileNotFoundException e) {
					System.out.println("������ �����ϴ�.");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("���� ��� ����");
					e.printStackTrace();
				}
				System.out.println("���� ��� �Ϸ�");
			}else {
				try {
					out = new FileOutputStream("Record/record.txt",true);
					out.write((player+" ����").getBytes());
					out.write(("\nW/D/L/Score : "+win+"/"+draw+"/"+lose+"/"+score+"��\n").getBytes());
					
					out.close();
				} catch (FileNotFoundException e) {
					System.out.println("������ �����ϴ�.");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("���� ��� ����");
					e.printStackTrace();
				}
				System.out.println("���� ��� �Ϸ�");
			}
		} catch (IOException e1) {
			System.out.println("����� �дµ� ���� �Ͽ����ϴ�.");
			e1.printStackTrace();
		}
		
	}
}

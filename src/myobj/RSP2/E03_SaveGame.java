package myobj.RSP2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E03_SaveGame {
	private final static Map<String, HandShape> HANDSHAPES = new HashMap<>();
	private final static HandShape[] COM_HANDSHAPES = {
			HandShape.SCISSORS,HandShape.ROCK, HandShape.PAPER};
	
	static {
		HANDSHAPES.put("����", HandShape.SCISSORS);
		HANDSHAPES.put("����", HandShape.ROCK);
		HANDSHAPES.put("��", HandShape.PAPER);
	}
	
	public static int play(){
		HandShape player;
		while(true) {
			System.out.print("����, ����, �� > ");
			String hand = new Scanner(System.in).nextLine();
			
			// String.trim() : �ش� ���ڿ� �ٱ����� ���� ����
			if (HANDSHAPES.containsKey(hand.trim())) {
				player = HANDSHAPES.get(hand);
				break;
			}
			System.out.println("�ٽ� ����� �Է����ּ���!");
		}
		HandShape com = COM_HANDSHAPES[(int)(Math.random()*3)];
		
		System.out.printf("�÷��̾�: %s VS ��: %s\n",player.getName(),com.getName());
		
		if((player.getValue()+1) % 3 == com.getValue()) {
			// ��ǻ�Ͱ� �̱�
			System.out.println("��ǻ�� �¸�!");
			return 2;
		}else if ((com.getValue() + 1) %3 == player.getValue()) {
			// �÷��̾ �̱�
			System.out.println("�÷��̾� �¸�!");
			return 0;
		}else {
			// ���
			System.out.println("���º�!");
			return 1;			
		}
		
	}
	public static void save(int[] record) {
		File saveFolder = new File("practice");
		File saveFile = new File("practice/rsp.txt");
		
		if(!saveFolder.exists()) {
			saveFolder.mkdir();
		}
		// AutoCloseable �������̽��� ������ Ŭ�������� try()�� ������ �� �ִ�.
		try (FileOutputStream out = new FileOutputStream(saveFile);
		){
			out.write(String.format("%d/%d/%d", record[0],record[1],record[2]).getBytes());
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] record = new int[3];
		
		while (true) {
			System.out.println("�� ������ ���۵Ǿ����ϴ�!");
			
			switch(play()) {
			case 0:
				record[0]++;
				break;
			case 1:
				record[1]++;
				break;
			case 2:	
				record[2]++;
				break;
			}
			
			System.out.printf("��� ����: %d�� %d�� %d��\n", record[0], record[1], record[2]);
			
			System.out.println("�� �Ͻðڽ��ϱ�? [N:0/Y:1] ");
			int select = sc.nextInt();
			if(select == 0) {
				System.out.println("�������Դϴ�...");
				break;
			}
		}
		
		save(record);
		System.out.println("������ �Ϸ�Ǿ����ϴ�. ������ �����մϴ�.");
	}
}

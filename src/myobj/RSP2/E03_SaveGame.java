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
		HANDSHAPES.put("가위", HandShape.SCISSORS);
		HANDSHAPES.put("바위", HandShape.ROCK);
		HANDSHAPES.put("보", HandShape.PAPER);
	}
	
	public static int play(){
		HandShape player;
		while(true) {
			System.out.print("가위, 바위, 보 > ");
			String hand = new Scanner(System.in).nextLine();
			
			// String.trim() : 해당 문자열 바깥쪽의 공백 제거
			if (HANDSHAPES.containsKey(hand.trim())) {
				player = HANDSHAPES.get(hand);
				break;
			}
			System.out.println("다시 제대로 입력해주세요!");
		}
		HandShape com = COM_HANDSHAPES[(int)(Math.random()*3)];
		
		System.out.printf("플레이어: %s VS 컴: %s\n",player.getName(),com.getName());
		
		if((player.getValue()+1) % 3 == com.getValue()) {
			// 컴퓨터가 이김
			System.out.println("컴퓨터 승리!");
			return 2;
		}else if ((com.getValue() + 1) %3 == player.getValue()) {
			// 플레이어가 이김
			System.out.println("플레이어 승리!");
			return 0;
		}else {
			// 비김
			System.out.println("무승부!");
			return 1;			
		}
		
	}
	public static void save(int[] record) {
		File saveFolder = new File("practice");
		File saveFile = new File("practice/rsp.txt");
		
		if(!saveFolder.exists()) {
			saveFolder.mkdir();
		}
		// AutoCloseable 인터페이스가 구현된 클래스들은 try()에 선언할 수 있다.
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
			System.out.println("새 게임이 시작되었습니다!");
			
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
			
			System.out.printf("통산 전적: %d승 %d무 %d패\n", record[0], record[1], record[2]);
			
			System.out.println("더 하시겠습니까? [N:0/Y:1] ");
			int select = sc.nextInt();
			if(select == 0) {
				System.out.println("저장중입니다...");
				break;
			}
		}
		
		save(record);
		System.out.println("저장이 완료되었습니다. 게임을 종료합니다.");
	}
}

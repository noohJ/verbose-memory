package myobj.RSP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Load {
	Scanner sc = new Scanner(System.in);
	FileInputStream in = null;
	String player;
	int win, draw, lose, score;
	int start, end;
	public Load() {
		try {
			in = new FileInputStream("Record/record.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("정보가 등록된 파일을 찾는데 실패 하였습니다.");
			e.printStackTrace();
		}
		System.out.println("불러올 아이디를 입력 하세요.>");
		player = sc.next();
		try {
			String allData = new String(in.readAllBytes());
			String Scg = "";
			
			start = allData.lastIndexOf(player);
			end = allData.indexOf("점",start);

			Pattern pattern = Pattern.compile("\\d+[/]\\d+[/]\\d+[/]\\d+");
			Matcher matcher=pattern.matcher(allData.substring(start, end));
			while (matcher.find()) {
				Scg = Scg+matcher.group();				
			}
			String[] fScg = Scg.split("/");
			System.out.println(allData.substring(start, end));
			new Game(player,Integer.parseInt(fScg[0]),Integer.parseInt(fScg[1]),Integer.parseInt(fScg[2]),Integer.parseInt(fScg[3]));
			
			in.close();
			
		} catch (IOException e) {
			System.out.println("기록을 읽는데 실패 하였습니다.");
			e.printStackTrace();
		}
	}
}

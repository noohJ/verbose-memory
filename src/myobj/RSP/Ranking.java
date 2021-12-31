package myobj.RSP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ranking {
	FileInputStream in = null;
	public Ranking() {
		try {
			in = new FileInputStream("Record/record.txt");
			String myrecord = new String(in.readAllBytes());
			System.out.println(myrecord);
			
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("전적 읽기 실패");
			e.printStackTrace();
		}
	}
}

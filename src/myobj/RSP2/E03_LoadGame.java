package myobj.RSP2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E03_LoadGame {
	public static int[] load() {
		int[] record = new int[3];
		
		File saveFile = new File("practice/rsp.txt");
		
		if(!saveFile.exists()) {
			
			try (FileInputStream in = new FileInputStream(saveFile);
			){
				String data = new String(in.readAllBytes());
				
				String[] values = data.split("/");
				for (int i = 0; i < values.length; ++i) {
					record[i] = Integer.parseInt(values[i].trim());
				}
				System.out.println("로드 된 전적: "+ Arrays.toString(record));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		return record;
	}
	public static void main(String[] args) {
		load();
	}
}

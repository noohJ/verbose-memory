package gui.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class words {
	static File words = new File("game/word_collection.txt");
	String answer;
	public words() {
		try(
				BufferedReader in = new BufferedReader(new FileReader(words),8192);
		){
			String line= in.readLine();
			String[] word = line.split(",");
			int rw = (int)(Math.random()*word.length);
			answer = word[rw];

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	public String toString() {
		return String.format("%s",answer);
	}
	public static void main(String[] args) {
		new words();
	}
}

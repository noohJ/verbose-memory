package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class E06_SearchReprter {
	/*
	  언론사 또는 기자의 이름으로 practice/email에 존재하는 기자를 검색하고
	  정보를 열람할 수 있는 콘솔 플로그램을 만들어보세요. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 회사 찾기/ 2.기자 찾기");
		int kindToFind = sc.nextInt();
		if(kindToFind == 1) {
			System.out.println("찾을 회사 입력 >");
			String compony_name = sc.next();
			File locaFile = new File("practice/email/");
			File[] allFile = locaFile.listFiles();
			for(int i = 0 ; i < allFile.length;++i) {
				allFile[i].getName();
				if (Pattern.matches(".*"+compony_name+".+", allFile[i].getName())) {
					File findFile = new File("practice/email/"+allFile[i].getName());
					try(
							BufferedReader in = new BufferedReader(new FileReader(findFile));	
							) {
						String line;
						System.out.println("---------------------------------");
						while ((line = in.readLine()) != null) {
							System.out.println(line);
						}
						
					} catch (FileNotFoundException e) {
						System.out.println("파일 못찾음");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("읽지못함");
						e.printStackTrace();
					}
				}
			}
		}
		if(kindToFind == 2) {
			System.out.println("찾을 기자의 이름 입력 >");
			String reporters_name = sc.next();
			File locaFile = new File("practice/email/");
			File[] allFile = locaFile.listFiles();
			for(int i = 0 ; i < allFile.length;++i) {
				allFile[i].getName();
				if (Pattern.matches(".+"+reporters_name+".txt", allFile[i].getName())) {
					File findFile = new File("practice/email/"+allFile[i].getName());
					try(
							BufferedReader in = new BufferedReader(new FileReader(findFile));	
							) {
						String line;
						while ((line = in.readLine()) != null) {
							System.out.println(line);
						}
					} catch (FileNotFoundException e) {
						System.out.println("파일 못찾음");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("읽지못함");
						e.printStackTrace();
					}
				}
			}			
		}

	}
}

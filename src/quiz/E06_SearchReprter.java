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
	  ��л� �Ǵ� ������ �̸����� practice/email�� �����ϴ� ���ڸ� �˻��ϰ�
	  ������ ������ �� �ִ� �ܼ� �÷α׷��� ��������. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ȸ�� ã��/ 2.���� ã��");
		int kindToFind = sc.nextInt();
		if(kindToFind == 1) {
			System.out.println("ã�� ȸ�� �Է� >");
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
						System.out.println("���� ��ã��");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("��������");
						e.printStackTrace();
					}
				}
			}
		}
		if(kindToFind == 2) {
			System.out.println("ã�� ������ �̸� �Է� >");
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
						System.out.println("���� ��ã��");
						e.printStackTrace();
					} catch (IOException e) {
						System.out.println("��������");
						e.printStackTrace();
					}
				}
			}			
		}

	}
}

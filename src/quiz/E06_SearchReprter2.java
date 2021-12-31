package quiz;

import java.io.File;
import java.util.Scanner;

public class E06_SearchReprter2 {
	
	public static void search(int select) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색어 > ");
		String keyword = sc.nextLine();
		
		File dir = new File("practice/email");
		
		for (String fname: dir.list()) {
			String[] fname_frag =fname.split("_"); 
			System.out.println(fname);
			for(int i = 0 ; i < fname_frag.length;++i) {
				System.out.println(i);
				System.out.println(fname_frag[i]);
			}

//			if(keyword != null && keyword != "" && fname_frag[select].contains(keyword)) {
//				System.out.println(fname);
//			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("# 검색 카테고리 선택");
			System.out.println("  1. 언론사");
			System.out.println("  2. 기자의 이름");
			
			search(sc.nextInt()-1);
		}
	}
}

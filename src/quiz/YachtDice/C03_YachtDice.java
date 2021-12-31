package quiz.YachtDice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_YachtDice {
	/*
	  	# Yacht Dice를 만들어보세요
	  	
	  	1. 플레이어는 자기 차례에 다섯 개의 주사위를 던진다. (주사위 눈은 1 ~ 6)
	  
	  	2. 다섯 개의 주사위의 결과를 통해 다음을 구분해야 한다.
	  	
	  	 (1) 풀하우스 (같은 눈이 2개 /3개) ex: 11333, 31313,66655
	  	 (2) 스몰스트레이트 (연속되는 4개의 수) ex: 1234, 2345, 3456
	  	 (3) 라지 스트레이트 (연속되는 5개의 수) ex: 12345. 23456
	  	 (4) 4 다이스 (같은 숫자 4개)
	  	 (5) 5 Yacht (같은 숫자 5개)
	  	 (6) 아무것도 만족하지 못한 경우 주사위 눈 합으로  점수를 낸다.
	  	 
	  	3. 플레이어는 다시 던지고 싶은 주사위를 골라서 다시 던질 수 있다. (2회) 	  	 
	 */
	public static void main(String[] args) {
		RandomDice Player1 = new RandomDice();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		Player1.throwing();  // 주사위 던지기
		Player1.myDice();  // 내 주사위
		Player1.check();  // 주사위 체크
		
		
		while (count <2) {
			System.out.print("주시위를 교체 하시겠습니까?> \n (1.예 2.아니요)");
			int yn = sc.nextInt();
			
			if (yn == 2) {
				break;
			}
			++count;
			System.out.println("몇개의 주사위를 교체 하겠습니까?");
			
			int throwDice = sc.nextInt();
			
			System.out.println("몇번 주사위를 교체 하겠습니까?");
			for (int i = 0; i < Player1.array.length; ++i) {
				Player1.array[i] = 0;
			}
			int[] num = new int[throwDice];
			for (int i = 0; i < num.length; ++i) {
				num[i] = sc.nextInt();
			}
			for (int i = 0; i <num.length; ++i) {				
				Player1.dice[num[i]-1] =(int)(Math.random()*6+1);
			}
			
			Player1.myDice();  // 내 주사위
			Player1.check();  // 주사위 체크
			
		}
	}
}

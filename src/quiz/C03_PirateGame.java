package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C03_PirateGame {
	
	/*
	  	통아저씨 게임을 만들어 보세요
	  	
	  	0. 게임이 시작되면 플레이어가 몇명이니 정한다.
	  	
	  	1. 여러 플레이어가 돌아가면서 원하는 위치에 칼을 찌른다.
	  	
	  	2. 칼을 찌를 수 있는 홈은 20개가 있고, 그중 2개가 꽝이 된다. (매판마다 랜덤으로 설정)
	  	
	  	3. 잘못된 곳에 칼을 찌른 플레이어가 게임에 패배한다.
	  	
	  	4. 게임은 계속 이어서 플레이 할 수 있고, 각 플레이어의 정보가 누적 집계되어야 한다. 
	 */
	
	public static void main(String[] args) {

		boolean start = true;
		boolean game = true;
		int insertNum, con, user;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇명의 플레이어가 시작 합니까? > ");
		int totalPlayer = sc.nextInt();
		int[] defeat = new int[totalPlayer];

		while (start) {
			Barrel barrel1 = new Barrel();
			while(game) {
				user = 1;
				while (user <= totalPlayer && game ) {
					System.out.println("몇번에 찌르겠습니다? (1 ~ 20)");
					System.out.printf( "%d번 플레이어 > ",user);
					insertNum = sc.nextInt();
					
					if (barrel1.tong[insertNum] != 99) {
						if(barrel1.tong[insertNum] == 0) {
							System.out.println("뻥");
							++defeat[user-1];
							game =false;
							System.out.print("1.계속하기 / 2.그만두기");
							con = sc.nextInt();
							if (con ==2 ) {
								start =false;
								break;
							}else {
							game =false;
							start =true;
							}
						} else {
							barrel1.tong[insertNum] = 99;
							++user;
						}					
					}else {
						System.out.println("이미 선택한 번호입니다.");
					}
				}				
			}
		}

		
		for (int i = 0 ; i < defeat.length; ++i) {
			System.out.printf("%d번째 플레이어의 패배수 : %d\n",i+1,defeat[i]);
		}
	}
}
//게임 상자
class Barrel {
	int[] tong = new int[20];
	
	Barrel() {
		for (int i = 0, num = 1; i < tong.length; ++i, ++num) {
			tong[i] = num; 
		}
		int fail1 = (int)(Math.random() * 20 );
		tong[fail1] = 0;
		while(true) {
			int fail2 = (int)(Math.random() * 20 );
			if (tong[fail2] != 0) {
				tong[fail2] = 0;
				break;
			}
		}
	}
}

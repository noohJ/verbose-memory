package myobj.RSP;

import java.util.Scanner;
/*
	간단한 컴퓨터와의 가위바위보 게임을 하나 만들고, 게임 종료시 전적을 파일에 저장해보세요.
	
	1. 플레이어가 질 때까지 반복된다.
	
	2. 연승할때마다 점수가 더 많이 오른다.
	
	3. 게임 종료시 최고 점수 10명 출력된다. 
*/
public class GameStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. New Game\n2. Load Game\n3. Ranking");
		int chk = sc.nextInt();
		if (chk == 1) {
			new NewGame();
		}else if (chk == 2) {
			new Load();
		}else if (chk == 3) {
			new Ranking();
		}
	}
}

class Crsp{	
	static String[] Rock_Scissors_Paper = {"가위", "바위", "보"};
	int ran;
	public Crsp(int ran) {
		this.ran = ran;
	}
	public String toString() {
		return String.format("%s",Rock_Scissors_Paper[ran]);
	}
}
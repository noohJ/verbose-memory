package myobj.RSP;

import java.util.Scanner;
/*
	������ ��ǻ�Ϳ��� ���������� ������ �ϳ� �����, ���� ����� ������ ���Ͽ� �����غ�����.
	
	1. �÷��̾ �� ������ �ݺ��ȴ�.
	
	2. �����Ҷ����� ������ �� ���� ������.
	
	3. ���� ����� �ְ� ���� 10�� ��µȴ�. 
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
	static String[] Rock_Scissors_Paper = {"����", "����", "��"};
	int ran;
	public Crsp(int ran) {
		this.ran = ran;
	}
	public String toString() {
		return String.format("%s",Rock_Scissors_Paper[ran]);
	}
}
package quiz.YachtDice;

public class RandomDice {
	int[] dice =new int[5];
	int[] array = new int[6];
	boolean two, three;
	boolean Lone, Lsix;
	boolean S56,S16,S12;
	boolean fdice,yacht;
	public void throwing() {
		for (int i = 0; i < dice.length; ++i ) {
			dice[i] = (int)(Math.random()*6+1);
		}		
	}
	public void myDice() {
		System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
		System.out.printf("│  %d  │  %d  │  %d  │  %d  │  %d  │\n",dice[0],dice[1],dice[2],dice[3],dice[4]);
		System.out.println("└─────┴─────┴─────┴─────┴─────┘");
	}
	public void sort() {
		int temp;
		for(int i = 0; i < dice.length-1; ++i ) {
            for(int j = i+1 ; j < dice.length; ++j) {
            	if(dice[j] < dice[i]) {
            		temp = dice[i];
            		dice[i] = dice[j];
            		dice[j] = temp;
            	}
            }
        }
	}
	public void check() {
		two = false;
		three = false;
		Lone = true;
		Lsix = true;
		S56 = true;
		S16 = true;
		S12 = true;
		fdice = false;
		yacht = false;
		for (int i = 0; i < dice.length; ++i) {
			int a = dice[i];
			array[a-1]++;
		}
		
		//풀 하우스 찾기
		for (int i = 0; i < array.length; ++i ) {
			if (array[i] == 2) {
				two = true;
			} else if (array[i] == 3) {
				three = true;
			} else if (array[i] == 0){
				continue;
			} else {
				break;
			}
		}
		if(two&&three) {
			System.out.println("풀하우스");
		}
		// 라지 스트레이트 찾기
		for (int i = 0; i < array.length-1; ++i) {
			if (array[i] == 1) {
				continue;
			} else {
				Lsix = false;
				break;
			}
		}
		for (int i = 1; i < array.length; ++i) {
			if (array[i] == 1) {
				continue;
			} else {
				Lone = false;
				break;
			}
		}
		if(Lone || Lsix) {
			System.out.println("라지스트레이트");
		}
		// 스몰 스트레이트 찾기
		for (int i = 0; i < array.length-2; ++i) {
			if (array[i] != 0) {
				continue;
			} else {
				S56 = false;
				break;
			}
		}
		for (int i = 2; i < array.length; ++i) {
			if (array[i] != 0) {
				continue;
			} else {
				S12 = false;
				break;
			}
		}
		for (int i = 1; i < array.length-1; ++i) {
			if (array[i] != 0) {
				continue;
			} else {
				S16 = false;
				break;
			}
		}
		if(S56 || S16 || S12 || Lone || Lsix) {
			System.out.println("스몰스트레이트");
		}
		// 4 다이스 찾기
		for (int i = 0 ; i < array.length; ++i) {
			if (array[i] == 4) {
				fdice = true;
				System.out.println("4다이스");
				break;
			}else {
				fdice = false;
			}
		}
		// Yacht 찾기
		for (int i = 0 ; i < array.length; ++i) {
			if (array[i] == 5) {
				yacht = true;
				System.out.println("Yachat");
				break;
			}else {
				yacht = false;
			}
		}
		//아무것도 만족 못할시
		if(((two && three) || !Lone || Lsix || S56 || S16 || S12 || fdice || yacht)==false) {
			int total = 0;
			for (int i = 0; i <dice.length; ++i) {
				total += dice[i];
			}
			System.out.println("만족하는 결과가 없습니다 "+total+"점");
		}

	}
	
}

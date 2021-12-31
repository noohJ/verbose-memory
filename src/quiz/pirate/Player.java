package quiz.pirate;

public class Player {
	String name;
	int win;
	int lose;
	double winning_rate;
	int stab;
	int success;
	int fail;
	double stab_rate;
		
	public Player(String name) {
		this.name = name;
	}

	//다른 패키지에 있을 때는 public을 붙여야 사용할 수 있다.
	public String getLabel() {
		String str = String.format("%s > ", this.name);
		return str;
	}
	public void win() {
		win++;
		winRateUpdate();
	}
	
	public void success() {
		stab++;
		success++;
		stabRateUpdate();
	}
	
	public void fail() {
		lose++;
		stab++;
		fail++;
		stabRateUpdate();
		winRateUpdate();
	}
	public void info() {
		System.out.println("-----------------------------");
		System.out.printf("     - '%s'의 정보 - \n",this.name);
		System.out.println("-----------------------------");
		System.out.printf("│승: %-3d  \t\t    │\n",this.win);
		System.out.printf("│패: %-3d  \t\t    │\n",this.lose);
		System.out.printf("│찌르기 성공 횟수: %-4d  \t    │\n" ,this.success);
		System.out.printf("│찌르기 실패 횟수: %-4d  \t    │\n" ,this.fail);
		System.out.printf("│승률: %.2f %c\t\t    │\n" , this.winning_rate,'%');
		System.out.printf("│통아저씨를 찌를 확률: %.2f %c \n",this.stab_rate, '%');
		System.out.println("└───────────────────────────┘");
	}
	// 뭔가 변할때마다 확률 계산 하기 위한 이 클래스 내부의 메서드
	void winRateUpdate() {
		winning_rate = win / (double)(win + lose) * 100.0;
	}
	
	void stabRateUpdate() {
		stab_rate = fail / (double)stab * 100.0;
	}
}

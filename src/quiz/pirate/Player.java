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

	//�ٸ� ��Ű���� ���� ���� public�� �ٿ��� ����� �� �ִ�.
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
		System.out.printf("     - '%s'�� ���� - \n",this.name);
		System.out.println("-----------------------------");
		System.out.printf("����: %-3d  \t\t    ��\n",this.win);
		System.out.printf("����: %-3d  \t\t    ��\n",this.lose);
		System.out.printf("����� ���� Ƚ��: %-4d  \t    ��\n" ,this.success);
		System.out.printf("����� ���� Ƚ��: %-4d  \t    ��\n" ,this.fail);
		System.out.printf("���·�: %.2f %c\t\t    ��\n" , this.winning_rate,'%');
		System.out.printf("����������� � Ȯ��: %.2f %c \n",this.stab_rate, '%');
		System.out.println("����������������������������������������������������������");
	}
	// ���� ���Ҷ����� Ȯ�� ��� �ϱ� ���� �� Ŭ���� ������ �޼���
	void winRateUpdate() {
		winning_rate = win / (double)(win + lose) * 100.0;
	}
	
	void stabRateUpdate() {
		stab_rate = fail / (double)stab * 100.0;
	}
}

package quiz.pirate;

public class Barrel {
	
	boolean alive;
	int size;
	public boolean[] hole;
	boolean[] stab;
	
	public Barrel() {
		this(20, 2); 
		/*
		 	# this()
		  
		     - ������ ȣ��
		     - �� �����ڿ��� �ٸ� �����ڸ� �ҷ��� ����� �� �ִ�.
		     - ������ ȣ���� �� �������� ù ���� �����̾�� �Ѵ�. 
		 */
		
	}
	
	public Barrel(int size, int answer) {
		this.alive = true;
		this.size = size;
		this.hole = new boolean[size];
		this.stab= new boolean[size];
		
		// ��÷ ��ġ �ʱ�ȭ �ϱ� �ϱ�
		for (int i = 0; i< 2; ++i) {
			int ran = (int)(Math.random() * size);
			
			if (hole[ran]) {
				--i;
			}else {
				hole[ran] = true;				
			}
		}
	}
	public void print() {
		boolean debug = false;
		if (debug) {
			for(int i = 0; i < hole.length; ++i) {
				
				if(hole[i]) {
					System.out.print("�� ");
				} else {
					System.out.print("o ");
				}
				
				if (i % 5 == 4) {
					System.out.println();
				}
			}		
		}else {
			for(int i = 0; i < stab.length; ++i) {
				
				if(stab[i]) {
					System.out.print("x ");
				} else {
					System.out.print("o ");
				}
				
				if (i % 5 == 4) {
					System.out.println();
				}
			}						
		}
	}
	
	public int stab(int num) {
		
		// �� �޼��尡 1�� ��ȯ�ϸ� ������ ���� ����
		// �� �޼��尡 0�� ��ȯ�ϸ� ������ ����
		// �� �޼��尡 -1�� ��ȯ�ϸ� �ش� �÷��̾ �ٽ� �̰� �� ����
		if(num > 20 || num < 0) {
			System.out.println("��ȿ���� ���� ��ȣ�Դϴ�.");
			return -1;
		}
		if (stab[num - 1]) {
			System.out.println("�̹� �񷶴� ���Դϴ�.");
			return -1;
		}
		stab[num - 1] = true;
		
		if(alive) {
			alive= !hole[num-1];
			return !alive ? 1 : 0;
		} else {
			System.out.println("�̹� ���� �������Դϴ�.");
			return 1;
		}
	}
}

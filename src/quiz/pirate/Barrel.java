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
		  
		     - 생성자 호출
		     - 한 생성자에서 다른 생성자를 불러다 사용할 수 있다.
		     - 생성자 호출은 그 생성자의 첫 번쨰 구문이어야 한다. 
		 */
		
	}
	
	public Barrel(int size, int answer) {
		this.alive = true;
		this.size = size;
		this.hole = new boolean[size];
		this.stab= new boolean[size];
		
		// 당첨 위치 초기화 하기 하기
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
					System.out.print("ㅁ ");
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
		
		// 이 메서드가 1을 반환하면 게임을 끝낼 예정
		// 이 메서드가 0을 반환하면 지속할 예정
		// 이 메서드가 -1을 반환하면 해당 플레이어가 다시 뽑게 할 예정
		if(num > 20 || num < 0) {
			System.out.println("유효하지 않은 번호입니다.");
			return -1;
		}
		if (stab[num - 1]) {
			System.out.println("이미 찔렀던 곳입니다.");
			return -1;
		}
		stab[num - 1] = true;
		
		if(alive) {
			alive= !hole[num-1];
			return !alive ? 1 : 0;
		} else {
			System.out.println("이미 죽은 아저씨입니다.");
			return 1;
		}
	}
}

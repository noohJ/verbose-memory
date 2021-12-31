
public class B07_BreakContinue {

	/*
	  	# break
	  	
	  	 - 반복문 내부에서 사용하면 해당 반복문을 탈출한다.
	  	 - switch-case 문에서 사용하면 해당 case를 탈출한다.
	  	
	  	# continue
	  	
	  	 - 반복문 내부에서 사용하면 다음번 반복으로 넘어간다
	  	 - ㅂcontinue를 만나게 되면 이후 남은 반복 코드는 모두 ㅂ무시한다.
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			
			if (i == 7) {
				continue;
			}
			System.out.println(i);
		}
	}
}

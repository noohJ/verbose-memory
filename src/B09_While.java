
public class B09_While {
	/*
		   # while
		   
		    - for 문과 사용법이 약간 다른 반복문
		    - 초기값과 증가값의 위치가 정해져 있지 않다
		    - ()안의 조건이 참인동안 {}안의 내용을 반복한
		    - 증가값의 위치에 따라 프로그램 실행이 달라질 수 있으므로 주의해야 한다.
	 */
	public static void main(String[] args) {
	
		int i = 0;
		
		while (i < 10) {
			System.out.println("계속 반복해주세요." + ++i);
		}
	}
}

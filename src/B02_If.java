
public class B02_If {

	public static void main(String[] args) {
		/*
		  	# if문
		  	 - ()안의 값이 true일 때 {}안의 내용을 실행한다
		  	 - ()안의 값이 false일 때 {}안의 내용을 무시한다. 
		  	 - {}안에서 실행할 내용이 단 한 줄이라면 {}를 생량할 수 있다.
		  	   (생략이 가능하더라도 범위를 쉽게 파악하기 위해 {}를 적는것이 좋다.)
		  	   
		  	# else if문
		  	 - 위에 있는 if문이 실행되지 않았다면 밑에서 if문처럼 동작한다
		  	 - else if는 단독으로 사용할 수 없다.
		  	 - else if는 여러번 사용할 수 있다.
		  	 
		  	# else문
		  	 - 위에 있는 모든 if문과 else if문이 실행되지 않았다면 else문의 내용을 무조건 실행한다.
		  	 - if문 바로 다음에 사용할 수도 있다.
		 */
		int num = 43;
		
		if (num % 10 == 0) {
			System.out.println("num에 들어있는 값은 10의 배수 입니다.");
		} else if(num % 3 == 0) {
			System.out.println("10의 배수가 아니고 3의 배수라서 실행되었습니다.");
		} else if(num % 4 == 0) {
			System.out.println("10의 배수가 아니면서 3의 배수도 아닌 4의 배수");
		} else {
			System.out.println("위의 모든 조건에 걸리지 않았습니다.");
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}
}

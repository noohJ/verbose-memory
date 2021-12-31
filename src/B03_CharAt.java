
public class B03_CharAt {
	
	/*
	 	 # "문자열" .charAt(index);
	 	 
	 	  - 해당 문자열에서 원하는 인덱스의 문자를 char타입으로 꺼내는 함수
	 	  - 첫 번쨰 문자는 0번 인덱스에 있다.
	 	  
	 	 # "문자열".length();
	 	 
	 	  - 해당 문자열이 몇개의 문자로 이루어져있는지 int타입으로 반환한다
	 	 
	 	 # Scanner.net()
	 	 
	 	  - 입력받은 문자열을 공백, 탭, 줄바꿈으로 구분하여 하나씩 꺼낸다
	 	  	ex> i am a boy = i/am/a/boy/
	 	 
	 	 # Scanner.netline()
	 	 
	 	  - 입력받은 문자열을 줄바꿈으로 구분하여 하나씩 꺼낸다.
	 	    ex> i am a boy = i am a boy/ 
	 */
	public static void main(String[] args) {
		int len = "Hello, Everyone!!".length();
		
		System.out.println("Hello, Everyone!!".charAt(0));
		System.out.println("Hello, Everyone!!".charAt(1));
		System.out.println("Hello, Everyone!!".charAt(2));
		System.out.println("Hello, Everyone!!".charAt(3));
		System.out.println("Hello, Everyone!!".charAt(4));
		System.out.println("Hello, Everyone!!".charAt(5));
		System.out.println("Hello, Everyone!!".charAt(6));
		System.out.println("Hello, Everyone!!".charAt(7));
		System.out.println("Hello, Everyone!!".charAt(16));
		System.out.println("Hello, Everyone!!".charAt(len-1));
		System.out.println("Hello, Everyone!!".length());
	}
}


/*
    # Eclipse 유용한 단축키
    
     - Ctrl + F11 : 빌드(컴파일 + 실행)
     - Ctrl + [+, -] : 글씨 크기 조절
     - Ctrl + M : 해당 창 최대/최소
     - Ctrl + W : 해당 탭 닫기
     - Ctrl + Shift+ W : 모든 탭 닫기
     - Ctrl + x : 잘라내기
     - Ctrl + C : 복사하기
     - Ctrl + V : 붙여넣기
     - Alt + 방향키 : 줄 바꾸기
     
     # 블록지정 관련
     
     - Shift + 커서옮기기 : 방향키로 블록 지정 하기 
     - Home : 커서를 해당 줄의 맨 앞으로 이동
     - End : 커서를 해당 줄의 맨 뒤로 이동
     
     # 들여쓰기 관련
     
      - Tab : 들여쓰기
      - shift + Tab : 거꾸로 들여쓰기
      - Ctrl + Shift + F :해당 파일의 모든 Java 코드를 자동으로 들여 쓰기
      
     # Windows 관련
     
      - [win] + d : 바탕화면 바로 보기
      - [win] + e : 탐색기
      - [win] + 방향키 : 창 크기 조절 하기
      - [win] + [Shift] + S : 캡쳐
          
 */
public class A01_Escape {
	/*
	    # Escape 문자
	    
	     - 특수한 기능을 가진 문자들을 표현하기 위한 문법
	     - 그냥 출력하려고 하면 여러 문제가 발생하는 문자들을 안전하게 출력할 수 있다
	     - 앞에 \(역슬래시)가 붙은 문자는 컴파일러가 이스케이프 문자로 간주한다
	     - 앞에 붙은 역슬래시와 뒤의 한 문자를 합쳐 하나의 문자로 인식한다.
	 */
	public static void main(String[] args) {
		System.out.println("안녕하세요, 반갑습니다!");
		
		// \n : 줄 바꿈을 출력하기 위한 이스케이프 문자(linefeed, breakline, newline ...)
		System.out.println("안녕하세요, 반\n갑습니다!");
		
		// \t : Tab을 출력하기 위한 이스케이프 문자
		System.out.println("안녕하세요, 반\t갑\t습\t니\t다!");		
		
		// \\ : escape sequence 기능을 사용하지 않고 그냥 역슬래시를 출력하기 위해 사
		System.out.println("\\그냥 쓰고 싶은데..\\쓸수 없나?");
		
		// \" : 그냥 " 를 출력하기 위한 이스케이프 문자
		System.out.println("용기를 내서 말했습니다. \"모르겠습니다.\"");
		
		// \' : 그냥 ' 를 출력하기 위한 이스케이프 문자
		System.out.println("용기를 내서 말했습니다. \'모르겠습니다.\'");
		System.out.println("용기를 내서 말했습니다. '모르겠습니다.'");
		System.out.println('\'');
	}
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	  	# 정규표현식 (Regular Expression)
	  	
	  	 - 문자열을 패턴으로 검사할 수 있는 표현식
	  	 - 특정 프로그래밍 언어에만 있는것이 아닌 공통의 규칙
	  	 - 정의한 문자열 패턴과 일치하는 문자열을 걸러낼 수 있다.
	  	 
	  	# Java에서 정규표현식을 다룰 때 사용하는 클래스
	  	
	  	 - Pattern
	  	 - Matcher	  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Pattern.matches(regex, input): input이  regex에 일치하는 문자열인지 검사한다.
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의하는 표현식
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]ee[pk]", "saeep"));
		System.out.println(Pattern.matches("s[lh]ee[ABCDEFGpk]", "sleeG"));
		
		/*
		  	[abc] : a,b,c 허용 
		  	[a-z] : a부터z까지 모두 허용
		  	[A-G] : A부터G까지 모두 혀용
		  	[\\-]: 역슬래시를 전달하면 escape역할을 하게 된다.
		  	[a-e&&c-z]:a-e와 c-z를 모두 만족시키는 문자를 허용 (교집합)
		 */
		System.out.println(Pattern.matches("[a-d&&b-f]","d"));
		
		/*
		  	# 하나로 여러 문자를 나타내는 것들
		  	
		  	.  : 모든 문자
		  	\\d : 모든 숫자
		  	\\D : 숫자를 제외한 모든것 		  
		  	\\s : 모든 공백(\t, \n \r, )
		  	\\S : 공백을 제외한 모든것
		  	\\w : 일반적인 문자들을 허용[a-zA-Z0-9_]
		  	\\W : \w를 제외한 모든 것 
		  	
		 */
		System.out.println(Pattern.matches("...","dqs"));
		System.out.println(Pattern.matches("\\d..","4qs"));
		System.out.println(Pattern.matches("[\\Da]..","dqs"));
		System.out.println(Pattern.matches("\\d\\s..","4 qs"));
		System.out.println(Pattern.matches("\\d\\s..","4\nqs"));
		System.out.println(Pattern.matches("\\w..","_qs"));
		
		/*
		  	# 해당 패턴이 적용될 문자의 개수를 설정하는 방법
		  	
		  	 .{n}: {}앞의 패텅이 n개 일치해야한다.
		  	 .{n,m}: {}앞의 패턴이 최소 n개 최대 m개 일치해야 한다.
		  	 .{n,}: {}앞의 패턴이 최소 n개 이상 일치해야 한다.
		  	 .? : ? 앞의 패턴이 0번 또는 한번 나와야 한다.
		  	 .+ : + 앞의 패턴이 최소1번 이상 나와야 한다.
		  	 .* : * 앞의 패턴이 0번 이상 나와야 한다.
		 */
		System.out.println(Pattern.matches(".{5}","12345"));
		System.out.println(Pattern.matches("\\D{8}", "@#$Dsa#!"));
		System.out.println(Pattern.matches("\\d{2,4}", "2222"));
		System.out.println(Pattern.matches("\\d{5,}", "2222222222"));
		System.out.println(Pattern.matches("abc\\d?", "abc2"));
		System.out.println(Pattern.matches("abc\\d+", "abc5"));
		System.out.println(Pattern.matches("abc\\d*", "abc"));
		// 해당 문자열이 핸드폰 번호인지 검사할 수 있는 정규표현식을 만들어라
//		System.out.println("번호)문자열 입력 > ");
//		String chk = sc.next();
//		System.out.println((Pattern.matches("[0][1][0-9]\\d{8}", chk))||(Pattern.matches("[0][1][0-9]-\\d{4}-\\d{4}", chk)));
//		
//		System.out.println("이메일)문자열 입력 > ");
////		String chk2 = sc.next();
//		String chk2 = "abc@naver.co.";
//		System.out.println((Pattern.matches("\\w{1,}@[a-zA-Z0-9]{1,}\\.[a-zA-Z0-9]{1,}", chk2))||
//				(Pattern.matches("\\w{1,}@[a-zA-Z]{1,}\\.[a-zA-Z0-9]{1,}\\.[a-zA-Z0-9]{1,}", chk2)));
		
		
		// Matcher 클래스로 긴 문자열 검사하기
		String fruits = "apple/banana/kiwi/mango/pineapple/banana/redapple/greenapple/apple";
		
		// 1. 정규 표현식을 컴파일한 인스턴스를 생성
		Pattern pattern = Pattern.compile("(\\w+)(apple)");
		
		// 2. 컴파일해놓은 정규표현식으로 원하는 문자열을 검사하기위한 Matcher 인스턴스가 반환된다
		Matcher matcher =pattern.matcher(fruits);
		
		while (matcher.find()) {
			System.out.println("--------------------");
			System.out.println("찾은 것: " + matcher.group(1));
			System.out.println("찾은것의 시작 위치: " + matcher.start(1));
			System.out.println("찾은것의 마지막 위치: " + matcher.end(1));
		}
	}
}

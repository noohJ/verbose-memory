package quiz;

import java.util.Scanner;

public class C15_InputRightPassword {
	
	/*
	  	# 올바른 패스워드를 만들기 위한 규칙
	  	
	  	  1. 모두 숫자이면 안됨
	  	 
	  	  2. 대문자, 소문자, 숫자, 특수문자가 섞여있어야 함
	  	 
	  	  3.특수 문자는 !,@,#,$,%,^,&,* 만 사용 가능
	  	 
	  	  4. 비밀 번호의 길이가 8자리 이상 24자리 이하여야 함
	  	 
	  	 위의 규칙을 어긴 경우 예외를 발생시켜서 알맞은 안내 문구를 출력해보세요.
	  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 비밀번호를 입력하세요.");
		System.out.println("  --  조 건 --");
		System.out.println("1. 모두 숫자이면 안됨");
		System.out.println("2. 대문자, 소문자, 숫자, 특수문자가 섞여있어야 함");
		System.out.println("3. 특수 문자는 !,@,#,$,%,^,&,* 만 사용 가능");
		System.out.println("4. 비밀 번호의 길이가 8자리 이상 24자리 이하여야 함");
		System.out.print("비밀번호 기입 >>");

		while (true) {			
			try {
				String password = sc.next();
				check(password);
				System.out.println("비밀번호 생성이 완료 되었습니다."+password);
				break;
			}catch(noNumbers e) {				
				e.printStackTrace();
				System.out.println("비밀번호를 다시 기입해 주세요");
			}catch(noUpperCase e) {
				e.printStackTrace();
				System.out.println("비밀번호를 다시 기입해 주세요");
			}catch(noLowerCase e) {
				e.printStackTrace();
				System.out.println("비밀번호를 다시 기입해 주세요");
			}catch(noSpecialCharacters e) {
				e.printStackTrace();
				System.out.println("비밀번호를 다시 기입해 주세요");
			}
		}
	}
	
	public static void check(String password) throws noNumbers,noUpperCase,noLowerCase,noSpecialCharacters{
		boolean num = false, uc = false, lc = false, sc = false;
		for (int i = 0; i < password.length(); ++i) {
			
			char ch = password.charAt(i);
			
			if ( ch >= '0' && ch <='9') {
				num = true;
			}else if( ch >= 'A' && ch <='Z'){
				uc = true;
			}else if (ch >= 'a' && ch <='z') {
				lc = true;
			}else if (ch == '!'|| ch == '@'||ch == '#'||ch == '$'|| ch == '%' || ch == '^'|| ch == '&'|| ch =='*'){
				sc = true;
			}
		}
		if (num == false) {
			throw new noNumbers();
		}else if(uc == false) {
			throw new noUpperCase();
		}else if(lc == false) {
			throw new noLowerCase();
		}else if(sc == false) {
			throw new noSpecialCharacters();
		}

	}

	
}
class noNumbers extends Exception{
	public noNumbers(){
		super("조건에 만족하지 못합니다. (숫자를 포함하시오)");
	}
}
class noUpperCase extends Exception{
	public noUpperCase(){
		super("조건에 만족하지 못합니다. (대문자를 포함하시오)");
	}
}
class noLowerCase extends Exception{
	public noLowerCase(){
		super("조건에 만족하지 못합니다. (소문자를 포함하시오)");
	}
}
class noSpecialCharacters extends Exception{
	public noSpecialCharacters(){
		super("조건에 만족하지 못합니다. (올바른 특수 문자를 포함하시오)");
	}
}



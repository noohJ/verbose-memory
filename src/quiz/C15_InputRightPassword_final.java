package quiz;

public class C15_InputRightPassword_final {
	private static boolean checkNumeric(String password) {

		char[] pArr = password.toCharArray();
		
		boolean numeric = false;
		
		for(int i = 0; i <pArr.length ; ++i) {
			
				if (!(numeric = pArr[i] >= '0'&& pArr[i]<='9')) {
					break;
				}
		}
		
		return true;
	}
	private static boolean checkWhiteList(char ch) {
		char[] white_list = {'!','@','#','$','%','^','&','*'};
		
		for (char valid : white_list) {
			if (valid == ch) {
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean checkRequired(String password) {
		char[] pArr = password.toCharArray();
		boolean[] check = new boolean[4];
		
		for (char ch : pArr) {
			if (ch >= 'A' && ch <= 'Z') {
				check[0] = true;
			} else if (ch >= 'a' &&ch <='z') {
				check[1] = true;
			} else if (ch >= '0' && ch <= '9') {
				check[2] = true;
			} else if(checkWhiteList(ch)) {
				check[3] = true;
			}
			boolean result = true;
			
			for (int i = 0; i <check.length; ++i) {
				result &= check[i];
			}
			
			return result;
			
		}
		
		return true;
	}
	
	public static void checkLength(String password) {
		int len = password.length();
		
		if (len < 8 || len >24) {
			throw new InvalidPasswordException("비밀번호의 길이는 8 ~ 24자여야 합니다.")
		}
	}
	
//	public static boolean checkPassword(String password) {
//		boolean result0 = checkLength(password);
//		boolean result1 = checkNumeric(password);
//		boolean result2 = checkRequired(password);
//		
//		System.out.println("length: " + result0);
//		System.out.println("only num: " + result1);
//		System.out.println("required character: " + result2);
//		System.out.println("");
//		
//		return result0 && !result1 && result2;
//	}
	public static boolean checkPassword(String password) {
		try {
			checkLength(password);
			checkNumeric(password);
			checkRequired(password);
			
			return true;
		} catch (Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(checkPassword("1234567"));
//		System.out.println(checkPassword("1234asd"));
//		System.out.println(checkPassword("1234ASD"));
		System.out.println(checkPassword("123ASDasd!@#"));
	}
}

class InvalidPasswordException extends RuntimeException{
	public InvalidPasswordException(String message) {
		super(message);
	}
}

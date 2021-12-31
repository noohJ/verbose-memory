

import java.io.FileNotFoundException;
import java.io.IOException;

public class C14_Throw {
	/*
	  	# throw
	  	
	  	 - 즉시 원하는 예외를 발생시킨다.
	  	 
	  	# throws
	  	
	  	 - 해당 메서드에서 발생하는 예외에 대한 처리를 메서드를 호출한 곳으로 미룰 수 있다.
	  	 
	  	# 꼭 처리하지 않아도 되는 예외 
	  	
	  	 - RuntimeException 클래스를 상속받은 예외들은 반드시 처리하지 않아도 딘다. 
	  	 - 예외 처리를 하지 않아도 컴파일 에러(빨간줄)는 발생하지 않는다.
	  	 
	  	# 필수로 처리해야 하는 예요
	  	
	  	 - Exception 클래스를 상속받은 예외들은 처리하지 않으면 컴파일이 불가능하다.
	  	 - 더딘가에서는 반드시 try- catch로 처리되어야 컴파일을 진행할 수 있다.
	 */
	public static int awesomeMethod2() throws FileNotFoundException, IOException {
		switch ((int)(Math.random()*10)) {
			case 0:
				return 0;
			case 1:
				throw new FileNotFoundException("1이 나왔네요");
			case 2:
				throw new IOException("2가 나왔네요");
			default:
				throw new IllegalArgumentException();
		}
	}
	
	public static int awesomeMethod(){
		try {
			switch ((int)(Math.random()*10)) {
			case 0:
				return 0;
			case 1:
				throw new FileNotFoundException("1이 나왔네요");
			case 2:
				throw new IOException("2가 나왔네요");
			default:
				throw new IllegalArgumentException();
			}			
		} catch(FileNotFoundException e) {
			return -1;
		}catch(IOException e) {
			return -2;
		}
	}

	
	public static void main(String[] args) {
		
	}
}

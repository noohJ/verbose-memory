
public class C13_Exception {
	
	/*
	  	# 예회 (Exception)
	  
	  	 - 우리가 에러라고 생각했던 빨간 글씨들을 사실 예외라고 부른다.
	  	 - 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러(문법 오류)라고 부른다.
	  	 - 프로그래머가 발생할 예외를 미리 예측하고 대비해두는 것을 예외처리라고 부른다.
	  	 - 예외 처리의 기본 동작은 프로그램 강제 종료이다. 
	  	 
	  	# 예외 처리
	  	
	  	 - 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다.
	  	 - try문 내부에서 예외가 발생하지 않으면 모두 정상 실행된다.
	  	 - try문 내부에서 예외가 발생하는 즉시 try문 실행을 중단하고 발생한 예외에 해당하는
	  	   catch문으로 넘어가게 된다.
	  	 - 예외 발생시 catch문에는 발생한 예외에 대한 정보를 담고 있는 인스턴스가 전달된다
	  	 - cathc 문은 중첟이 가능하다.
	  	 - 예외 발생 여부와 관계없이 무조건 싶은 코드는 finally에 작성하낟.
	 */
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			System.out.println(arr[(int)(Math.random() * 20)]);
			
			int a = 10/0;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("잘못된 인덱스 접근입니다.");
			System.out.println("## 에러정보 ##");
			System.out.println("Error Message : " + e.getMessage());
			System.out.println("Stack Trace: "+ e.getStackTrace());
			e.printStackTrace();
			
//			StackTraceElement[] stack_traces = e.getStackTrace();			
//			for (int i = 0; i < stack_traces.length; ++i) {
//				System.out.println(stack_traces[i]);
//			}
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누시면 안됩니다.");
		} catch (Exception e) {
			// else와 같은 효과 
			System.out.println("위의 경우를 제외한 모든 예를 처리할 수 있음.");
		} finally {
			System.out.println(" /)/)");
			System.out.println("(  ..)");
			System.out.println("(  ><)");
		}
		 System.out.println("프로그램을 계속 실행합니다.");
	}
}
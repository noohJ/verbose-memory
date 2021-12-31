
public class C13_Exception {
	
	/*
	  	# ��ȸ (Exception)
	  
	  	 - �츮�� ������� �����ߴ� ���� �۾����� ��� ���ܶ�� �θ���.
	  	 - �ڹ��� ������ Ʋ���� ���� ���ܰ� �ƴ϶� ������ ����(���� ����)��� �θ���.
	  	 - ���α׷��Ӱ� �߻��� ���ܸ� �̸� �����ϰ� ����صδ� ���� ����ó����� �θ���.
	  	 - ���� ó���� �⺻ ������ ���α׷� ���� �����̴�. 
	  	 
	  	# ���� ó��
	  	
	  	 - ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��.
	  	 - try�� ���ο��� ���ܰ� �߻����� ������ ��� ���� ����ȴ�.
	  	 - try�� ���ο��� ���ܰ� �߻��ϴ� ��� try�� ������ �ߴ��ϰ� �߻��� ���ܿ� �ش��ϴ�
	  	   catch������ �Ѿ�� �ȴ�.
	  	 - ���� �߻��� catch������ �߻��� ���ܿ� ���� ������ ��� �ִ� �ν��Ͻ��� ���޵ȴ�
	  	 - cathc ���� �߫I�� �����ϴ�.
	  	 - ���� �߻� ���ο� ������� ������ ���� �ڵ�� finally�� �ۼ��ϳ�.
	 */
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			System.out.println(arr[(int)(Math.random() * 20)]);
			
			int a = 10/0;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("�߸��� �ε��� �����Դϴ�.");
			System.out.println("## �������� ##");
			System.out.println("Error Message : " + e.getMessage());
			System.out.println("Stack Trace: "+ e.getStackTrace());
			e.printStackTrace();
			
//			StackTraceElement[] stack_traces = e.getStackTrace();			
//			for (int i = 0; i < stack_traces.length; ++i) {
//				System.out.println(stack_traces[i]);
//			}
		} catch (ArithmeticException e) {
			System.out.println("0���� �����ø� �ȵ˴ϴ�.");
		} catch (Exception e) {
			// else�� ���� ȿ�� 
			System.out.println("���� ��츦 ������ ��� ���� ó���� �� ����.");
		} finally {
			System.out.println(" /)/)");
			System.out.println("(  ..)");
			System.out.println("(  ><)");
		}
		 System.out.println("���α׷��� ��� �����մϴ�.");
	}
}
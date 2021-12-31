
public class C15_CustomException {
	/*
	  	# ���ϴ� ���� ���� ���� ����ϱ�
	  	
	  	 - Exception �� ��� ������ �ݵ�� ó���ؾ� �ϴ� ����
	  	 - RuntimeException�� ��ӹ����� ó������ �ʾƵ� �Ǵ� ����
	 */
	
	public static void main(String[] args) {
		try {
			test(213);			
		}catch (NotEvenException e) {
			e.printStackTrace();
		}
		
	}
	//Object : ��� Ÿ���� �θ�
	public static void test2(Object obj) throws NotSwimmerException{
		if (!(obj instanceof Swimmer)) {
			((Swimmer)obj).swim();
		}else {
			throw new NotSwimmerException();			
		}
	}
	
	public static boolean test(int num) throws NotEvenException  {
		if (num%2 ==0) {
			return true;
		}else {
			throw new NotEvenException();
		}
	}
}

class NotSwimmerException extends Exception{
	public NotSwimmerException() {
		super("������ ���ϴ� ��ü");
	}
}

class NotEvenException extends Exception{
	
	public NotEvenException() {
		super("Ȧ���Դϴ�.");
	}
	public NotEvenException(String message) {
		super(message);
	}
}

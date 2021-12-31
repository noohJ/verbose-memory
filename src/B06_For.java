
public class B06_For {
	
	/*
	   	# �ݺ��� (loop)
	  
	  	 - for, while, for-each, do-while(X)
	  	 - �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�
	  	 
	  	# for ��
	  	
	  	 for (�ʱⰪ; �ݺ�����; ������) {
	  	 	����� �ݺ� ������ ���� ���� �ݺ��� ����
	  	 }
	  	 
	  	 - �ʱⰪ, �ݺ�����, �������� �����Ӱ� �����ϸ� �뵵�� �°� ����ؾ� �Ѵ�.
	  	 - �ʱⰪ, �ݺ�����, �������� �� ���� �ʾƵ� �ȴ� 
	 */
	public static void main(String[] args) {
		/*
		    1. ���� �⺻���� ������ for��
		  	 - �ʱⰪ���� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�.
		  	 - ������ 1�� �Ѵ�.
		  	 - ���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���� for��
		 */
		for (int i = 0; i <10; ++i) {
			System.out.println("Hello, world! " + i);
		}
		String str = "Common sense is not so common";
		
		// ���ڿ� �ѱ��ڽ� �ȹٷ� �б�
		
		for (int index = 0; index < str.length(); ++index ) {
			System.out.println("�� ���ھ� ����غ���: " + str.charAt(index));
		}
		
		System.out.println("----------------------------");
		
		//���ڿ� �ѱ��ھ� �Ųٷ� �б�
		int len = str.length();
		for (int index = len - 1; index >= 0; --index) {
			System.out.println("�� ���ھ� ����غ���: " + str.charAt(index));
		}
	}
}

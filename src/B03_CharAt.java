
public class B03_CharAt {
	
	/*
	 	 # "���ڿ�" .charAt(index);
	 	 
	 	  - �ش� ���ڿ����� ���ϴ� �ε����� ���ڸ� charŸ������ ������ �Լ�
	 	  - ù ���� ���ڴ� 0�� �ε����� �ִ�.
	 	  
	 	 # "���ڿ�".length();
	 	 
	 	  - �ش� ���ڿ��� ��� ���ڷ� �̷�����ִ��� intŸ������ ��ȯ�Ѵ�
	 	 
	 	 # Scanner.net()
	 	 
	 	  - �Է¹��� ���ڿ��� ����, ��, �ٹٲ����� �����Ͽ� �ϳ��� ������
	 	  	ex> i am a boy = i/am/a/boy/
	 	 
	 	 # Scanner.netline()
	 	 
	 	  - �Է¹��� ���ڿ��� �ٹٲ����� �����Ͽ� �ϳ��� ������.
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

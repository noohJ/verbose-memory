package quiz;

import java.util.Scanner;

public class C15_InputRightPassword {
	
	/*
	  	# �ùٸ� �н����带 ����� ���� ��Ģ
	  	
	  	  1. ��� �����̸� �ȵ�
	  	 
	  	  2. �빮��, �ҹ���, ����, Ư�����ڰ� �����־�� ��
	  	 
	  	  3.Ư�� ���ڴ� !,@,#,$,%,^,&,* �� ��� ����
	  	 
	  	  4. ��� ��ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��
	  	 
	  	 ���� ��Ģ�� ��� ��� ���ܸ� �߻����Ѽ� �˸��� �ȳ� ������ ����غ�����.
	  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��й�ȣ�� �Է��ϼ���.");
		System.out.println("  --  �� �� --");
		System.out.println("1. ��� �����̸� �ȵ�");
		System.out.println("2. �빮��, �ҹ���, ����, Ư�����ڰ� �����־�� ��");
		System.out.println("3. Ư�� ���ڴ� !,@,#,$,%,^,&,* �� ��� ����");
		System.out.println("4. ��� ��ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��");
		System.out.print("��й�ȣ ���� >>");

		while (true) {			
			try {
				String password = sc.next();
				check(password);
				System.out.println("��й�ȣ ������ �Ϸ� �Ǿ����ϴ�."+password);
				break;
			}catch(noNumbers e) {				
				e.printStackTrace();
				System.out.println("��й�ȣ�� �ٽ� ������ �ּ���");
			}catch(noUpperCase e) {
				e.printStackTrace();
				System.out.println("��й�ȣ�� �ٽ� ������ �ּ���");
			}catch(noLowerCase e) {
				e.printStackTrace();
				System.out.println("��й�ȣ�� �ٽ� ������ �ּ���");
			}catch(noSpecialCharacters e) {
				e.printStackTrace();
				System.out.println("��й�ȣ�� �ٽ� ������ �ּ���");
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
		super("���ǿ� �������� ���մϴ�. (���ڸ� �����Ͻÿ�)");
	}
}
class noUpperCase extends Exception{
	public noUpperCase(){
		super("���ǿ� �������� ���մϴ�. (�빮�ڸ� �����Ͻÿ�)");
	}
}
class noLowerCase extends Exception{
	public noLowerCase(){
		super("���ǿ� �������� ���մϴ�. (�ҹ��ڸ� �����Ͻÿ�)");
	}
}
class noSpecialCharacters extends Exception{
	public noSpecialCharacters(){
		super("���ǿ� �������� ���մϴ�. (�ùٸ� Ư�� ���ڸ� �����Ͻÿ�)");
	}
}



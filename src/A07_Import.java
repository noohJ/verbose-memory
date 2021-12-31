import quiz.*;

public class A07_Import {
	
	/*
	  	 �츮�� �츮�� ������� �ٸ� Ŭ������ ��ɵ��� ��� �����ͼ� ���� �� �� �ִ�.
	  	 
	  	 # import
	  	  - �ٸ� ��Ű���� ���ǵǾ� �ִ� Ŭ������ �����ͼ� ����ϱ� ���ؼ��� import�� �ʿ��ϴ�.
	  	  - �ش� ��Ű���� ��� Ŭ������ �ҷ����� ���� ���� *�� ����Ѵ�.
	  	  - ���� ��Ű���� �����ϴ� Ŭ�������� import ���̵� ������ ����� �� �ִ�.
	 */
	public static void main(String[] args) {
		// ���� default package�� Ŭ�������� �׳� ������ ����� �� �ִ�.
		A00_Hello.main(null);
		A01_Escape.main(null);
		A02_Variable.main(null);
		
		// ���� A07_import�� default package�� ��ġ�� �ֱ� ������
		// quiz ��Ű���� Ŭ�������� ������ ����ϱ� ���ؼ��� import�� �ʿ��ϴ�.
		A01_PrintQuiz.main(null);
		A02_VariableQuiz.main(null);
	}
}

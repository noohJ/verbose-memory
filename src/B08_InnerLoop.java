
public class B08_InnerLoop {
	
	public static void main(String[] args) {
		// # �ݺ��� ���ο� �ݺ��� ����ϱ�
		for (int i = 0 ; i < 10; ++i) {
			
			System.out.println("====================================�ٱ��� �ݺ���" + i);
			
			for (int j = 0 ; j < 6; ++j) {
				
				System.out.printf("------------------���� �ݺ��� %d-%d\n", i, j);
				
				for (int k = 0; k < 3; ++k) {
					System.out.printf("++++���� ���� �ݺ��� %d-%d-%d\n", i,j,k);
				}
			}
		}
		
		/*
			# ���� �ݺ������� ������ ����غ���
			
			- �������� 2�� ~ 9�ܱ��� �ִ�.
			- �� �ܸ��� x1 ~ x9���� �ִ�
		*/
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("++++++ %d�� ++++++\n", dan);
			
			for  (int gop = 1; gop < 10; ++gop) {
				System.out.printf("%d x %d = %d\n", dan, gop, dan *gop);
			}
		}
	}
}

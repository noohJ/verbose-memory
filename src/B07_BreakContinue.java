
public class B07_BreakContinue {

	/*
	  	# break
	  	
	  	 - �ݺ��� ���ο��� ����ϸ� �ش� �ݺ����� Ż���Ѵ�.
	  	 - switch-case ������ ����ϸ� �ش� case�� Ż���Ѵ�.
	  	
	  	# continue
	  	
	  	 - �ݺ��� ���ο��� ����ϸ� ������ �ݺ����� �Ѿ��
	  	 - ��continue�� ������ �Ǹ� ���� ���� �ݺ� �ڵ�� ��� �������Ѵ�.
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			
			if (i == 7) {
				continue;
			}
			System.out.println(i);
		}
	}
}

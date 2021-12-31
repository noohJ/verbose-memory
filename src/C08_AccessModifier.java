
public class C08_AccessModifier extends myobj.C08_DiffPackageClass {
	
	public void test() {
		
		// �ٸ� ��Ű������ ��ӹ޾Ƽ� ����� �� ������ �� �ִ� �ڿ�: public, protected
		// �ٸ� ��Ű������ ��ӹ޾Ƽ� ����� �� ������ �� ���� �ڿ�: default, private
		System.out.println(super._protected_var);
		System.out.println(super._public_var);
	}
	
	/*
	  	# ���� ������ (Access Modifier)
	  	
	  	 - �ٸ� Ŭ�������� �ش� �ڿ��� ����Ϸ��� �� �� ��� ������ �����Ѵ�
	  	 - �ܺ� class���� public�� default�ۿ� ����� �� ����.
	  	
	  	
	  	# ����
	  	
	  	 - private   : ���� Ŭ���� ���ο����� ������ �� �ִ� �ڿ�
	  	 - default   : �ƹ��͵� ��������. ���� ��Ű�� ���ο����� ������ �� �ִ� �ڿ�
	  	 - protected : �ٸ� ��Ű������ ��ӹ��� Ŭ���������� ������ �� �ִ� �ڿ�
	  	 - public    : �ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ�
	  	 
	  	# ������������ Ȱ��
	  	
	  	 - public���� �������� ���� ��� �ڿ����� �ٸ� ��Ű������ ������� �ʴ´�.
	  	 - �ش� Ŭ������ �ٸ� �����ڰ� ������ ����� �� �߸��� ������� ����ϴ°���
	  	   ������ �� �ִ�.
	 */
	
	
	public static void main(String[] args) {
		
		// ���� ��Ű������ ������ �� �ִ� �ڿ� : default, protected, public
		// ���� ��Ű������ ������ �� ���� �ڿ� : private
		C08_SamePackageClss i1 = new C08_SamePackageClss();
		
		System.out.println(i1._public_var);
		System.out.println(i1._protected_var);
		System.out.println(i1._defualt_var);
		
		// �ٸ� ��Ű������ ������ �� �ִ� �ڿ� : public
		// �ٸ� ��Ű������ ������ �� ���� �ڿ� : default, protected, private
		myobj.C08_DiffPackageClass i2 = new myobj.C08_DiffPackageClass();
		
		System.out.println(i2._public_var);
	}
}

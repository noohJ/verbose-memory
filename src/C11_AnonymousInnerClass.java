
public class C11_AnonymousInnerClass {
	/*
	  	# �͸� ���� Ŭ����
	  	
	  	 - Ŭ������ �޼��� ���ο��� �������ڸ��� �̸��� ���� �ʰ� �ٷ� ����ع����� ���
	  	 - �ٽ� ����� �� ����	  
	 */
	public static void main(String[] args) {
		test(new Fruit() {
			void printName() {
				System.out.println("ABC");
			}
			void makeJuice() {
				System.out.println("DEF");
			}
		);
	
	public static void test(Fruit fruit) {
		fruit.makeJuice();
		fruit.printName();
	}
	
}

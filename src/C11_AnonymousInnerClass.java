
public class C11_AnonymousInnerClass {
	/*
	  	# 익명 내부 클래스
	  	
	  	 - 클래스를 메서드 내부에서 정의하자마자 이름도 짓지 않고 바로 사용해버리는 방식
	  	 - 다시 사용할 수 없다	  
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

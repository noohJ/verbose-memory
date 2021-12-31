
public class C08_AccessModifier extends myobj.C08_DiffPackageClass {
	
	public void test() {
		
		// 다른 패키지에서 상속받아서 사용할 때 접근할 수 있는 자원: public, protected
		// 다른 패키지에서 상속받아서 사용할 때 접근할 수 없는 자원: default, private
		System.out.println(super._protected_var);
		System.out.println(super._public_var);
	}
	
	/*
	  	# 접근 제어자 (Access Modifier)
	  	
	  	 - 다른 클래스에서 해당 자원을 사용하려고 할 때 허용 범위를 설정한다
	  	 - 외부 class에는 public과 default밖에 사용할 수 없다.
	  	
	  	
	  	# 종류
	  	
	  	 - private   : 같은 클래스 내부에서만 접근할 수 있는 자원
	  	 - default   : 아무것도 안적은것. 같은 패키지 내부에서만 접근할 수 있는 자원
	  	 - protected : 다른 패키지에서 상속받은 클래스에서만 접근할 수 있는 자원
	  	 - public    : 다른 패키지에서도 자유롭게 접근할 수 있는 자원
	  	 
	  	# 접근제어자의 활용
	  	
	  	 - public으로 설정하지 않은 모든 자원들은 다른 패키지에서 노출되지 않는다.
	  	 - 해당 클래스를 다른 개발자가 가져다 사용할 때 잘못된 방식으로 사용하는것을
	  	   방지할 수 있다.
	 */
	
	
	public static void main(String[] args) {
		
		// 같은 패키지에서 접근할 수 있는 자원 : default, protected, public
		// 같은 패키지에서 접근할 수 없는 자원 : private
		C08_SamePackageClss i1 = new C08_SamePackageClss();
		
		System.out.println(i1._public_var);
		System.out.println(i1._protected_var);
		System.out.println(i1._defualt_var);
		
		// 다른 패키지에서 접근할 수 있는 자원 : public
		// 다른 패키지에서 접근할 수 없는 자원 : default, protected, private
		myobj.C08_DiffPackageClass i2 = new myobj.C08_DiffPackageClass();
		
		System.out.println(i2._public_var);
	}
}

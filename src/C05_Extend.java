ㄴ
public class C05_Extend {
	/*
	  	# 클래스 상속 (확장)
	  	
	  	 - 예전에 만들어두었떤 클래스를 물려받아서 사용하는 것
	  	 - 물려받은 후에는 해당 클래스를 마음대로 개조해서 사용할 수 있다.
	  	   마음대로 고쳐서 사용할 수 있다. (오버라이드)
	  	 - 자식 클래스에는 부모 클래스에 없는 새로운 기능을 추가할 수도 있따.
	  	 
	  	# 상속의 문법
	  	
	  	 - class 클래스명 extends 부모클래스명
	  	 - 생성자에서 반드시 가장 먼저 부모 클래스의 생성자(super())를 호출해야 한다.
	  	   (생략한다면 부모의 기본 생성자를 사용한다)
	  	 - 부모 클래스와 자식 클래스에 같은 이름의 자원이 있다면
	  	   super와 this로 명확하게 구분할 수 있다.  
	 
	 */
	public static void main(String[] args) {
		Person p1 = new Person("둘리", 6);
		Person p2 = new Person("철수", 8);
		FireFighter f1 = new FireFighter("민수", 28);
		Police popo1 = new Police();
		Police popo2 = new Police("박경찰", 35);
		
		/*
		   	# 업 캐스팅과 다운 캐스팅
		   	 
		   	 - 업 캐스팅 : 자식 클래스가 부모 클래스로 타입 캐스팅 되는 것
		  	 - 다운 캐스팅 : 부모 클래스가 자식 클래스로 타입 캐스팅되는 것 
		 */
		
		// 일반적인 경우, 다운 캐스팅은 불가능하다
//		Police popo3 = new Person("이순경", 21); 
		
		// 자식 클래스는 부모 클래스로 업캐스팅 될 수 있지만 업캐스팅 된 상태에서는 원래 기능을 잊어버린다.
		Person p3 = new FireFighter("김소방", 31);
		
		// 업캐스팅 되었던 자식 클래스는 다시 원래 자신의 클래스로 다운 캐스팅 할 수 있다.
//		FireFighter f3 = (FireFighter) p3 ;		
//		f3.dispatch("노량진 수산시장");
		
		//자식 타입을 요구하는 자리에 부모 타입 인스턴스가 들어갈 수 없다.
		popo2.duo(popo1);
//		popo2.duo(p1);
		System.out.println("------------------------------------------");
		p1.sayHi();
		p2.sayHi();
		System.out.println("------------------------------------------");		
		f1.sayHi();
		f1.dispatch("63빌딩");
		System.out.println("------------------------------------------");
		//부모 타입을 요구하는 자리에 자식 타입 인스턴스가 들어갈 수 있다.
		popo1.arrest(p1);
		popo1.arrest(p2);
		popo1.arrest(p3);
		popo1.arrest(f1);
		popo1.arrest(popo1);
		popo1.sayHi();
		popo2.sayHi();
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sayHi() {
		System.out.println("안녕? 내 이름은 " + name + "이야. 나이는 " + age + "살이야.");
	}
	
}

class FireFighter extends Person {

	public FireFighter(String name, int age) {
		super(name, age);
	}
	
	//부모에게 없는 새로운 기능을 추가해 사용하기
	void dispatch(String building) {
		System.out.println("소방관 "+ name + "씨는 " + building + "으로 불을 끄러 출동했습니다.");
	}
	
}

class Police extends Person{
	
	public Police() {
		super("김경찰", 25);
	}
	
	public Police(String name, int age) {
		super (name,age);
	}
	
	//Override: 짓밟다.
	@Override
	void sayHi() {
		System.out.println("영장 나왔습니다.");
	}
	public void arrest(Person suspect) {
		System.out.printf("%s 경찰관은 용의자 %s 씨를 체포했습니다.\n", super.name,suspect.name);
	}
	
	public void duo(Police police) {
		System.out.printf("%s 경찰관과 %s 경찰관은 함께 수사를 진행했습니다. \n", name, police.name);
	}
}
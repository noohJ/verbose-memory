import quiz.*;

public class A07_Import {
	
	/*
	  	 우리는 우리가 만들었던 다른 클래스의 기능들을 모두 가져와서 재사용 하 수 있다.
	  	 
	  	 # import
	  	  - 다른 패키지에 정의되어 있는 클래스를 가져와서 사용하기 위해서는 import가 필요하다.
	  	  - 해당 패키지의 모든 클래스를 불러오고 싶을 때는 *를 사용한다.
	  	  - 같은 패키지에 존재하는 클래스들은 import 없이도 가져다 사용할 수 있다.
	 */
	public static void main(String[] args) {
		// 같은 default package의 클래스들은 그냥 가져다 사용할 수 있다.
		A00_Hello.main(null);
		A01_Escape.main(null);
		A02_Variable.main(null);
		
		// 현재 A07_import는 default package에 위치해 있기 때문에
		// quiz 패키지의 클래스들은 가져다 사용하기 위해서는 import가 필요하다.
		A01_PrintQuiz.main(null);
		A02_VariableQuiz.main(null);
	}
}

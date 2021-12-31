package myobj.student;

public class C11_School {	
	
	public C11_School(){
		Student[] class1 = new Student[(int)(Math.random()*11+25)];
		Student[] class2 = new Student[(int)(Math.random()*11+25)];
		Student[] class3 = new Student[(int)(Math.random()*11+25)];		
		
		makeProgramClass(class1);
		makeMachineClass(class2);
		makeNetworkClass(class3);
		
		printClass(class1);
		printClass(class2);
		printClass(class3);
	}
	
	private void printClass(Student[] cls) {
		for (Student stu : cls) {
			stu.printGradeCard();
		}
	}
	
	private void makeProgramClass(Student[] cls) {
		for (int i = 0; i < cls.length; ++i) {
			cls[i] =  new ProgramStudent();
		}
	}
	
	private void makeMachineClass(Student[] cls) {
		for (int i = 0; i < cls.length; ++i) {
			cls[i] =  new ProgramStudent();
		}
	}
	
	private void makeNetworkClass(Student[] cls) {
		for (int i = 0; i < cls.length; ++i) {
			cls[i] =  new ProgramStudent();
		}
	}
	
	
	public static void main(String[] args) {
		new C11_School();
	}
}

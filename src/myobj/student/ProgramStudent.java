package myobj.student;

public class ProgramStudent extends Student {
	private static String[] SUBJECT_NAMES = {"KR", "EN", "MA", "PL", "OP", "DS"};
	
	public ProgramStudent() {
		super(SUBJECT_NAMES);
	}
		
	public static void main(String[] args) {
		new ProgramStudent().printGradeCard();
	}
}

package myobj.student;

public class MachineLearningStudent extends Student {
	private static String[] SUBJECT_NAMES = {"KR", "EN","MA", "ST", "ML"};
	
	public MachineLearningStudent() {	
		super(SUBJECT_NAMES);
	}
	public static void main(String[] args) {
		new MachineLearningStudent().printGradeCard();
	}
}

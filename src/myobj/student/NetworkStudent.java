package myobj.student;

public class NetworkStudent extends Student {
	private static String[] SUBJECT_NAMES = {"KR", "EN", "LINUX","NR","CCNA"};
	
	public NetworkStudent() {
		super(SUBJECT_NAMES);
	}
	
	public static void main(String[] args) {
		new NetworkStudent().printGradeCard();
	}
}

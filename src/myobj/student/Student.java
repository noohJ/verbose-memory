package myobj.student;

public abstract class Student {
	private static String[] familyName= {"梯","檜","夢","譆","薑","鬼","褻","彌","濰","歜","и","螃","憮","褐","掏","??","寰","歎","盟","瞪","薯陞","陴掙"};
	private static String[] firstName = {"團雖", "蕨滄", "雙??","щ煙", "錳??", "⑷雖","營摹","遽⑺","蝓??","憮惜","薑??","擎繹","錳??","蹂и","唳??"};	
	
	String name;
	Score score;
	
	private String[] subject_names;
	
	protected Student(String[] subject_names) {
		name = familyName[(int)(Math.random()*familyName.length)]
				+ firstName[(int)(Math.random()*firstName.length)];
		this.subject_names = subject_names;
		this.score = new Score(subject_names.length);
		
	}
	public void printGradeCard() {
		for (int i = 0, len = subject_names.length+2; i < len ; ++i) {
			if (i==0) {
				System.out.print("旨收收收收收收收收收");
			} else if (i == len-1) {
				System.out.print("收收收收收收收收收旬");
			}else {
				System.out.print("收收收收收收收收收");
			}
		}
		System.out.println();
		System.out.print("早檜葷\t");
		for (String subject : subject_names) {
			System.out.print(subject + "\t");
		}
		System.out.print("識м \t");
		System.out.println("ゎ敕\t早");
		
		for (int i = 0, len = subject_names.length+2; i < len ; ++i) {
			if (i==0) {
				System.out.print("曳收收收收收收收收收");
			} else if (i == len-1) {
				System.out.print("收收收收收收收收收朽");
			}else {
				System.out.print("收收收收收收收收收");
			}
		}
		System.out.println();
		System.out.print("早"+name + "\t");
		for (int i = 0; i < subject_names.length; ++i) {
			System.out.print(score.getScore(i) + "\t");
		}
		System.out.print(score.getSum() + "\t");
		System.out.printf("%.2f\t早\n",score.getAvg());
		for (int i = 0, len = subject_names.length+2; i < len ; ++i) {
			if (i==0) {
				System.out.print("曲收收收收收收收收收");
			} else if (i == len-1) {
				System.out.print("收收收收收收收收收旭");
				System.out.println();
			}else {
				System.out.print("收收收收收收收收收");
			}
		}

	}
//	public static void main(String[] args) {
//		new ProgramStudent.printGradeCard();
//	}
}

package myobj.student;

public abstract class Student {
	private static String[] familyName= {"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","Ȳ","��","��","��","��","����","����"};
	private static String[] firstName = {"����", "����", "��ȣ","���", "����", "����","�缱","����","��ȯ","����","����","��ö","����","����","����"};	
	
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
				System.out.print("��������������������");
			} else if (i == len-1) {
				System.out.print("��������������������");
			}else {
				System.out.print("������������������");
			}
		}
		System.out.println();
		System.out.print("���̸�\t");
		for (String subject : subject_names) {
			System.out.print(subject + "\t");
		}
		System.out.print("���� \t");
		System.out.println("���\t��");
		
		for (int i = 0, len = subject_names.length+2; i < len ; ++i) {
			if (i==0) {
				System.out.print("��������������������");
			} else if (i == len-1) {
				System.out.print("��������������������");
			}else {
				System.out.print("������������������");
			}
		}
		System.out.println();
		System.out.print("��"+name + "\t");
		for (int i = 0; i < subject_names.length; ++i) {
			System.out.print(score.getScore(i) + "\t");
		}
		System.out.print(score.getSum() + "\t");
		System.out.printf("%.2f\t��\n",score.getAvg());
		for (int i = 0, len = subject_names.length+2; i < len ; ++i) {
			if (i==0) {
				System.out.print("��������������������");
			} else if (i == len-1) {
				System.out.print("��������������������");
				System.out.println();
			}else {
				System.out.print("������������������");
			}
		}

	}
//	public static void main(String[] args) {
//		new ProgramStudent.printGradeCard();
//	}
}

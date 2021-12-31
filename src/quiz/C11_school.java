package quiz;

import java.util.Scanner;

public class C11_school {

	/*
	  	1. 프로그래밍 반 학생들은 각자의 국어, 영어, 수학, 프로그래밍 언어, 운영쳬제, 자료구조 점수가 있다.
	  	
	  	2. 네트워크 반 학생들은 각자의 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다.
	  	
	  	3. 머신러닝 반 학생들은 각자의 국어, 영어, 수학, 통계학, 머신러닝 점수가 있다.
	  	
	  	4. 각 반의 정원은 25 ~ 35명이다.
	  	
	  	5. 모든 학생의 기ㅘ목별 점수와 이름을 랜덤으로 생성한다.
	  	   학번은 중복없이 순차적으로 생성되어야 한다. (또는 중복없는 랜덤도 가능)
	  	   
	  	6. 각 학생의 성적표 메서드를 통해 "이름/학번/각 과목 점수/총점/평균점수"를 볼 수 있어야 한다.
	  
	 */
	//랜덤 한글 이름
	
	
	
	public static void main(String[] args) {
		boolean school_score = true;
		Scanner sc = new Scanner(System.in);

		int pst = (int)(Math.random()*11+25);
		String[][] Programming_students = new String[pst][];
		
		for (int index = 0 ; index < Programming_students.length;++index) {
			Programming_students[index] = Programming.Pro();
		}
		
		int nst = (int)(Math.random()*11+25);
		String[][] network_students = new String[nst][];
		
		for (int index = 0 ; index < network_students.length;++index) {
			network_students[index] = Network.Net();
		}
		
		int mst = (int)(Math.random()*11+25);
		String[][] Machine_learning_students = new String[mst][];
		
		for (int index = 0 ; index < Machine_learning_students.length;++index) {
			Machine_learning_students[index] = Machine_learning.Ml();
		}
		

		while(school_score) {
			System.out.println("어느 반 학생의 점수를 보시겠습니까>\n(1. 프로그래밍 반 2. 네트워크 반 3. 머신러닝 반)");
			int subnum = sc.nextInt();
			if (subnum == 1) {
				System.out.println("------------------------------------------------------------------------------");
				String[] all = new String[]{"이름","학번","국어","영어","수학","PL","운영체제","자료구조","총점","평균점수"};
				for (int i = 0; i < 10; ++i) {
					System.out.printf("%s\t",all[i]);				
				}
				System.out.println();
				System.out.println("------------------------------------------------------------------------------");
				for (int i = 0 ; i < pst;++i) {
					for (int j = 0; j<10;++j) {
						System.out.printf("%s\t",Programming_students[i][j]);
					}
					System.out.println();
				}
			} else if (subnum == 2) {
				System.out.println("----------------------------------------------------------------------");
				String[] all = new String[]{"이름","학번","국어","영어","리눅스","네트워크","CCNA","총점","평균점수"};
				for (int i = 0; i < 9; ++i) {
					System.out.printf("%s\t",all[i]);				
				}
				System.out.println();
				System.out.println("----------------------------------------------------------------------");
				for (int i = 0 ; i < nst;++i) {
					for (int j = 0; j<9;++j) {
						System.out.printf("%s\t",network_students[i][j]);
					}
					System.out.println();
				}
			} else if (subnum ==3) {
				System.out.println("----------------------------------------------------------------------");
				String[] all = new String[]{"이름","학번","국어","영어","수학","통계학","머신러닝","총점","평균점수"};
				for (int i = 0; i < 9; ++i) {
					System.out.printf("%s\t",all[i]);				
				}
				System.out.println();
				System.out.println("----------------------------------------------------------------------");
				for (int i = 0 ; i < pst;++i) {
					for (int j = 0; j < 9;++j) {
						System.out.printf("%s\t",Machine_learning_students[i][j]);
					}
					System.out.println();
				}
			}
			System.out.println("");
			System.out.println("다른 반의 점수도 보시겠습니까? (1. 예 2.아니요)");
			int chk = sc.nextInt();
			if(chk == 2) {
				System.out.println("시스템을 종료 합니다.");
				school_score = false;
			}
		}		
	}
}
abstract class Subject{
	String [] sub = new String[]{};
	
	static int studentId = 1001;
	protected static String RandomName() {
		String name ="";
		String[] last_name = new String[]{"김","이","박","최","정","강","조","윤","장","임","한","오","서","신","권","황","안","송","류","전"};
		String[] first_name = new String[] {"가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다",
		        "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미", "민", "바", "박",
		        "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소", "솔", "수", "숙", "순",
		        "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요", "용", "우", "원", "월", "위",
		        "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전", "정", "제", "조", "종", "주", "준",
		        "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택", "판", "하", "한", "해", "혁", "현", "형",
		        "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부", "림", "봉", "혼", "황", "량", "린", "을", "비",
		        "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱", "휴", "언", "령", "섬", "들", "견", "추", "걸", "삼",
		        "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식", "란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠",
		        "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개", "롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련"};
		int random_last = (int)(Math.random()*last_name.length);
		int frandom_first = (int)(Math.random()*first_name.length);
		int srandom_first = (int)(Math.random()*first_name.length);
		return name =last_name[random_last]+first_name[frandom_first]+first_name[srandom_first];
	}
	
}
class Programming extends Subject{
	public static String[] Pro() {
		int total = 0;
		String[] sub = new String[10];
		sub[0] = RandomName();
		sub[1] = Integer.toString(studentId);
		++studentId;
		for (int index = 2;index < 8 ;++index) {
			int random_score= (int)(Math.random()*101);
			sub[index]=Integer.toString(random_score)+"점";
			total += random_score;
		}
		sub[8] = Integer.toString(total)+"점";
		sub[9] = Integer.toString(total/6)+"점";
		return sub;
	}
}
class Network extends Subject{
	public static String[] Net() {
		int total = 0;
		String[] sub = new String[9];
		sub[0] = RandomName();
		sub[1] = Integer.toString(studentId);
		++studentId;
		for (int index = 2;index < 7 ;++index) {
			int random_score= (int)(Math.random()*101);
			sub[index]=Integer.toString(random_score)+"점";
			total += random_score;
		}
		sub[7] = Integer.toString(total)+"점";
		sub[8] = Integer.toString(total/5)+"점";
		return sub;
	}
}
class Machine_learning extends Subject{
	public static String[] Ml() {
		int total = 0;
		String[] sub = new String[9];
		sub[0] = RandomName();
		sub[1] = Integer.toString(studentId);
		++studentId;
		for (int index = 2;index < 7 ;++index) {
			int random_score= (int)(Math.random()*101);
			sub[index]=Integer.toString(random_score)+"점";
			total += random_score;
		}
		sub[7] = Integer.toString(total)+"점";
		sub[8] = Integer.toString(total/5)+"점";
		return sub;
	}
}

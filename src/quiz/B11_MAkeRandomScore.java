package quiz;

public class B11_MAkeRandomScore {
	public static void main(String[] args) {
		int[] score = new int[100];
		int max, min, total;
		total = 0;
		max = 0;
		min = 100;

		for(int i = 0; i < score.length; ++i) {
			score[i] = (int)(Math.random() * 101 );
			
			max = max < score[i] ? score[i] : max;
//			if (score[i] > max) {
//				max = score[i];
//			}
			
			min = min > score[i] ? score[i] : min;
//			if (score[i] < min) {
//				min = score[i];
//			}
		}
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		for(int i = 1; i <= score.length; ++i) {
			if (i%5==1) {
				System.out.print("��");
			}
			System.out.printf(" %3d ��° �л��� ���� : %-3d  ",i, score[i-1]);
			if (i%5!=0) {
				System.out.print("");
			}
			if (i%5==0) {
				System.out.print("��\n");
			}
		}
		
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		
		for(int i = 0; i < score.length; ++i) {
			total +=score[i];
		}
		
		System.out.printf(" �л�����\t��� ���� : %3d��\n",total/score.length);
		System.out.printf(" \t���� ���� : %3d��\n",min);
		System.out.printf(" \t�ְ� ���� : %3d��",max );
	}
	
}

package myobj.student;

public class Score {
	
	int[] scores;
	
	public Score(int numOfSubject) {
		this.scores = new int[numOfSubject];		
		random();
	}
	
	private void random() {
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int)(Math.random()*101);
		}
	}
	
	public double getAvg() {
		return getSum()/ (double) scores.length;
	}
	
	public int getSum() {
		int sum = 0;
		/* 
		 *  # ���� for��(forEach)
		 *  
		 *  ���� ���� �迭 ���� 0 ���� ������ ����
		 *  ex)  scores �迭���� int score�� �ϳ��� ����
		 *       scores[0] score [1] score[2] score[3]
		 */
		for (int score : scores) {
			sum+=score;
		}
		return sum;
	}
	
	public int getScore(int subject) {
		return scores[subject];
	}

}

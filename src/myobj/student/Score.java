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
		 *  # 향상된 for문(forEach)
		 *  
		 *  조건 안의 배열 값이 0 부터 끝까지 돌음
		 *  ex)  scores 배열안의 int score을 하나씩 불음
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

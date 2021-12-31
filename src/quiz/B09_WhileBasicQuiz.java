package quiz;

public class B09_WhileBasicQuiz {
	
	public static void main(String[] args) {
		int Q_1 , Q_2, total, count, Q_3, total_3, Q_4, total_4;
		Q_1 = 1;
		total = 0;
		Q_2 = 400;
		count = 1;
		Q_3 = 1;
		total_3 = 0;
		Q_4 = 1;
		total_4 =2;
		
				
		while (Q_1 <= 1000) {
			if(Q_1 % 3 == 0) {
				total += Q_1;
			}
			++Q_1;
		}
		System.out.print(total);
		System.out.println();
		
		while (Q_2 >= 201) {
			System.out.print(Q_2 +" ");
			if (count % 10 == 0) {
				System.out.println();
			}
			--Q_2;
			++count;
		}
		
		while (Q_3 <= 200) {
			if ((Q_3 % 2 != 0)&&(Q_3 % 3 !=0)) {
				total_3 +=Q_3;
			}
			++Q_3;
		}
		System.out.print(total_3);
		System.out.println();
		
		while (Q_4 <= 200) {
			boolean prime =true;
			int num = 2;
			
			if (Q_4 > 2) {
				while (num < Q_4) {
					if (Q_4 % num ==0) {
						prime = false;
						break;
					}
					++num;
				}
				if (prime == true) {
					total_4+=Q_4;
				}
			}
			++Q_4;
		}
		System.out.print(total_4);
	}

}

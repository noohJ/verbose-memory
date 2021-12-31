package quiz;

public class B06_ForBasicQuiz2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int index = 20; index <= 40 ; ++index ) {
			System.out.println(index);
		}
		System.out.println("-------------------------------------");
		for (int index = 1; index <= 100; ++index) {
			System.out.print(index+" ");
			if (index %10 ==0) {
				System.out.print('\n');
			}
		}
		System.out.println("-------------------------------------");
		for (int index = 50; index <=80 ; ++index) {
			if (index % 3 ==0) {
				System.out.print(index + " ");
			}
		}
		System.out.print('\n');
		System.out.println("-------------------------------------");
		for (int index = 200, count =1; index >= 100; --index, ++count) {
			System.out.print(index+" ");
			if (count %5 ==0) {
				System.out.print('\n');
			}
		}
		System.out.print('\n');
		System.out.println("-------------------------------------");
		for (int index = 1; index <= 55; ++index) {
			sum +=index;
		} System.out.println(sum);
	}
}

package quiz;

public class B08_Gugudan {
	public static void main(String[] args) {
		
		for(int dan = 2 ; dan <= 9; ++dan ) {
			System.out.printf("%d´Ü: ", dan);
			
			for (int gob = 1; gob <= 9; ++gob) {
				System.out.printf(" %dx%d=%-2s ",dan,gob,dan*gob);		
			}
			System.out.println();
		}
		for(int gob = 1 ; gob <= 9; ++gob ) {
			if (gob == 1) {
				for (int dan_2 = 2; dan_2 <= 9; ++dan_2) {
					System.out.printf("%d´Ü\t",dan_2);
				}
				System.out.println();
			}
			for(int dan = 2; dan <=9; ++dan) {
				System.out.printf("%dx%d=%-2d  ",dan,gob,dan*gob);
			}
			System.out.println();
		}
	}
}

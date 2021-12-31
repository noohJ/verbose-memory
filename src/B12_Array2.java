
public class B12_Array2 {
	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 5};
		int[][] arrs = {
				{3,3,3,}, number, {55, 56, 57, 58, 59}, number
		};
		
		System.out.println(arrs[0]);
		System.out.println(arrs[1]);
		System.out.println(arrs[2]);
		System.out.println(arrs[3]);
		
		System.out.println(arrs[0][2]);
		System.out.println(arrs[1][3]);
		System.out.println(arrs[2][0]);
		
		arrs[3][0] = 99;
		System.out.println(number[0]);
		
		// n차원 배열은 n중 반복문으로 모두 탐색할 수 있다.
		for (int i = 0; i < arrs.length; ++i) {
			
			System.out.println(arrs[i]);
			
			for (int j = 0; j < arrs[i].length; ++j) {
				System.out.printf("arrs[%d][%d]: %d\n",i, j, arrs[i][j]);
			}
		}
		
		// 다차원 배열 응요하기
		int[][][] tetris = {
				{
					{0, 1, 1},
					{0, 0, 1},
					{0, 0, 1}
				},
				{
					{0, 0, 0, 1},
					{0, 0, 0, 1},
					{0, 0, 0, 1},
					{0, 0, 0, 1}
				},
		};
		
		for (int i = 0; i < tetris.length; ++i) {
			System.out.println("block" + i);
			for (int j = 0; j < tetris[i].length; ++j) {
				for (int k = 0; k < tetris[i][j].length; ++k) {
					if(tetris[i][j][k] == 0) {
						System.out.print("□ ");
					} else if (tetris[i][j][k] == 1) {
						System.out.print("■ ");
					}
				}
				System.out.println();
			}
		}
	}
}

package quiz;

public class B10_TempPassword {
	public static void main(String[] args) {
//		int i = 0;
//		while (i < 6) {
//			char a = (char)(Math.random() * 10 + '0');
//			char b = (char)(Math.random() * 26 + 'A');
//			int c =(int)(Math.random() * 2 + 1);
//
//			if (c ==1 ) {
//				System.out.print(a);
//				++i;
//			} else {
//				System.out.print(b);
//				++i;
//			}
//			}
		
		int type = (int)(Math.random() * 64);
		System.out.println(type);
//		
//		// 010010 >> 1 -> 001001  화살표 방향으로 1칸 밀기
//		
//		String password = "";
//		int i =0;
//		while (i++ < 6) {
//			switch (type & 1) {
//			case 0:
//				password += (char)(Math.random() * 26+'A');
//				break;
//			case 1:
//				password += (char)(Math.random() * 10+'0');
//				break;
//			}
//			type >>= 1;
//		}
//		System.out.println(password);
	}
}

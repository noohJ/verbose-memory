package quiz;

import java.util.Arrays;

public class C02_exOOP {
	public static void main(String[] args) {
		hamburger hamburger1 = new hamburger();
		
		hamburger1.shrimpPlus();
		
		System.out.println(Arrays.toString(hamburger1.ingredients));
		
	}
}
class hamburger {
	String[] ingredients = new String[] {"��", "�Ұ����Ƽ", "��Ŭ", "�����", "����", "�ҽ�"};
	int price = 3900;
	int weight = 188; 
	int kcal = 476;
	String[] additional = new String[5];
	
	
	void Plus() {
		price += 500;
		kcal += 125;		
		weight += 25;
		for (int i = 0 ; i < additional.length; ++i) {
			if (additional[i] == null) {
				additional[i] = "������";
				break;
			}
		}
	}
	
	void shrimpPlus() {
		weight += 65;
		price += 900;
		kcal += 68;
		for (int i = 0 ; i < additional.length; ++i) {
			if (additional[i] == null) {
				additional[i] = "����";
				break;
			}
		}
		
	}
	
}
class shrimp{
	int plusWeight = 65;
	int plusPrice = 900;
	int plusKcal = 68;
}

class bacon{
	int plusWeight = 25;
	int plusPrice = 500;
	int plusKcal = 125;
}
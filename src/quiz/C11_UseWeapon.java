package quiz;
import java.util.Scanner;

import myobj.Weapon.*;

public class C11_UseWeapon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("무기를 선택 해주세요 \n 1.칼\t2.단검\t3.창");
		
		int Weapon_choice =sc.nextInt();
		boolean test = true;
		if (Weapon_choice == 1) {
			System.out.println("칼을 선택하였습니다. ");
			Sword sword = new Sword();
			while(test) {
				System.out.println("1. 강화하기\t2. 실험하기\t3. 그만두기");
				int choice = sc.nextInt();
				if (choice == 1) {
					sword.upgrade();					
					sword.print();
				}else if (choice == 2) {
					sword.attack();
					sword.print();
				}else if (choice == 3) {
					sword.print();
					System.out.println("강화를 그만둡니다.");
					test = false;
				}
			}
		}else if (Weapon_choice == 2) {
			System.out.println("단검을 선택하였습니다. ");
			Dagger dagger = new Dagger();
			while(test) {
				System.out.println("1. 강화하기\t2. 실험하기\t3. 그만두기");
				int choice = sc.nextInt();
				if (choice == 1) {
					dagger.upgrade();					
					dagger.print();
				}else if (choice == 2) {
					dagger.attack();
					dagger.print();
				}else if (choice == 3) {
					dagger.print();
					System.out.println("강화를 그만둡니다.");
					test = false;
				}
			}
		}else if (Weapon_choice == 3) {
			System.out.println("창을 선택하였습니다. ");
			Spear spear = new Spear();
			while(test) {
				System.out.println("1. 강화하기\t2. 실험하기\t3. 그만두기");
				int choice = sc.nextInt();
				if (choice == 1) {
					spear.upgrade();					
					spear.print();
				}else if (choice == 2) {
					spear.attack();
					spear.print();
				}else if (choice == 3) {
					spear.print();
					System.out.println("강화를 그만둡니다.");
					test = false;
				}
			}
		}
	}
}

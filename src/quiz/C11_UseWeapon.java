package quiz;
import java.util.Scanner;

import myobj.Weapon.*;

public class C11_UseWeapon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���⸦ ���� ���ּ��� \n 1.Į\t2.�ܰ�\t3.â");
		
		int Weapon_choice =sc.nextInt();
		boolean test = true;
		if (Weapon_choice == 1) {
			System.out.println("Į�� �����Ͽ����ϴ�. ");
			Sword sword = new Sword();
			while(test) {
				System.out.println("1. ��ȭ�ϱ�\t2. �����ϱ�\t3. �׸��α�");
				int choice = sc.nextInt();
				if (choice == 1) {
					sword.upgrade();					
					sword.print();
				}else if (choice == 2) {
					sword.attack();
					sword.print();
				}else if (choice == 3) {
					sword.print();
					System.out.println("��ȭ�� �׸��Ӵϴ�.");
					test = false;
				}
			}
		}else if (Weapon_choice == 2) {
			System.out.println("�ܰ��� �����Ͽ����ϴ�. ");
			Dagger dagger = new Dagger();
			while(test) {
				System.out.println("1. ��ȭ�ϱ�\t2. �����ϱ�\t3. �׸��α�");
				int choice = sc.nextInt();
				if (choice == 1) {
					dagger.upgrade();					
					dagger.print();
				}else if (choice == 2) {
					dagger.attack();
					dagger.print();
				}else if (choice == 3) {
					dagger.print();
					System.out.println("��ȭ�� �׸��Ӵϴ�.");
					test = false;
				}
			}
		}else if (Weapon_choice == 3) {
			System.out.println("â�� �����Ͽ����ϴ�. ");
			Spear spear = new Spear();
			while(test) {
				System.out.println("1. ��ȭ�ϱ�\t2. �����ϱ�\t3. �׸��α�");
				int choice = sc.nextInt();
				if (choice == 1) {
					spear.upgrade();					
					spear.print();
				}else if (choice == 2) {
					spear.attack();
					spear.print();
				}else if (choice == 3) {
					spear.print();
					System.out.println("��ȭ�� �׸��Ӵϴ�.");
					test = false;
				}
			}
		}
	}
}

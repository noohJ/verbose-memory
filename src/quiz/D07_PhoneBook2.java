package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class D07_PhoneBook2 {
	/*
 	 # HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
 	 
 	  1. [�׷�/��ȭ��ȣ/��������]�� �����ؾ� �Ѵ�.
 	  (�̸� / ���� /����)
 	  2. �׷���� Ű������ ������ �ش� �׸��� HashMap�� ���� �� �ִ�.
 	  3. ���� HashMap�� ��ȭ��ȣ�� ������ �� ����� ���������� ���� �� �ִ�.
 	 
 	 # �����ؾ� �� �޼���
 	 
 	  1. ���ο� �׷��� �߰��ϴ¸޼���
 	  2. �׷쿡 ���ο� ��ȭ��ȣ �� ���������� ����ϴ� �޼���
 	  3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
 	  4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
 	  5. ��ϵ� ��� ��ȣ�� ���ϴ� �׸� �������� ����/������������ ����ϴ� �޼���
*/
	
	
	public static HashMap<String,ArrayList<String>>address_book = new HashMap<>();
	public static HashMap<String,ArrayList<String>>infor = new HashMap<>();
//	public static HashSet<Integer> phone_num = new HashSet<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Information> Informations = new ArrayList<>();
		ArrayList<MoreInformatin> MInformations = new ArrayList<>();
		Informations.add(new Information("�б�", "01012345673", "Ȳ�Ѱ�")); 
		Informations.add(new Information("����", "01021462246", "ȫ��"));
		Informations.add(new Information("�б�", "01074124742", "����ٿ�"));
		Informations.add(new Information("����", "01012344522", "ȫ�̸�"));
		Informations.add(new Information("����", "01015124778", "������"));
		Informations.add(new Information("�б�", "01041234894", "�����Ѱ�"));
		Informations.add(new Information("����", "01051234786", "�̹���"));
		Informations.add(new Information("�п�", "01095452142", "����ȫ"));
		Informations.add(new Information("�б�", "01035480101", "��������"));
		Informations.add(new Information("����", "01010341415", "������"));
		Informations.add(new Information("�б�", "01089411211", "�����"));
		Informations.add(new Information("�п�", "01021510334", "�Ǵٿ�"));
		Informations.add(new Information("�п�", "01085123547", "�߹���"));
		Informations.add(new Information("�п�", "01003215495", "������"));
//		(��ȣ / ���� /����/����)
		MInformations.add(new MoreInformatin("01012345673", "28", "����", "ģ��"));
		MInformations.add(new MoreInformatin("01021462246", "21", "����", "����"));
		MInformations.add(new MoreInformatin("01074124742", "31", "����", "����"));
		MInformations.add(new MoreInformatin("01012344522", "28", "����", "ģ��"));
		MInformations.add(new MoreInformatin("01015124778", "34", "����", "����"));
		MInformations.add(new MoreInformatin("01041234894", "41", "����", "����"));
		MInformations.add(new MoreInformatin("01051234786", "19", "����", "����"));
		MInformations.add(new MoreInformatin("01095452142", "34", "����", "����"));
		MInformations.add(new MoreInformatin("01035480101", "51", "����", "���"));
		MInformations.add(new MoreInformatin("01010341415", "11", "����", "����"));
		MInformations.add(new MoreInformatin("01089411211", "21", "����", "����"));
		MInformations.add(new MoreInformatin("01021510334", "26", "����", "ģ��"));
		MInformations.add(new MoreInformatin("01085123547", "22", "����", "�Ĺ�"));
		MInformations.add(new MoreInformatin("01003215495", "27", "����", "ģ��"));
		while(true) {
			System.out.println("�̿��� ����� �����ϼ���.");
			System.out.println("1 . ��ü ��ȣ ����/ 2.�׷� �˻� /3. ��ȣ ã�� /4. �̸� ã�� /5. �� �׷� �߰� �߰� /6. ��ȭ��ȣ �߰�");
			int function = sc.nextInt();
	
			if (function == 1) {
				System.out.println("���� ����");
				System.out.println("1. �׷� ���� 2.��ȣ ����");
				int sort = sc.nextInt();
				if (sort == 1) {
					Collections.sort(Informations, new GroupSort());
					System.out.println("���Ĺ�� ���� (1. �������� 2.��������)");
					int sortingMethod = sc.nextInt();
					if(sortingMethod == 1) {
						for (Information infor:Informations) {
							System.out.println(infor);
						}

					}else {
						Collections.reverse(Informations);
						for (Information infor:Informations) {
							System.out.println(infor);
						}
					}
				}else if (sort == 2) {
					Collections.sort(Informations, new NumSort());
					System.out.println("���Ĺ�� ���� (1. �������� 2.��������)");
					int sortingMethod = sc.nextInt();
					if(sortingMethod == 1) {
						for (Information infor:Informations) {
							System.out.println(infor);
						}
					}else {
						Collections.reverse(Informations);
						for (Information infor:Informations) {
							System.out.println(infor);
						}
					}
				}
								
			}else if (function == 2) {
				for (String key : address_book.keySet()) {
					System.out.print(" "+key);
				}
				System.out.println("");
				System.out.println("�˻��� �׷��� �Է� �ϼ���");
				String groupName = sc.next();
				System.out.println(address_book.get(groupName));
				System.out.println("�� ���� ����");
				System.out.println("��ȣ�Է� >");
				String phnum = sc.next();
				System.out.println(infor.get(phnum));
			}else if (function == 3) {
				System.out.println("�˻��� ��ȣ �Է� �ϼ���.");
				String chknum = sc.next();				
				for (String key : infor.keySet()) {
					if (key.contains(chknum)) {
						System.out.println(key + " : " + infor.get(key));
					}
				}				
			}else if (function == 4) {
				System.out.println("�˻��� �̸��� �Է� �ϼ���.");
				String chknam = sc.next();
				for (ArrayList<String> value : infor.values()) {

					if (value.get(0).contains(chknam)) {
						System.out.println(value);
					}
				}
			}else if (function == 5) {
				System.out.println("�߰��� �׷��� �Է� �ϼ���.");
				String grnm = sc.next();
				Informations.add(new Information(grnm));
				
			}else if (function == 6) {
				System.out.println("����� ��ȣ�� �Է��ϼ���(�׷� / ��ȣ / �̸�)");
				String grn = sc.next();
				String num = sc.next();
				String name = sc.next();
				Informations.add(new Information(grn, num, name));
				System.out.println("�� ������ ��� �Ͻðڽ��ϱ�? \n(1. �� 2.�ƴϿ�) ");
				int chk = sc.nextInt();
				if (chk == 1) {
					System.out.println("�� ������ ����� �ּ��� \n( ���� / ����(����/����) / ����)");
					String age = sc.next();
					String gender = sc.next();
					String relationship = sc.next();
					MInformations.add(new MoreInformatin(num, age, gender, relationship));
				}
			}
		}
		
	}
}

class MoreInformatin{
	String group,name;
	String num, gender;
	String age, relationship;
	public MoreInformatin(String num, String age, String gender, String relationship) {
		this.age = age;
		this.num = num;
		this.gender = gender;
		this.relationship = relationship;
		
		D07_PhoneBook2.infor.get(num).add(age);
		D07_PhoneBook2.infor.get(num).add(gender);
		D07_PhoneBook2.infor.get(num).add(relationship);
		D07_PhoneBook2.infor.get(num).add(num);
		
	}
}

class Information {
	String group,name;
	String num, gender;
	String age, relationship;
	public Information (String group) {

		this.group = group;
		D07_PhoneBook2.address_book.put(group, new ArrayList<String>());
		System.out.println("�׷�� "+ group +" ��/�� �߰� �Ǿ����ϴ�.");
	}
	public Information(String group, String num, String name) {
		this.group = group;
		this.name = name;
		this.num = num;
		boolean group_chek = false;
		boolean num_check = false;
//		D07_PhoneBook2.address_book.put(group, null);
		for (String key : D07_PhoneBook2.address_book.keySet()) {
			if (key != group) {
				continue;
			}else if (key == group) {
				group_chek=true;
				break;
			}
		}
		if (group_chek == false) {
			D07_PhoneBook2.address_book.put(group, new ArrayList<String>());
			group_chek = true;
		}
		if (group_chek == true) {
			if (D07_PhoneBook2.address_book.get(group)==null) {
				D07_PhoneBook2.address_book.put(group, new ArrayList<String>()); 
				D07_PhoneBook2.address_book.get(group).add(num+" "+name);
			}else {
				D07_PhoneBook2.address_book.get(group).add(num+" "+name);				
			}
		}
		
		for (String key : D07_PhoneBook2.infor.keySet()) {
			if (key != num) {
				continue;
			}else if (key == num) {
				num_check=true;
				break;
			}
		}
		if (num_check == false) {
			D07_PhoneBook2.infor.put(num, new ArrayList<String>());
			num_check = true;
		}else {
			System.out.println("�̹� ��ϵ� ��ȣ �Դϴ�.");
		}
		if (num_check = true) {
			if (D07_PhoneBook2.infor.get(group)==null) {
				D07_PhoneBook2.infor.put(num, new ArrayList<String>()); 
				D07_PhoneBook2.infor.get(num).add(name);
			}
		}
		
	}
//	(��ȣ / ���� /����/����)
	
	public String toString() {
		return String.format("[%s / %s / %s]", group,num,name);
	}
}
class GroupSort implements Comparator <Information>{
	@Override
	public int compare(Information o1, Information o2) {

		return o1.group.compareTo(o2.group);
	}
}
class NumSort implements Comparator <Information>{
	@Override
	public int compare(Information o1, Information o2) {

		return o1.num.compareTo(o2.num);
	}
}

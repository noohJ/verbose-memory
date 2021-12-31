package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class D07_PhoneBook2 {
	/*
 	 # HashMap을 이용해 전화번호부를 구현해보세요
 	 
 	  1. [그룹/전화번호/개인정보]를 저장해야 한다.
 	  (이름 / 나이 /성별)
 	  2. 그룹명을 키값으로 넣으면 해당 그릅의 HashMap을 꺼낼 수 있다.
 	  3. 꺼낸 HashMap에 전화번호를 넣으면 그 사람의 개인정보를 꺼낼 수 있다.
 	 
 	 # 구현해야 할 메서드
 	 
 	  1. 새로운 그룹을 추가하는메서드
 	  2. 그룹에 새로운 전화번호 및 개인정보를 등록하는 메서드
 	  3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
 	  4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
 	  5. 등록된 모든 번호를 원하는 항목 기준으로 오름/내림차순으로 출력하는 메서드
*/
	
	
	public static HashMap<String,ArrayList<String>>address_book = new HashMap<>();
	public static HashMap<String,ArrayList<String>>infor = new HashMap<>();
//	public static HashSet<Integer> phone_num = new HashSet<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Information> Informations = new ArrayList<>();
		ArrayList<MoreInformatin> MInformations = new ArrayList<>();
		Informations.add(new Information("학교", "01012345673", "황한결")); 
		Informations.add(new Information("병원", "01021462246", "홍샘"));
		Informations.add(new Information("학교", "01074124742", "사공다운"));
		Informations.add(new Information("병원", "01012344522", "홍미르"));
		Informations.add(new Information("병원", "01015124778", "정으뜸"));
		Informations.add(new Information("학교", "01041234894", "제갈한결"));
		Informations.add(new Information("병원", "01051234786", "이믿음"));
		Informations.add(new Information("학원", "01095452142", "장의홍"));
		Informations.add(new Information("학교", "01035480101", "강나라우람"));
		Informations.add(new Information("병원", "01010341415", "설나길"));
		Informations.add(new Information("학교", "01089411211", "복우람"));
		Informations.add(new Information("학원", "01021510334", "권다운"));
		Informations.add(new Information("학원", "01085123547", "추믿음"));
		Informations.add(new Information("학원", "01003215495", "전힘찬"));
//		(번호 / 나이 /성별/관계)
		MInformations.add(new MoreInformatin("01012345673", "28", "남자", "친구"));
		MInformations.add(new MoreInformatin("01021462246", "21", "여자", "동생"));
		MInformations.add(new MoreInformatin("01074124742", "31", "남자", "선배"));
		MInformations.add(new MoreInformatin("01012344522", "28", "여자", "친구"));
		MInformations.add(new MoreInformatin("01015124778", "34", "남자", "선배"));
		MInformations.add(new MoreInformatin("01041234894", "41", "남자", "삼촌"));
		MInformations.add(new MoreInformatin("01051234786", "19", "여자", "동생"));
		MInformations.add(new MoreInformatin("01095452142", "34", "여자", "선배"));
		MInformations.add(new MoreInformatin("01035480101", "51", "남자", "상사"));
		MInformations.add(new MoreInformatin("01010341415", "11", "여자", "동생"));
		MInformations.add(new MoreInformatin("01089411211", "21", "남자", "동생"));
		MInformations.add(new MoreInformatin("01021510334", "26", "남자", "친구"));
		MInformations.add(new MoreInformatin("01085123547", "22", "여자", "후배"));
		MInformations.add(new MoreInformatin("01003215495", "27", "여자", "친구"));
		while(true) {
			System.out.println("이용할 기능을 선택하세요.");
			System.out.println("1 . 전체 번호 보기/ 2.그룹 검색 /3. 번호 찾기 /4. 이름 찾기 /5. 새 그룹 추가 추가 /6. 전화번호 추가");
			int function = sc.nextInt();
	
			if (function == 1) {
				System.out.println("정렬 선택");
				System.out.println("1. 그룹 정렬 2.번호 정렬");
				int sort = sc.nextInt();
				if (sort == 1) {
					Collections.sort(Informations, new GroupSort());
					System.out.println("정렬방식 선택 (1. 오름차순 2.내림차순)");
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
					System.out.println("정렬방식 선택 (1. 오름차순 2.내림차순)");
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
				System.out.println("검색할 그룹을 입력 하세요");
				String groupName = sc.next();
				System.out.println(address_book.get(groupName));
				System.out.println("상세 정보 보기");
				System.out.println("번호입력 >");
				String phnum = sc.next();
				System.out.println(infor.get(phnum));
			}else if (function == 3) {
				System.out.println("검색할 번호 입력 하세요.");
				String chknum = sc.next();				
				for (String key : infor.keySet()) {
					if (key.contains(chknum)) {
						System.out.println(key + " : " + infor.get(key));
					}
				}				
			}else if (function == 4) {
				System.out.println("검색할 이름을 입력 하세요.");
				String chknam = sc.next();
				for (ArrayList<String> value : infor.values()) {

					if (value.get(0).contains(chknam)) {
						System.out.println(value);
					}
				}
			}else if (function == 5) {
				System.out.println("추가할 그룹을 입력 하세요.");
				String grnm = sc.next();
				Informations.add(new Information(grnm));
				
			}else if (function == 6) {
				System.out.println("등록할 번호를 입력하세요(그룹 / 번호 / 이름)");
				String grn = sc.next();
				String num = sc.next();
				String name = sc.next();
				Informations.add(new Information(grn, num, name));
				System.out.println("상세 정보도 등록 하시겠습니까? \n(1. 예 2.아니요) ");
				int chk = sc.nextInt();
				if (chk == 1) {
					System.out.println("상세 정보를 등록해 주세요 \n( 나이 / 성별(남자/여자) / 관계)");
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
		System.out.println("그룹명 "+ group +" 이/가 추가 되었습니다.");
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
			System.out.println("이미 등록되 번호 입니다.");
		}
		if (num_check = true) {
			if (D07_PhoneBook2.infor.get(group)==null) {
				D07_PhoneBook2.infor.put(num, new ArrayList<String>()); 
				D07_PhoneBook2.infor.get(num).add(name);
			}
		}
		
	}
//	(번호 / 나이 /성별/관계)
	
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

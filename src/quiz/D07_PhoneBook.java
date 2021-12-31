package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D07_PhoneBook {
	HashMap<String, HashMap<String, Info>> phonebook = new HashMap<>();
	
	
	static HashMap<String, Comparator>comparators = new HashMap<>();
	//static을 초기화 할때 사용
	static {
		comparators.put("name", new NameComparator());
		comparators.put("group", new GroupComparator());
		comparators.put("age", new AgeComparator());
		comparators.put("ph", new PhComparator());
	}
	private static class NameComparator implements Comparator<Info>{
		@Override
		public int compare(Info o1, Info o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	private static class GroupComparator implements Comparator<Info>{
		@Override
		public int compare(Info o1, Info o2) {
			return o1.group.compareTo(o2.group);
		}
	}
	private static class AgeComparator implements Comparator<Info>{
		@Override
		public int compare(Info o1, Info o2) {
			return o1.age.compareTo(o2.age);
		}
	}
	private static class PhComparator implements Comparator<Info>{
		@Override
		public int compare(Info o1, Info o2) {
			return o1.ph.compareTo(o2.ph);
		}
	}
	public void addGroup(String groupName) {
		if (!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap<>());		
		}else {
			System.out.println("이미 존재하는 그룹입니다!");
		}
	}
	
	public void addInfo(Info info) {
		HashMap<String, Info> groupMap = phonebook.get(info.group);
		
		if (groupMap == null) {
			System.out.println("존재하지 않는 그룹입니다!");
			return;
		}
		if (groupMap.containsKey(info.ph)){
			System.out.println("이미 등록된 전화번호입니다!");
			return;
		}
		
		groupMap.put(info.ph, info);
	}
	
	public Set<Info> searchByName(String keyword) {
		
		Set<Info> searchResult = new HashSet<>();
		
		System.out.println("- 검 색 결 과 -");
		for (String groupName : phonebook.keySet()) {
			HashMap<String, Info> group = phonebook.get(groupName);			
			for (String phoneNumber: group.keySet()) {			
				Info info = group.get(phoneNumber);
				if (info.name.contains(keyword)) {
					searchResult.add(info);
				}
			}
		}
		return searchResult;
	}
	public Set<Info> searchByPhoneNumber(String keyword) {
		
		Set<Info> searchResult = new HashSet<>();
		
		System.out.println("- 검 색 결 과 -");
		for (String groupName : phonebook.keySet()) {
			HashMap<String, Info> group = phonebook.get(groupName);			
			for (String phoneNumber: group.keySet()) {			
				Info info = group.get(phoneNumber);
				if (info.ph.contains(keyword)) {
					searchResult.add(info);
				}
			}
		}
		return searchResult;
	}
	
	public void print(String columnName, boolean asc) {

		if(!comparators.containsKey(columnName)) {
			System.out.println("정렬 기준이 잘못되었습니다.");
			return;
		}
		
		for (String groupName : phonebook.keySet()) {
			System.out.println("#### "+ groupName + " ####");
			
			List<Info> infos = new ArrayList<>(phonebook.get(groupName).values());
			
			
			
			Collections.sort(infos, comparators.get(columnName));
			
			if (!asc) {
				Collections.reverse(infos);
			}
			
			for(Info info : infos) {
				System.out.println(info);
			}
		}
		
	}
	/*
	  	 # HashMap을 이용해 전화번호부를 구현해보세요
	  	 
	  	  1. [그룹/전화번호/개인정보]를 저장해야 한다.
	  	  2. 그룹명을 키값으로 넣으면 해당 그릅의 HashMap을 꺼낼 수 있다.
	  	  3. 꺼낸 HashMap에 전화번호를 넣으면 그 사람의 개인정보를 꺼낼 수 있다.
	  	 
	  	 # 구현해야 할 메서드
	  	 
	  	  1. 새로운 그룹을 추가하는메서드
	  	  2. 그룹에 새로운 전화번호 및 개인정보를 등록하는 메서드
	  	  3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	  	  4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	  	  5. 등록된 모든 번호를 원하는 항목 기준으로 오름/내림차순으로 출력하는 메서드
	 */
	public static void main(String[] args) {
		D07_PhoneBook phonebook = new D07_PhoneBook();
		phonebook.addGroup("친구");
		phonebook.addInfo(new Info("친구", "유승민", "010-1234-1234",27));
		phonebook.addInfo(new Info("친구", "오윤희", "010-4157-4123",31));
		phonebook.addInfo(new Info("친구", "제갈성호", "010-7858-4112",24));
		phonebook.addInfo(new Info("친구", "최승민", "010-4152-4141",26));
		
		
		Set<Info> result = phonebook.searchByName("승민");
		System.out.println(result);
		
		result = phonebook.searchByPhoneNumber("23");
		System.out.println(result);
		
		phonebook.print("age", true);
		
	}

}

class Info{
	String group;
	String name,ph;
	Integer age;
	public Info(String group,String name, String ph, Integer age) {
		this.group = group;
		this.name = name;
		this.ph = ph ;
		this.age = age;
		
	}
	@Override
	public String toString() {
		return String.format("[%s/%s/%d]", ph,name,age);
	}
	
}
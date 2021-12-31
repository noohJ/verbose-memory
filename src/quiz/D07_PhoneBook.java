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
	//static�� �ʱ�ȭ �Ҷ� ���
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
			System.out.println("�̹� �����ϴ� �׷��Դϴ�!");
		}
	}
	
	public void addInfo(Info info) {
		HashMap<String, Info> groupMap = phonebook.get(info.group);
		
		if (groupMap == null) {
			System.out.println("�������� �ʴ� �׷��Դϴ�!");
			return;
		}
		if (groupMap.containsKey(info.ph)){
			System.out.println("�̹� ��ϵ� ��ȭ��ȣ�Դϴ�!");
			return;
		}
		
		groupMap.put(info.ph, info);
	}
	
	public Set<Info> searchByName(String keyword) {
		
		Set<Info> searchResult = new HashSet<>();
		
		System.out.println("- �� �� �� �� -");
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
		
		System.out.println("- �� �� �� �� -");
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
			System.out.println("���� ������ �߸��Ǿ����ϴ�.");
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
	  	 # HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	  	 
	  	  1. [�׷�/��ȭ��ȣ/��������]�� �����ؾ� �Ѵ�.
	  	  2. �׷���� Ű������ ������ �ش� �׸��� HashMap�� ���� �� �ִ�.
	  	  3. ���� HashMap�� ��ȭ��ȣ�� ������ �� ����� ���������� ���� �� �ִ�.
	  	 
	  	 # �����ؾ� �� �޼���
	  	 
	  	  1. ���ο� �׷��� �߰��ϴ¸޼���
	  	  2. �׷쿡 ���ο� ��ȭ��ȣ �� ���������� ����ϴ� �޼���
	  	  3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	  	  4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	  	  5. ��ϵ� ��� ��ȣ�� ���ϴ� �׸� �������� ����/������������ ����ϴ� �޼���
	 */
	public static void main(String[] args) {
		D07_PhoneBook phonebook = new D07_PhoneBook();
		phonebook.addGroup("ģ��");
		phonebook.addInfo(new Info("ģ��", "���¹�", "010-1234-1234",27));
		phonebook.addInfo(new Info("ģ��", "������", "010-4157-4123",31));
		phonebook.addInfo(new Info("ģ��", "������ȣ", "010-7858-4112",24));
		phonebook.addInfo(new Info("ģ��", "�ֽ¹�", "010-4152-4141",26));
		
		
		Set<Info> result = phonebook.searchByName("�¹�");
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
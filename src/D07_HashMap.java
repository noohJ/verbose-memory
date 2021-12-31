import java.util.HashMap;
import java.util.Map.Entry;

public class D07_HashMap {
	/*
	  	# Map
	  	
	  	 - �����͸� Key-Value �� ������ �����ϴ� ����� �ڷᱸ��
	  	 - �ε��� ��� Key���� ���� Value�� ������ �� �ִ�.
	  	 - Key�� �ߺ��� ������� �ʴ´�.
	 */
	public static void main(String[] args) {
		// ù ��° ���׸��� Key�� Ÿ���̰� �� ��° ���׸��� Value�� Ÿ���̴�.
		HashMap<String, String> dst = new HashMap<>();
		
		// put(Key, Value) : �ش� Ű�� ���� �����ϳ�.
		dst.put("�п�", "��⵵ ������ ��â�� 670-1 �¿����� 4�� 409ȣ");
		dst.put("�츮��", "����� ���۱� �뷮���� ...");
		dst.put("�ð�", "���ϵ� �ȵ��� ��� ...");
		
		// get(Key) : Ű�� ���� ���� ������
		System.out.println(dst.get("�츮��"));
		System.out.println(dst.get("�ð�"));
		System.out.println(dst.get("�п�"));
		
		// putIfAbsent(key, value) : �ش� Ű���� ��������� ���� �ִ´�. ������� ������ ���� ������.

		//�ش� Ű���� ��������� ���� ������ null�� �����Ѵ�.
		System.out.println(dst.putIfAbsent("����", "��������д���"));
		
		// ������� �������� ���� ���� �ʰ� ����ִ� ���� ���ϵȴ�.
		System.out.println(dst.putIfAbsent("����", "���� �����д���"));
		
		// put �޼���� �̹� �����ϴ� ���� ���� �� �� �ִ�.
		dst.put("����", "�Ǳ�");
		
		System.out.println(dst.get("����"));
		
		/*
		  	# �ݺ������� MapŸ�� Ȱ���ϱ�
		  	
		  	 - KeySet() : �ش� ���� ��� Ű���� Set Ÿ������ ��ȯ�Ѵ�.
		  	 - values() : �ش� ���� ��� ����� �̷���� Collection�� ��ȯ�Ѵ�.
		  	 - entrySet() : Entry<key, value>�� �̷���� Set�� ��ȯ�Ѵ�.
		 */
//		Set<String> dstKeys = dst.keySet();
		for (String key : dst.keySet()) {
			System.out.println(key + " : " + dst.get(key));
		}
		
		for (String value : dst.values()) {
			System.out.println(value);
		}
		
		for (Entry<String, String> entry : dst.entrySet()) {
			System.out.println(("Ű: "+entry.getKey()));
			System.out.println("��: "+entry.getValue());
		}
		
	}
	
}

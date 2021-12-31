
public class D08_String {
	
	public static void main(String[] args) {
		
		String fruits = "apple/banana/kiwi/grape/pineapple/melon/watermelon/grapefruit";
		
		// split (delim) :���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�. 
		String[] split_result =(fruits.substring(8,30)).split("/");
		
		for(String fruit: split_result){
			System.out.println(fruit);
		}
		
		// String.join(delim , iterable...) : ���� ���ڿ��� �����Ѵ�.
		
		String join_result = String.join(", ", split_result);
		System.out.println(join_result);
		System.out.println(String.join(".","����","����" ,"ȣ��","����",join_result));
		
		// contains(seq): �ش� ���ڿ��� ���ԵǾ��ִ��� �˻��Ѵ�.
		System.out.println("mango ����?"+fruits.contains("mango"));
		System.out.println("apple ����?"+fruits.contains("apple"));
		
		// startsWith(seq): �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�.
		String url = "http://www.naver.com";
		
		System.out.println("443?"+url.startsWith("https://"));
		System.out.println("80?"+url.startsWith("http://"));
		
		String fileName = "screenshot.jpg";
		
		// endsWith(seq): �ش� ���ڿ��� �������� �˻��Ѵ�.
		System.out.println(".com? " + url.endsWith(".com"));
		System.out.println(".co.kr? " + url.endsWith(".co.kr"));
		System.out.println(".net? " + url.endsWith(".net"));
		System.out.println(".go.kr? " + url.endsWith(".go.kr"));
		
		System.out.println(".jpeg? " + fileName.endsWith(".jpeg"));
		System.out.println(".jpg? " + fileName.endsWith(".jpg"));
		System.out.println(".exe? " + fileName.endsWith(".exe"));
		
		// replace(old, new): ���ڿ��� ��ü�� ���ο� �ν��Ͻ��� ��ȯ�Ѵ�.
		String email = "billgates@microsoft.com";
		
		String replaced = email.replace("microsoft","linux");
		
		System.out.println("Beofore replace: "+email);
		System.out.println("After replace: "+replaced);
		
		// substring(start) : ���ڿ��� start���� ���������� �ڸ� �ν��Ͻ��� ��ȯ�Ѵ�. 
		// substring(start, end) : ���ڿ��� start���� end�̸����� �ڸ� �ν��Ͻ��� ��ȯ
		System.out.println(email.substring(8));
		System.out.println(email.substring(8, 12));
		
		//toUpperCase(): ���ڿ��� ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�.
		//toLowerCase(): ���ڿ��� ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�.
		System.out.println(email.toUpperCase());
		System.out.println(email.toLowerCase());
		
		// indexOf(seq): ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�.
		// indexOf(seq, start): start���� ���ϴ� ���ڿ��� ã�� �ε����� ��ȯ�Ѵ�.
		System.out.println("------------------------------");
		System.out.println(fruits.indexOf("kiwi"));
		System.out.println(fruits.indexOf("apple"));
		System.out.println(fruits.indexOf("apple",1));
		System.out.println(fruits.lastIndexOf("apple"));
		
		fruits +=fruits;
		fruits +=fruits;
		fruits +=fruits;
		fruits +=fruits;
		/*
		   	�������� : fruits���� "grape"�� ��� ��ġ�� ã�� �� ����غ����� 
		 */
		System.out.println("----------------------------");
		
		for (int i =0;fruits.indexOf("grape",i) !=-1;i=fruits.indexOf("grape",i)+1) {
			System.out.println(fruits.indexOf("grape",i));								
		}
		int found = -1, start;
		while ((found =fruits.indexOf("grape",(start =found+1))) !=-1) {
			System.out.printf("%d���� ã�� \"grape\"�� ��ġ: %d\n",start,found);
		}
		
		// String.format(format,args...): ������ �̿��� ���ϴ� ���ڿ��� ���� �� �ִ�.
		String today = String.format("%d�� %d�� %d��", 2021, 12, 8);
		System.out.println(today);
		
		// String.valueOf(value): ������ ���� ���ڿ� ���� ��ȯ�Ѵ�.
		String str = String.valueOf(new Apple());
		System.out.println(str);
	}
	
}

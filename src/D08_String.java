
public class D08_String {
	
	public static void main(String[] args) {
		
		String fruits = "apple/banana/kiwi/grape/pineapple/melon/watermelon/grapefruit";
		
		// split (delim) :문자열을 원하는 기준으로 자른 문자열 배열을 반환한다. 
		String[] split_result =(fruits.substring(8,30)).split("/");
		
		for(String fruit: split_result){
			System.out.println(fruit);
		}
		
		// String.join(delim , iterable...) : 여러 문자열을 연결한다.
		
		String join_result = String.join(", ", split_result);
		System.out.println(join_result);
		System.out.println(String.join(".","감자","고구마" ,"호박","참외",join_result));
		
		// contains(seq): 해당 문자열이 포함되어있는지 검사한다.
		System.out.println("mango 포함?"+fruits.contains("mango"));
		System.out.println("apple 포함?"+fruits.contains("apple"));
		
		// startsWith(seq): 해당 문자열로 시작하는지 검사한다.
		String url = "http://www.naver.com";
		
		System.out.println("443?"+url.startsWith("https://"));
		System.out.println("80?"+url.startsWith("http://"));
		
		String fileName = "screenshot.jpg";
		
		// endsWith(seq): 해당 문자열로 끝나는지 검사한다.
		System.out.println(".com? " + url.endsWith(".com"));
		System.out.println(".co.kr? " + url.endsWith(".co.kr"));
		System.out.println(".net? " + url.endsWith(".net"));
		System.out.println(".go.kr? " + url.endsWith(".go.kr"));
		
		System.out.println(".jpeg? " + fileName.endsWith(".jpeg"));
		System.out.println(".jpg? " + fileName.endsWith(".jpg"));
		System.out.println(".exe? " + fileName.endsWith(".exe"));
		
		// replace(old, new): 문자열을 교체한 새로운 인스턴스를 반환한다.
		String email = "billgates@microsoft.com";
		
		String replaced = email.replace("microsoft","linux");
		
		System.out.println("Beofore replace: "+email);
		System.out.println("After replace: "+replaced);
		
		// substring(start) : 문자열을 start부터 마지막까지 자른 인스턴스를 반환한다. 
		// substring(start, end) : 문자열을 start부터 end미만까지 자른 인스턴스를 반환
		System.out.println(email.substring(8));
		System.out.println(email.substring(8, 12));
		
		//toUpperCase(): 문자열을 모두 대문자로 변환한 인스턴스를 반환한다.
		//toLowerCase(): 문자열을 모두 소문자로 변환한 인스턴스를 반환한다.
		System.out.println(email.toUpperCase());
		System.out.println(email.toLowerCase());
		
		// indexOf(seq): 원하는 문자열의 인덱스를 반환한다.
		// indexOf(seq, start): start부터 원하는 문자열을 찾아 인덱스를 반환한다.
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
		   	연습문제 : fruits에서 "grape"의 모든 위치를 찾은 뒤 출력해보세요 
		 */
		System.out.println("----------------------------");
		
		for (int i =0;fruits.indexOf("grape",i) !=-1;i=fruits.indexOf("grape",i)+1) {
			System.out.println(fruits.indexOf("grape",i));								
		}
		int found = -1, start;
		while ((found =fruits.indexOf("grape",(start =found+1))) !=-1) {
			System.out.printf("%d부터 찾은 \"grape\"의 위치: %d\n",start,found);
		}
		
		// String.format(format,args...): 형식을 이용해 원하는 문자열을 만들 수 있다.
		String today = String.format("%d년 %d월 %d일", 2021, 12, 8);
		System.out.println(today);
		
		// String.valueOf(value): 전달한 값의 문자열 값을 반환한다.
		String str = String.valueOf(new Apple());
		System.out.println(str);
	}
	
}

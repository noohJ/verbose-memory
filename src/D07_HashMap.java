import java.util.HashMap;
import java.util.Map.Entry;

public class D07_HashMap {
	/*
	  	# Map
	  	
	  	 - 데이터를 Key-Value 한 쌍으로 저장하는 방식의 자료구조
	  	 - 인덱스 대신 Key값을 통해 Value에 접근할 수 있다.
	  	 - Key는 중복을 허용하지 않는다.
	 */
	public static void main(String[] args) {
		// 첫 번째 제네릭은 Key의 타입이고 두 번째 제네릭은 Value의 타입이다.
		HashMap<String, String> dst = new HashMap<>();
		
		// put(Key, Value) : 해당 키에 값을 저장하낟.
		dst.put("학원", "경기도 구리시 인창동 670-1 태영빌딩 4층 409호");
		dst.put("우리집", "서울시 동작구 노량진동 ...");
		dst.put("시골", "경상북도 안동시 성곡동 ...");
		
		// get(Key) : 키를 통해 값을 꺼낸다
		System.out.println(dst.get("우리집"));
		System.out.println(dst.get("시골"));
		System.out.println(dst.get("학원"));
		
		// putIfAbsent(key, value) : 해당 키값이 비어있으면 값을 넣는다. 비어있지 않으면 값을 꺼낸다.

		//해당 키값이 비어있을땐 값을 넣은후 null을 리턴한다.
		System.out.println(dst.putIfAbsent("직장", "가산디지털단지"));
		
		// 비어있지 않을때는 값을 넣지 않고 들어있던 값이 리턴된다.
		System.out.println(dst.putIfAbsent("직장", "구로 디지털단지"));
		
		// put 메서드는 이미 존재하는 값을 덮어 쓸 수 있다.
		dst.put("직장", "판교");
		
		System.out.println(dst.get("직장"));
		
		/*
		  	# 반복문으로 Map타입 활용하기
		  	
		  	 - KeySet() : 해당 맵의 모든 키들을 Set 타입으로 반환한다.
		  	 - values() : 해당 맵의 모든 값들로 이루어진 Collection을 반환한다.
		  	 - entrySet() : Entry<key, value>로 이루어진 Set을 반환한다.
		 */
//		Set<String> dstKeys = dst.keySet();
		for (String key : dst.keySet()) {
			System.out.println(key + " : " + dst.get(key));
		}
		
		for (String value : dst.values()) {
			System.out.println(value);
		}
		
		for (Entry<String, String> entry : dst.entrySet()) {
			System.out.println(("키: "+entry.getKey()));
			System.out.println("값: "+entry.getValue());
		}
		
	}
	
}

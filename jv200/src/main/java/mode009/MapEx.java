package mode009;

import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(Integer.valueOf(1),"후니");
		map.put(2,"준호");
		map.put(new Integer(3),"희정"); //java 9 이후로는 더이상 사용하지 않음
		System.out.println(map.get(new Integer(1)));
		System.out.println(map.get(new Integer(2)));
		System.out.println(map.get(new Integer(3)));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer);
			System.out.println(" = " + map.get(integer));
		}
	}

}

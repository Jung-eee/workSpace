package mode009;

import java.util.ArrayList;
import java.util.List;
public class ListEx {
	public static void main(String[] args) {
		//list 중복가능 순서있음
		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("second");
		list.add(new Integer(4));
		System.out.println(list);
	}
}

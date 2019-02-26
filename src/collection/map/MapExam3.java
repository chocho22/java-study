package collection.map;

import java.util.HashMap;

public class MapExam3 {
	
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"가만두지 않겠다.");
		map.put(2,"마지막이다.");
		map.put(3,"음....");
		map.compute(1,  (k,v)->(v==null)?"헬로":v.concat("헬로"));
		map.compute(4,  (k,v)->(v==null)?"흠":v.concat("흠"));
		
		System.out.println(map);
		
		HashMap<String,Object> cat = new HashMap<>();
		cat.put("name","냥이1");
		cat.put("age",11);
		System.out.println(cat);
	}

}

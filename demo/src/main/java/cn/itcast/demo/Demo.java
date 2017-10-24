package cn.itcast.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

	
	public static void main(String[] args) {
		
		
		List <Map<String,String>> list = new ArrayList<Map<String,String>>();
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("1","2");
		map.put("3", "4");	
		
		list.add(map);
		System.out.println(list);
		
		
		
		
	}
	
	
}

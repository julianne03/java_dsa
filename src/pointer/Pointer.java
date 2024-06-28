package pointer;

import java.util.HashMap;

public class Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11;
		int num2 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = 22;
		
		System.out.println(num1);
		System.out.println(num2);
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("value","11");
		HashMap<String, String> map2 = map1;
		
		System.out.println(map2);
		
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("value","57");
		
		// all maps are pointing map3
		map2 = map3;
		map1 = map3;
		
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
	}

}

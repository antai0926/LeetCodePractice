package com.antai.LeetCode;

import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char[] chars= s.toCharArray();
		
		int result =0;
		for(int i=0; i < chars.length-1; i++) {
			if (map.get(chars[i]) >= map.get(chars[i+1])) {
				result += map.get(chars[i]);
			}else {
				result -= map.get(chars[i]);
			}
		}
		result += map.get(s.charAt(s.length()-1));
		
		return result;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInteger testCase = new RomanToInteger();
		System.out.println(testCase.romanToInt("IX"));

	}

}

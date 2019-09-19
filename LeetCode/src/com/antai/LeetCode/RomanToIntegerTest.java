package com.antai.LeetCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

	@Test
	void test() {
		RomanToInteger testRoman = new RomanToInteger();
		assertEquals(3,testRoman.romanToInt("III"));
		assertEquals(4,testRoman.romanToInt("IV"));
		assertEquals(9,testRoman.romanToInt("IX"));
		assertEquals(58,testRoman.romanToInt("LVIII"));
		assertEquals(1994,testRoman.romanToInt("MCMXCIV"));
	}
}

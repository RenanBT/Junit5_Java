package br.com.betereli;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ArraysCompareTest {

	@Test
	@Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
	void testSort() {
		int [] numbers = {25,8,21,32,3};
		int [] excpectedArray = {3,8,21,25,32};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(numbers, excpectedArray);
	}
	
	//Test Expected to fail
	@Test
	@Timeout(1)
	void testSortPerformance() {
		int [] numbers = {25,8,21,32,3};
		//int [] excpectedArray = {3,8,21,25,32};
		for(int i = 0; i < 100000000; i++) {
			numbers[0]=i;
			Arrays.sort(numbers);
		}
	}

}

package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String words[] = {"first","second", "third", "fourth"};
		String value1 = "second";
		String value2 = "third";
		String value3 = "false";
		
		assertEquals(1,_00_LinearSearch.linearSearch(words, value1));
		assertEquals(2,_00_LinearSearch.linearSearch(words, value2));
		assertEquals(-1,_00_LinearSearch.linearSearch(words, value3));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int array[] = {1,2,12,14,25,29,37,38,40,70,72};
		int start = 0;
		int end = array.length-1;
		int value1 = 14;
		int value2 = 70;
		int value3 = 1;
		int value4 = 5;
		
		assertEquals(3, _01_BinarySearch.binarySearch(array, start, end, value1));
		assertEquals(9, _01_BinarySearch.binarySearch(array, start, end, value2));
		assertEquals(0, _01_BinarySearch.binarySearch(array, start, end, value3));
		assertEquals(-1, _01_BinarySearch.binarySearch(array, start, end, value4));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int array[] = {3,6,9,12,15,18,21,24,27,30};
		int value1 = 6;
		int value2 = 18;
		int value3 = 14;
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(array, value1));
		assertEquals(5, _02_InterpolationSearch.interpolationSearch(array, value2));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, value3));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int array[] = {1,2,12,14,25,29,37,38,40,70,72,81,90,100,111,121,300};
		int value1 = 25;
		int value2 = 70;
		int value3 = 123;
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(array, value1));
		assertEquals(9, _03_ExponentialSearch.exponentialSearch(array, value2));
		assertEquals(-1,_03_ExponentialSearch.exponentialSearch(array, value3));
	}
}

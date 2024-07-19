package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.OraclesExamples;

class OraclesExamplesTest {

	@Test
	void test() {
		
		int[] testInput={1,2,5,3,0};;
		int result_v1 = OraclesExamples.returnFirstZero(testInput);
		int result_v2 = OraclesExamples.returnFirstZero_v2(testInput);
		assert(result_v1==result_v2);
	}
	
	@Test
	void test1() {
		
		int[] testInput={1,2,0,3,0};;
		int result_v1 = OraclesExamples.returnFirstZero(testInput);
		int result_v2 = OraclesExamples.returnFirstZero_v2(testInput);
		assert(result_v1==result_v2);
	}
	
	@Test
	void test2() {
		
		int[] testInput={1,2,8,3,3};;
		int result_v1 = OraclesExamples.returnFirstZero(testInput);
		int result_v2 = OraclesExamples.returnFirstZero_v2(testInput);
		assert(result_v1==result_v2);
	}

}

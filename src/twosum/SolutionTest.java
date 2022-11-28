package twosum;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testTwoSum() {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] intArray = { 0, 1 };
		assertEquals(true, Arrays.equals(Solution.twoSum(nums, target),intArray));
	}

}

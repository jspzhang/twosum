package twosum;

import java.util.Arrays;

/*Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target. You may assume that each input would have exactly one 
solution, and you may not use the same element twice.

You can return the answer in any order.
Constraints:
    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.

*/

public class Solution {

	public Solution() {
	}

	public static void main(String[] args) {
		int[] nums1 = { 2, 7, 11, 15 };
		int target1 = 9;

		System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
		System.out.println("Output:" + Arrays.toString(twoSum(nums1, target1)));

		int[] nums2 = { 3, 2, 4 };
		int target2 = 6;

		System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
		System.out.println("Output:" + Arrays.toString(twoSum(nums2, target2)));

		int[] nums3 = { 3, 3 };
		int target3 = 6;

		System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
		System.out.println("Output:" + Arrays.toString(twoSum(nums3, target3)));

	}

	static int[] twoSum(int[] nums, int target) {
		int[] indexArray = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					indexArray[0] = i;
					indexArray[1] = j;
					break;
				}

			}
		}

		return indexArray;

	}

}

package Assignment;

import java.util.*;

public class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Iterate through each element
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;              // Pointer after i
            int right = nums.length - 1;   // Pointer at the end

            // Step 3: Two-pointer approach
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate 'left'
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicate 'right'
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Move pointers inward
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++; // Increase sum
                }
                else {
                    right--; // Decrease sum
                }
            }
        }

        return result;
    }

    // Driver code for testing
    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> res = solution.threeSum(nums);
        System.out.println(res);
    }
}


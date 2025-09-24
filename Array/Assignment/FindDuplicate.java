package Assignment;

// Question 1:Given an integer array nums, return true
//  if any value appears at least twice in the array, and 
//  return false if every element is distinct

import java.util.HashSet;

class FindDuplicate{

    //Approach 1 - Brute Force (O(n^2))
    public static boolean containsDuplicate(int[] nums){
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //approach 2 - using Sets (O(n))
    public static boolean constainDuplicate2(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(containsDuplicate(arr));
        System.out.println(constainDuplicate2(arr));
    }
}
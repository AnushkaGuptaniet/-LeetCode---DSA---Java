/*
LeetCode 31: Next Permutation

Approach:
1. Find the first index i from the right such that nums[i] < nums[i+1]
2. Find the index j from the right such that nums[j] > nums[i]
3. Swap nums[i] and nums[j]
4. Reverse the suffix starting from i+1

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if (i>=0){
            int j = nums.length - 1;
            while(j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void reverse(int[] nums, int start){
        int end = nums.length - 1;
        while(start < end){
            swap(nums, start, end);
            start ++;
            end--;
        }
    }
}

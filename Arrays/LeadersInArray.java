/*
Problem: Leaders in an Array

A leader is an element which is greater than all the elements to its right side.

Example:
Input:  {15, 18, 5, 3, 6, 2}
Output: 2 6 18

Approach:
- Traverse the array from right to left
- Keep track of the maximum element seen so far
- If current element > max, it is a leader

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LeadersInArray {

    public static void main(String[] args) {
        int[] nums = {15, 18, 5, 3, 6, 2};
        findLeaders(nums);
    }

    static void findLeaders(int[] nums) {
        int maxElement = nums[nums.length - 1];
        System.out.println(maxElement);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > maxElement) {
                System.out.println(nums[i]);
                maxElement = nums[i];
            }
        }
    }
}

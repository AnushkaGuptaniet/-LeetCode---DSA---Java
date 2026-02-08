// PROBLEM 1: TWO SUM

// Approach 1: Brute Force Approach
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,9,11,15};
        int target = 9;
        int n = nums.length;
        System.out.println(Arrays.toString(twoSum(nums, n, target)));
    }

    static int[] twoSum(int[] nums, int n, int target){
        int sum = 0;
        for (int i = 0; i < n ; i++){
            for (int j = i + 1; j < n ; j++){
                sum = nums[i] + nums[j];
                if (sum == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
// TC : O(n^2), SC : O(1)


// Approach 2 : Two Pointer Approach
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int n = nums.length;
        System.out.println(Arrays.toString(twoSum(nums, n, target)));
    }

    static int[] twoSum(int[] nums, int n, int target){
        int sum = 0;
        int low = 0 , high = n - 1;
        while(low < high){
            sum = nums[low] + nums[high];
            if(sum > target){
                high--;
            }else if(sum < target){
                low++;
            } else{
                return new int[]{low, high};
            }
        }
        return new int[]{};
    }
}
// TC : O(n), SC : O(n)


// Approach 3: Hashmap (Optimized)
import java.util.HashMap;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int n = nums.length;
        System.out.println(Arrays.toString(twoSum(nums, n, target)));
    }

    static int[] twoSum(int[] nums, int n, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){            // checks whether the key is present or not
                return new int[]{map.get(complement), i};         // return the index of the previous
            }
            map.put(nums[i], i);                   // store current no with its index
        }
        return new int[]{};
    }
}
// TC : O(n), SC : O(n)

import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Target : ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    // brute force
   public static int[] twoSum(int[] nums, int target){
       for(int i = 0; i < nums.length; i++){
           for(int j = i + 1; j < nums.length; j++){
               if(nums[i] + nums[j] == target){
                   return new int[]{i, j};
               }
           }
       }
       return new int[]{};
   }
    // TC:O(n^2) , SC: O(1)

    // optimal(hashmap)
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    // tc:O(n), sc :O(n)
}


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



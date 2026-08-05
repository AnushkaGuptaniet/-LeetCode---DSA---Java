import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = { 8,8,7,6,5};
        System.out.println(secondLargest(nums));
    }
    // brute force
   public static int secondLargest(int[] nums){
       Arrays.sort(nums);
       int largest = nums[nums.length - 1];
       for(int i = nums.length - 2; i >= 0; i--){
           if(nums[i] != largest){
               return nums[i];
           }
       }
       return -1;
   }
    // TC: O(nlogn), SC: O(1)

    better
   public static int secondLargest(int[] nums){
       int largest = nums[0];
       for(int i = 0; i < nums.length; i++){
           if(nums[i] > largest){
               largest = nums[i];
           }
       }
       int secLargest = -1;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] != largest && nums[i] > secLargest){
               secLargest = nums[i];
           }
       }
       return secLargest;
   }
    // TC: O(n), SC : O(1)

    // optimal
    public static int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secLargest && nums[i] != largest) {
                secLargest = nums[i];
            }
        }
        if(secLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secLargest;
    }
    // TC: O(n), SC: O(1)
}

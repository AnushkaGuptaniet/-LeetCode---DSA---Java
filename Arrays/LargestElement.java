import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(largestElement(nums));
    }
    // Brute Force
   public static int largestElement(int[] nums){
       Arrays.sort(nums);
       return nums[nums.length - 1];
   }
    // TC: O(n log n), SC : O(n log n)

    public static int largestElement(int[] nums){
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
     // TC : O(n) , SC: O(1)
}

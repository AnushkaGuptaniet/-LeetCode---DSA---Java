// PROBLEM 75 : SORT COLORS (DUTCH NATIONAL FLAG ALGORITHM)


// Approach 1 : Brute force approach
import java.util.Arrays;
public class Colors {

    public static void main(String[] args) {
        int[] nums = {2,0, 2, 1, 1, 0};
        int n = nums.length;
        System.out.println(Arrays.toString(sortColors(nums,n)));
    }

    static int[] sortColors(int[] nums, int n){
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] == 0){
                c0++;
            } else if(nums[i] == 1){
                c1++;
            } else{
                c2++;
            }
        }

        int index = 0;
        for(int i = 0; i < c0; i++){
            nums[index++] = 0;
        }
        for(int i = 0; i < c1; i++){
            nums[index++] = 1;
        }
        for(int i = 0; i < c2; i++){
            nums[index++] = 2;
        }
        return nums;
    }
}
// TC : O(n) but multitple passes , SC : O(n)


// Approach 2: Three Pointers (Optimized)
import java.util.Arrays;
public class Colors {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int n = nums.length;
        System.out.println(Arrays.toString(sortColors(nums, n)));
    }

    static int[] sortColors(int[] nums, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, low, high);
                high--;
            }
        }
        return nums;
    }

    static void swap(int[] nums, int low, int high){
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}
// TC : O(n) single pass , SC : O(n)

import java.util.*;
public class Prob1752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(check(nums, n));
    }

//    public static boolean check(int[] nums, int n) {             // bruteforce
//        int count = 0;
//        for (int r = 0; r < n; r++) {
//            boolean sorted = true;
//            for (int i = 1; i < n; i++) {
//                int prev = (r + i - 1 + n) % n;
//                int curr = (r + i) % n;
//                if (nums[prev] > nums[curr]) {
//                    sorted = false;
//                    break;
//                }
//            }
//            if (sorted) {
//                return true;
//            }
//        }
//        return false;
//
//    }
//}
    //TC:- O(n^2), SC:- O(n)
 
    public static boolean check(int[] nums, int n) {               // optimal - single traversal
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}

// TC:- O(n), SC:- O(1)

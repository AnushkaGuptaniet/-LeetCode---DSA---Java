class Solution {
    
    public int[] searchRange(int[] nums, int target){
        int st = 0, end = nums.length - 1; 
        int first = firstOccurence(nums,st,end, target);
        int last = lastOccurence(nums,st,end, target);
        return new int[]{first, last};   
    }

    static int firstOccurence(int[] nums, int st , int end, int target){
        int fo = -1;
        //base condition
        if (st > end){
            return -1;
        }
        int mid = st + (end - st) / 2;
        if (nums[mid] == target){
            fo = mid;
            int left = firstOccurence(nums, st, mid - 1, target);
            return (left != -1) ? left : mid;
            // if (left != -1){
            //     return left;
            // } else {
            //     return mid;
            // }
        } else if (target < nums[mid]){
            return firstOccurence(nums, st, mid - 1, target);
        } else {
            return firstOccurence(nums, mid + 1, end, target);
        }
        // return fo;
    }
    static int lastOccurence(int[] nums, int st , int end, int target){
        int lo = -1;
        //base condition
        if (st > end){
            return -1;
        }
        int mid = st + (end - st) / 2;
        if (nums[mid] == target){
            lo = mid;
            int right = lastOccurence(nums, mid + 1, end, target);
            return (right != -1) ? right : mid; // if right != -1 return right else return mid
        } else if (target < nums[mid]){
            return lastOccurence(nums, st, mid - 1, target);
        } else {
            return lastOccurence(nums, mid + 1, end, target);
        }
        // return lo;
    }
}






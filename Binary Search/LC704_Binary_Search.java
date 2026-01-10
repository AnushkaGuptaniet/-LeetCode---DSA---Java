class Solution {

    public int search(int[] nums, int target) {
        int n = nums.length;
        return binSearch(nums, 0, n-1, target);
    }

    static int binSearch(int[] nums, int start, int end, int target){
        //base condition
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == nums[mid]){
            return mid;
        } else if (target > nums[mid]){
            return binSearch(nums, mid + 1, end, target);
        } else {
            return binSearch(nums, start, mid - 1, target);
        }
    }
}

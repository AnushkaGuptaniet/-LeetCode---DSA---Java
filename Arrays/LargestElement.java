class Solution {
    public int largestElement(int[] nums) {
        int n = nums.length;
        int maxNum = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] > maxNum){
                maxNum = nums[i];
            }
        }
        return maxNum;
    }
}

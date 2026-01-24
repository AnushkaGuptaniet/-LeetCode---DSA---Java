class Solution {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            boolean flag = false;
            for(int j = 0 ; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    swap(nums, j , j+1);
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        return nums;

    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

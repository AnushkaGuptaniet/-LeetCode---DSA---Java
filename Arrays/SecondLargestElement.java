class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        int largest = nums[0], slargest = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] > largest){
                slargest = largest;
                largest = nums[i];
            }else if(nums[i] < largest && nums[i] > slargest){
                slargest = nums[i];
            }
        }
        return slargest;
    }
}

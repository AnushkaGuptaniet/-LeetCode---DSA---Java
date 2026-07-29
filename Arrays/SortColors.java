public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColor(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    // brute force
   public static void sortColor(int[] nums){
       int zero = 0;
       int one = 0;
       int two = 0;
       for(int i = 0; i < nums.length; i++){
           if(nums[i] == 0)
               zero++;
           else if(nums[i] == 1)
               one++;
           else
               two++;
       }
       int index = 0;
       for(int i = 0; i < zero; i++){
           nums[index] = 0;
           index++;
       }
       for(int i = 0; i < one; i++){
           nums[index] = 1;
           index++;
       }
       for(int i = 0; i < two; i++){
           nums[index] = 2;
           index++;
       }
   }
    
    // TC: O(n), SC: O(1)

    // optimal (3 pointers) (dutch national flag algo)
    public static void sortColor(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                mid++;
                high--;
            }
        }
    }
    // TC: O(n), SC: O(1)
}

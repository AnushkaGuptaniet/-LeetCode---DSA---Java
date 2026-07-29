import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        selectionSort(nums, n);
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void selectionSort(int[] nums, int n){
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
// TC: O(n^2) , SC: O(1)

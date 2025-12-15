package Day5;
import java.util.Arrays;
public class TwoSum {
    static int[] tS(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int i = 0;
        int j = nums.length - 1;
        int arr[] = new int[2];
        while(i < j){
            if(nums[i] + nums[j] == target){
                arr[0] = nums[i];
                arr[1] = nums[j];
                return arr;
            }
            else if(nums[i] + nums[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,5,6};
        int[] result = tS(arr,7);
        System.out.println(Arrays.toString(result));
    }
}

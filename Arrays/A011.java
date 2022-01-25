package Arrays;

public class A011 {
    public static int removeDuplicates(int[] nums) {
        int k = 1 ;
        for (int i = 0; i < nums.length;i++) {
            if(i==0 || nums[i] == nums[i-1]){

            }
            else{
                nums[k] = nums[i];
                k++;
            }
        }

        return k ;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}

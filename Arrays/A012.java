package Arrays;

public class A012 {
    public static void moveZeroes(int[] nums) {
        int k = 0;
        int j = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){

            }
            else{
                nums[k] = nums[i];
                k++;
            }
        }
        while (k< nums.length){
            nums[k] = 0;
            k++;
        }
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +" ");
        }
    }
}

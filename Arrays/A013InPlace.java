package Arrays;

public class A013InPlace {
    public static int[] sortArrayByParity(int[] nums) {
        int k = 0;
        int j = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }

        }

        return nums;
    }

    public static void main(String[] args) {
        int [] nums ={3,1,2,4};
        sortArrayByParity(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +" ");
        }
    }
}

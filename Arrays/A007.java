package Arrays;

public class A007 {
    public static int removeDuplicates(int[] nums) {
        int k = nums.length;
        for (int i = nums.length-1; i > 0 ; i--) {
            if(nums[i] == nums[i-1]){
                k--;
            }
            int b = i;
            if(nums[i-1] == nums [i]){
                while ( k > b) {
                    nums[b] = nums[++b];
                }
            }
            }

        return k ;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}

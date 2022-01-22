package Arrays;

public class A006 {

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        int a = nums.length-1;
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i] == val){
                nums[i] = nums[a--];
                k--;
            }
        }
        return k ;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}

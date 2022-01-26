package Arrays;

public class A13TempArray {
    public static int[] sortArrayByParity(int[] nums) {
        int k = 0;
        int j = nums.length-1;
        int temp [] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
               temp[k] = nums[i];
               k++;
            }else{
                temp[j] = nums[i];
                j--;
            }

        }

        return temp;
    }

    public static void main(String[] args) {
        int [] nums ={3,1,2,4};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(sortArrayByParity(nums)[i]);
        }

    }
}

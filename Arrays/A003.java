package Arrays;

public class A003 {

    public static int[] sortedSquares(int[] nums) {
        int [] output = new int [nums.length];

        for(int i = 0; i <nums.length; i++){
            output[i] = nums[i] * nums[i];
        }
        for(int k = output.length - 1; k > 0; k--) {
            for (int i = k; i < output.length; i++) {
                if (output[i - 1] > output[i]) {
                    int temp = output[i - 1];
                    output[i - 1] = output[i];
                    output[i] = temp;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
       int [] nums = {-4,-1,0,3,10};
        nums = sortedSquares(nums);
        for(int i = 0 ; i <nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }

    }


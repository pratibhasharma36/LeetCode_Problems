package Arrays;

public class A001 {

    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

//        Assign the maximum number of ones as 0.
        int max = 0;

//        Looking throughout the whole loop.
        for (int i = 0; i < nums.length; i++) {

            int j = 0;
//            Look for the digit 1.
            while(i< nums.length && nums[i] == 1 ){
                j = 1;

//                Look for consecutive one.
                while(i+1 < nums.length && nums[i+1] == 1) {

//                    Count the number of consecutive ones.
                    j++;
                    i++;
                }
//                    Look for the highest number of consecutive ones.
                    if(max < j){
                        max = j;
                    }
                    i++;
                }
            }

        return max;
        }


    }

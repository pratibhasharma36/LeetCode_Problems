public class L006AddBinary {

    public static int[] twoSum(int[] nums, int target) {
        int [] indices = {3,3};
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
       int [] nums = {2,7,11,15};
       int target = 9;
       int [] answer = twoSum(nums,target);
        for (int element : answer) {
            System.out.println(element);
        }
    }
}

public class L002Template1 {
    static int binarySearch(int[] nums, int target){
        if( nums == null || nums.length == 0)
//            nums == null means no array named nums is there in the program (no bucket)
//            and nums.length means no value inside array. (empty bucket)
//            note that, we check for s==null before you invoke
//        s.length()==0! It can't be the other way round
            return -1;

        int left = 0, right = nums.length - 1;
        while(left <= right){
            // Prevent (left + right) overflow
            int mid = left + (right-left ) / 2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) { left = mid + 1; }
            else { right = mid - 1; }
        }

        // End Condition: left > right
        return -1;
    }

    public static void main(String[] args) {
        int nums[]= null;
//        int []nums = new int[3];
//        It will give mid index as all numbers will be 0.
        System.out.println(binarySearch(nums,0));
    }
}

package Arrays;

public class A016 {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (nums[midpoint] == target) {
                return midpoint;
            } else if (nums[midpoint] < target) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int [] nums ={1,2,2,3,4,4,6,7,8};
        System.out.println(searchInsert(nums,5));
    }
}

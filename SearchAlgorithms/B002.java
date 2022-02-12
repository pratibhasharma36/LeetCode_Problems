package BinarySearch;

public class B002 {
//    Here we do not have the target, but we will be finding minimum element.
    public static int findMin(int[] nums) {
        int pivotIndex = findPivot(nums);
//        If pivotIndex == -1 || nums.length-1 , array is not rotated.
        if(pivotIndex == -1 || pivotIndex == nums.length-1){
           return nums[0] ;
        }else {
//            As pivotIndex element is the largest.
            return nums[pivotIndex+1];
        }
    }
    public static void main(String[] args) {
        int [] nums= {4,5,6,7,8,1,2};
        System.out.println(findMin(nums));
    }
    static int findPivot(int [] nums){
        int start  = 0;
        int end = nums.length -1 ;
        while(start <= end){
            int mid = start + (end - start)/2;
//            4 cases are to be considered.
//            Case 1
            if( mid < nums.length-1 && nums[mid] > nums[mid+1]){
                return mid;
            }
//            Case 2
            if(mid  > 0 && nums[mid-1] > nums[mid]){
                return mid-1;
            }
//            Case 3
            if(nums[mid] <= nums[start]){
                end =   mid -1 ;
            }
//            Case 4
            else{
//                start != mid as it will be considered in case 2.
                start = mid +1;
            }
        }
        return -1;
    }
}

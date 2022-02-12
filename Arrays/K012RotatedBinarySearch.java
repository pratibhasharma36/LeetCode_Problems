public class K012RotatedBinarySearch {
    public static int search(int[] nums, int target) {
        int pivotIndex = findPivot(nums);
//        If pivotIndex == -1  the array is not rotated, then just do normal binary search.
        if(pivotIndex == -1){
          return BinarySearch(nums,target,0,nums.length-1);
        }else {
//            Now we have 2 ascending order arrays.
            if(nums[pivotIndex] == target){
                return pivotIndex;
            }
            if(target >= nums[0]){
                return BinarySearch(nums,target,0,pivotIndex-1);
            }
            else{
                return BinarySearch(nums,target,pivotIndex+1,nums.length-1);
            }
        }
    }
    static int BinarySearch(int [] nums , int target, int start , int end){

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums= {4,5,6,7,0,1,2};
        System.out.println(search(nums,4));
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

package SearchAlgorithms;

public class K012WithDuplicates {
    public static int search(int[] nums, int target) {
        int pivotIndex = findPivotWithDuplicates(nums);
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
        int [] nums= {4,5,5,6,6,7,7,0,1,2};
        System.out.println(search(nums,5));
    }
    static int findPivotWithDuplicates(int [] nums){
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
//            If elements at middle, start and end are equal ,then just skip the duplicates.
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
//               NOTE : What if these elements at start and end were the pivots?
//                Check if start is pivot.
//                As there are 2 ascending order arrays when an array is rotated around a pivot,
//                if element at start = mid = end and element at 0 > element at 1 it means that is the largest element.
//               If start is pivot, next element must be smaller than start.
//              1 0 1 2 3 4 5
                if(nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
//                As there are 2 ascending order arrays when an array is rotated around a pivot, if element at
//                start = mid = end and element at end-1 > element at end it means that end-1 the largest element.
//                End-1 is pivot when end element is smaller than end-1.
//                 0 1 2 3 4 5 0
                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
//            Left side is sorted , so pivot should be in right.
//            Non-decreasing in first half and then decreasing , then we need to look for pivot in right half.
            else if(nums[start] <= nums[mid] && nums[end] < nums[mid] ){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}

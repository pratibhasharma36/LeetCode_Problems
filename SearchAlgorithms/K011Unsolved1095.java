package SearchAlgorithms;

public class K011Unsolved1095 {
//   Search the peak index.
//    If you can find in the ascending order, return that index.
//    If not , search in descending order.
    public static void main(String[] args) {
        int [] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target,mountainArr));
    }
    static int search( int target ,int [] arr){
        int peak = peakIndexInMountainArray(arr);
//        If we are able to find it in ascending order.
        int ans = binarySearch(arr,0,peak,target,true);
//        If answer is not found in descending order.
        if(ans == -1){
            ans = binarySearch(arr, peak, arr.length, target,false);
        }
        return ans;
    }
    static int binarySearch(int [] arr , int start , int end, int target, boolean isAsc){
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    public static int findInMountainArray(int target, int [] mountainArr) {
       return search(target,mountainArr);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start +(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}

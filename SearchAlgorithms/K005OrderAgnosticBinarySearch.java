package SearchAlgorithms;

public class K005OrderAgnosticBinarySearch {
//    Order agnostic Binary Search
   public static void main(String[] args) {
       int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
       int target =22;
       System.out.println(orderAgnosticBS(arr,target));
    }
   static int orderAgnosticBS(int [] arr , int target){
       int start = 0;
       int end = arr.length-1;

//       Check whether the array is sorted in ascending or descending order.
       boolean isAsc = arr[start] < arr[end];

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
}

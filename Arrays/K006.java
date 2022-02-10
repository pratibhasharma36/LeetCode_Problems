public class K006 {
    //    Ceiling = The Smallest element in array greater than or equal to target element.
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16};
        System.out.println(findElement(arr,25));
    }
//    Find a number greater than or equal to target element.
    static int findElement(int [] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        
        // For ceiling
          if(target > arr[end]){
            return -1;
        }
        
//         //        For floor
//         if(target < arr[start]){
//             return -1;
//         }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
//        Floor : The greatest number which is smaller or equal to target element.
//         For floor
//         return end;
        //    Find a number less than or equal to target element , return end.
//         For ceiling
        return start;
    }
}

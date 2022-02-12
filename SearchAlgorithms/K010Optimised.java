package SearchAlgorithms;

public class K010Optimised {
    public static void main(String[] args) {
        int [] arr ={-3,-2,0,2,5,6,4,3,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
       int start = 0;
       int end = arr.length-1;
       while(start < end){
           int mid = start +(end-start)/2;
           if(arr[mid] > arr[mid+1]){
//               You are in decreasing part of the array.
//               This may be the answer but look at left
//               This is why end != mid-1
               end = mid;
           }else{
//               You are in ascending part of the array.
               start = mid+1;
//               As mid+1 element is greater than mid. So mid is not to be considered.
           }
       }
//       In the end , start == end and pointing to the largest number because of above 2 checks.
//        At every point of start and end , they have the best possible answer. When both are pointing towards same ,
//        then that will be the answer.
//        We can return either start or end.
        return start;
    }
}

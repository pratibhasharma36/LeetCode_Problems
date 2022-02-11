public class K009AmazonInterviewQuestion {
//    For infinite array questions , do not use arr.length.
//    As we do not know the length of the array , we need to move in chunks.
    static int ans(int [] arr , int target){
//        First find the range.
//        First start with a box of size 2 .
        int start = 0;
        int end = 1;
        while(target > arr[end] ){
           int temp = end+1;
//           Double the box value.
//            End = previous end + (size of box)*2
            end = end+(end-start+1)*2;
            start = temp;
//            +1 as we are adding and subtracting indices, and we need number.
        }

//        Condition for the target to lie in the range.
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int [] arr , int target , int start, int end){
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
            }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {3,5,7,9,16,546,755,3456,4366,26543,364543,76535485,907659876,998765456};
        int target = 755;
        System.out.println(ans(arr,target));
    }
}

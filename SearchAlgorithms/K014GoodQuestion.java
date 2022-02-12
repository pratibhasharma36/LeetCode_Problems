package SearchAlgorithms;

public class K014GoodQuestion {
//    Minimum number of partitions that we can make = 1 , i.e., entire array.
//    Maximum number of partitions that we can make = N , i.e, single - single elements.
//    We have to find the sub-array which has the largest sum.
//    Largest sub-array = Total array
//    Smallest sub-array = 1 element array
//  Answer will be greater than  or equal to the maximum element in the array and as all are positive integers
//  (as per question) ,then it will be the largest when entire array sum is taken.
//    The answer is there definitely.
    public static void main(String[] args) {
        int [] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums,m));
    }
    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
//            In the end , this will give the maximum element in the array.
            start = Math.max(start, nums[i]);
//            In the end , this will give the sum of all elements in the array.
            end += nums[i];
        }
//        Binary search
        while(start < end){
//            Try for the middle as the potential answer.
            int mid = start +(end-start)/2;

//            Calculate how many pieces you can divide this with this maximum sum.
            int sum = 0; // minimum sum = 0
            int pieces = 1; // minimum number of pieces = 1
            for(int num : nums){
                if(sum+num > mid){
//                    You cannot add this in this sub-array , make new one.
                    sum = num;
                    pieces++;
                } else{
                    sum +=num;
                }
            }
//            Here , we are making number of pieces closer to the given number of pieces.
            if(pieces > m){
//                Increase the start so that mid too increases, and we can add more numbers and reduce the pieces.
                start = mid+1;
            }else{
//                Decrease the end so that mid too decreases, and we can reduce numbers and increase the pieces.
                 end = mid;
            }
        }
//        Answer will definitely be in between start and end as start represents the smallest sum and end represents the
//        highest sum.
       return end; // As start == end
    }
}

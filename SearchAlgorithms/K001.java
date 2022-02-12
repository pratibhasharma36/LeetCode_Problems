package SearchAlgorithms;

import java.util.concurrent.LinkedBlockingDeque;

public class K001 {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
//    Search in the array : Return the index if item is found.
//    Otherwise return -1.
    static int linearSearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
//            Check for element at every index if it is target.
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}

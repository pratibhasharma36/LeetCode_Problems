package SearchAlgorithms;

public class K008GoodQuestion {
    public static int[] searchRange(int[] nums, int target) {
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        return new int [] {start,end};
    }

//    This function just return the index value of the target.
    static int search(int[] nums, int target, boolean findStartIndex){
//        Potential answer
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else {
                ans = mid;
                if(findStartIndex ){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        for(int element : searchRange(nums,target)){
            System.out.print(element +" ");
        }
    }
}

public class L004SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        array(nums, 4);
        for (int element :
                nums) {
            System.out.println(element);
        }
    }

    public static void array(int[] nums, int k) {
        int i = 0;
        while (i < k-1) {
            nums[i] = k + i + 1;
            i++;
        }
//        for (int j = nums.length-k; j < nums.length; j++) {
//            int l;
//            nums[j] = l;
//            l++;
//        }
//            while(i>=3 && i<nums.length-1){
//                nums[i]=i+1;
//                i++;
//            }
//        }
    }
}



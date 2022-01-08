public class L001D_Best {
        public static int search(int start, int end) {
            int index= -1;
            int nums[] = {-1,0,3,5,9,12};
            int target = 9;
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                index = mid;
            }
            else if (nums[mid] < target && target<=nums[end]) {
                return search( mid + 1, end);
            }
            else if (nums[mid] > target && target>=nums[start]) {
                return search(start, mid-1);
            }
            return index;
        }
        public static void main(String[] args){
            System.out.println(search(0,5));
        }
    }
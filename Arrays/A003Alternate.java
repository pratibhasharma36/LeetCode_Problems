package Arrays;

public class A003Alternate {
    public static int[] sortedSquares(int[] nums) {
        int [] output = new int [nums.length];

        for(int i = 0; i <nums.length; i++){
            output[i] = nums[i] * nums[i];
        }
        quickSort(output,0,nums.length);
        return output;
    }

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        nums = sortedSquares(nums);
        for(int i = 0 ; i <nums.length ; i++){
            System.out.print(nums[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);

        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }
}

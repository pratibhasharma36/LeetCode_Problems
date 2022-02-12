package SearchAlgorithms;

public class K010 {
    public static void main(String[] args) {
        int [] arr ={-3,-2,0,2,5,6,4,3,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int i = 1;
        int max = -1;
        while(i<arr.length && arr[i-1] < arr[i]){
            max = i;
            i++;
        }
        return max;
    }
}

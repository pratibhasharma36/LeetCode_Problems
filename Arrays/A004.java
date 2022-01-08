package Arrays;

public class A004 {
    public static void main(String[] args) {
       int [] arr = {1,0,2,3,0,4,5,0};
       duplicateZeros(arr);
       for( int element : arr){
           System.out.print(element);
           System.out.print(" ");
       }
    }

    public static void duplicateZeros(int[] arr) {
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == 0) {
                for(int j = arr.length-1 ; j > i ; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
}

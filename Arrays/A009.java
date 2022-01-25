package Arrays;

public class A009 {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        boolean b = true;
        int i = arr.length ;
        for(int j = 1 ; j< arr.length ; j++){
            if(arr[j] <= arr[j-1] ){
                i = j;
               break;
            }
        }
        if(i == arr.length || i ==1){
            b = false;
        }
        for(int k = i ; k < arr.length  ; k++){
            if(arr[k] >= arr[k-1]){
                b = false;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(arr));
    }
}

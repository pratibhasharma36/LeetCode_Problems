package Arrays;

public class A008 {
    public static boolean checkIfExist(int[] arr) {
        boolean b = false;
        int i = 0;
        while(i < arr.length){
            for(int j =  0 ; j< arr.length; j++) {
            if( i != j && arr[i] == 2 * arr[j]){
                b = true;
            }
            }
            i++;
        }
        return b ;
    }
    public static void main(String[] args) {
        int [] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
}

package Arrays;

public class A010 {
    public static int[] replaceElements(int[] arr) {

        for (int j = 0; j < arr.length; j++) {
            int max = -1;

            for (int i = j+1; i < arr.length; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            arr[j] = max;
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {400};
        replaceElements(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

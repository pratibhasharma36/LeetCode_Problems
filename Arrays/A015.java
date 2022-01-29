package Arrays;

public class A015 {
    public static int thirdMax(int[] nums) {
        int maximum = nums[0];
        int [] temp = new int [nums.length];
        for(int firstUnsortedIndex = 0; firstUnsortedIndex < temp.length; firstUnsortedIndex++){
            int newElement = nums[firstUnsortedIndex];
            int i ;
            for ( i =  firstUnsortedIndex; i>0 && temp[i-1]> newElement; i--) {
                temp[i] = temp[i-1];
            }
            temp[i] = newElement;
        }
        int uniqueElements = 1;
        for (int i = 1; i < temp.length; i++) {
            if(temp[i] != temp[i-1]){
                uniqueElements++;
            }
        }
        if(uniqueElements >= 3){
            int i = nums.length-1;
            int n = 0;
                while( i > 0  && n < 3 ) {
                if(temp[i-1] != temp[i]){
                    maximum = temp[i--];
                    n++;
                }
                else{
                    i--;
                }
                }
                    if (i == 0 && n != 3) {
                        maximum = temp[0];
                    }
        }
        else{
            maximum = temp[temp.length-1];
        }
        return maximum;
    }

    public static void main(String[] args) {
        int [] nums = {5,2,4,1,3,6,0};
        System.out.println(thirdMax(nums));
    }
}

package Arrays;

public class A002 {

    public static int findNumbers(int[] nums) {
        int numOfElements = 0;
        for(int element : nums){

            int j = 1 ;

            int num = element ;

            if(num > 10){
                j = 2;
            }
            while (num / 10 > 9 ){
                j++;
                num /= 10;
            }
            switch(j){
                case 1 :
                    break;
                case 2 : numOfElements++;
                break;
                case 3 :
                    break;
                case 4 : numOfElements++;
                break;
                case 5 :
                    break;
                case 6 : numOfElements++;
                break;
                case 7 :
                    break;
                case 8 : numOfElements++;
                break;
            }
        }
        return numOfElements ;
    }

    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

}

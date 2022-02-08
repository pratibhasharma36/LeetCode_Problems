public class K003 {

//    As the system is taking only the positive numbers , it will work.
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int [] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num){
        int numOfDigits = digits(num);
        if(numOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

//    Count number of digits in a number.
   public static int digits(int num) {
//        If negative numbers are to be considered as well.
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
   }
   }



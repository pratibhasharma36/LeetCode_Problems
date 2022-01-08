public class L003SquareRoot {
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int sqrt=0;
//        if(x ==0){
//            return 0;
//        }
        while(left<=right){
            int mid = left+ (right-left) / 2;
//            int mid has to be inside the while loop as value of mid has to change everytime in the loop.
            if(mid*mid == x){
                sqrt = mid;
            break;
            }
            if (mid*mid < x) {
                left = mid+1;
                sqrt = mid;
            }
            else
            {
                right = mid-1; }
        }
        return sqrt;
        }
    public static void main(String[] args) {
        System.out.println(mySqrt(50));
    }
}

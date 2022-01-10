public class L005PallindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(45545));
    }

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        boolean b = true;
        for(int i = 0 ; i< s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                b = false;
            }
        }
        return b;
    }
}

package SearchAlgorithms;

public class K007 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end ) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
//                If letters[mid] = target, then too we need to move one step ahead.
                start = mid + 1;
            }
        }
//        if(start+1 < letters.length) {
//            return letters[start + 1];
//        }
//        return letters[0];
        return letters[start% letters.length];
    }

    public static void main(String[] args) {
        char [] letters = {'c', 'f','j'};
        char target ='j';
        System.out.println(nextGreatestLetter(letters, target));
    }
}

package BinarySearch;

public class B001 {
    public static int firstBadVersion(int n) {
        if (n == 0) {
            return -1;
        }
        int left = 0, right = n;
        while (left < right) {
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if (!isBadVersion(mid) && isBadVersion(mid + 1)) {
                return mid+1;
            } else if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        // Post-processing:
        // End Condition: left == right
        if (left != n && isBadVersion(left)) return left;
        return -1;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(firstBadVersion(n));
    }

    static boolean isBadVersion(int version) {
        int bad = 8;
        if (version >= bad) {
            return true;
        }
        return false;
    }
}


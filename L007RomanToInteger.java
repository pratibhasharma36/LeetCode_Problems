public class L007RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

    public static int romanToInt(String s) {
        int answer = 0;
        for(int i = s.length()-1 ; i >= 0; i--) {
            if (i - 1 >= 0 && s.charAt(i - 1) == 'C' && s.charAt(i) == 'M') {
                answer += 900;
                i --;
                continue;
            }

            if (i - 1 >= 0 && s.charAt(i - 1) == 'C' && s.charAt(i) == 'D') {
                answer += 400;
                i --;
                continue;
            }

            if (i - 1 >= 0 && s.charAt(i - 1) == 'X' && s.charAt(i) == 'C') {
                answer += 90;
                i --;
                continue;
            }

            if (i - 1 >= 0 && s.charAt(i - 1) == 'X' && s.charAt(i) == 'L') {
                answer += 40;
                i --;
                continue;
            }

            if (i - 1 >= 0 && s.charAt(i - 1) == 'I' && s.charAt(i) == 'X') {
                answer += 9;
                i --;
                continue;
            }

            if (i - 1 >= 0 && s.charAt(i - 1) == 'I' && s.charAt(i) == 'V') {
                answer += 4;
                i --;
                continue;
            }

            if (i >=0) {
                switch (s.charAt(i)) {
                    case 'M':
                        answer += 1000;
                        break;
                    case 'D':
                        answer += 500;
                        break;
                    case 'C':
                        answer += 100;
                        break;
                    case 'L':
                        answer += 50;
                        break;
                    case 'X':
                        answer += 10;
                        break;
                    case 'V':
                        answer += 5;
                        break;
                    case 'I':
                        answer += 1;
                        break;
                }
            }
        }
        return answer;
    }
}

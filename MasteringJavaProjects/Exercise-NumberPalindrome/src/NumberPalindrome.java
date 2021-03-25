public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int origNumber = number;
        int reverse = 0;
        int lastDigit = 0;
        if(number > 0) {
            while (number > 0) {
                lastDigit = number % 10; //1 2
                reverse *= 10; //0 10
                reverse += lastDigit; // 1 12
                number /= 10; //12 1

            }
        }
        else {
            while (number < 0) {
                lastDigit = number % 10; //1 2
                reverse *= 10; //0 -10
                reverse += lastDigit; // -1 -12
                number /= 10; //-12 -1
            }
        }
        reverse += number;
        if(reverse == origNumber){
            return true;
        }
        else{
            return false;
        }
    }
}

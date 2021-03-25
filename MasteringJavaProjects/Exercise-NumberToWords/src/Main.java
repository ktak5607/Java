public class Main {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(3456));

        System.out.println(reverse(1010));
//        System.out.println(reverse(2245));
//        System.out.println(reverse(19));
//        System.out.println(reverse(111114));
       // numberToWords(123);
//       numberToWords(1010);
//        numberToWords(100);
//        numberToWords(-1010);
    }
    public static int getDigitCount(int n){
            if(n < 0){
                return -1;
            }
            if(n == 0){
                return 1;
            }
            else {
                int count = 0;
                while (n != 0) {
                    n /= 10;
                    count++;
                }
                return count;
            }

    }
    public static int reverse(int n){
        int count = 0;
        int origNumber = n;
        while (n != 0) {
            n /= 10;
            count++;
        }
        int lastDigit = 0;
        int reverseNumber = 0;
        for(int i = count; i > 0; i--){
            lastDigit = origNumber % 10;
            reverseNumber += lastDigit * (int) Math.pow(10, i - 1);
            origNumber /= 10;
        }
        return reverseNumber;
    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Number");
        }
        else {
            int reverseNumber = reverse(number);
            for (int i = 1; i <= getDigitCount(number); i++) {
                int lastDigit = reverseNumber % 10;
                switch (lastDigit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }
                reverseNumber /= 10;

            }
        }
    }
}

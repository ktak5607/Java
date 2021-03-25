public class Main {
    public static final boolean INVALID = false;
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    public static boolean isValid(int n){
        if(n < 10 || n > 1000){
            return INVALID;
        }
        else{
            return true;
        }
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if(isValid(n1) && isValid(n2) && isValid(n3)){
            int endDigit1 = n1 % 10;
            int endDigit2 = n2 % 10;
            int endDigit3 = n3 % 10;
            if(endDigit1 == endDigit2 || endDigit1 == endDigit3 || endDigit2 == endDigit3){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return INVALID;
        }
    }
}

public class SumOdd {
    public static boolean isOdd(int num){
        if(num < 0){
            return false;
        }
        else if(num % 2 == 1){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        if ((end < start) || (end < 0) || (start < 0)) {
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(33221));
    }

    public static int sumDigits(int num){
        int sum = 0;
        if(num < 10){
            return -1;
        }
        else{
            //int leastSig  = num % 10;
            while(num > 0){
                sum += num % 10;
                num = num/10;
            }
            return sum;

        }
    }
}

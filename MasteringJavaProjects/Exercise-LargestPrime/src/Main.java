public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
    public static int getLargestPrime(int number){
        int largestPrime = 0;
        if(number <= 1){
            return -1;
        }
        for(int i = 1; i <= number; i ++){
            if(number % i == 0){
                boolean isPrime = true;
                for(int j = 2; j <= i / 2; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}

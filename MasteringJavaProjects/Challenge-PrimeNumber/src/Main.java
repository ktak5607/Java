public class Main {

    public static void main(String[] args) {
	    int primeCount = 0;
	    for(int i = 100; i < 200; i++){
	        if(isPrime(i)){
                System.out.println(i);
                primeCount += 1;

                if(primeCount == 3){
                    break;
                }
            }

        }
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            //System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }
}

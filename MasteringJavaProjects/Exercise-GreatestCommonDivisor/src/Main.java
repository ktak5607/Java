public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
        System.out.println(getGreatestCommonDivisor(11,11));
    }

    public static int getGreatestCommonDivisor(int n1, int n2){
        if(n1 < 10 || n2 < 10){
            return -1;
        }
        else {
            int divisor = -1;
            int smallest = n2;
            if (n1 <= n2) {
                smallest = n1;
            }//end n1 was smaller or equal to n2
            for (int i = 1; i <= smallest; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    divisor = i;
                }//end found divisor for n1 and n2
            }//end loop through smallest
            return divisor;
        }//end numbers were valid
    }//end method
}

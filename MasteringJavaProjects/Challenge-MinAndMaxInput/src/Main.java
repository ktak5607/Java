import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        //int min = Integer.MIN_VALUE;
        //int max = Integer.MAX_VALUE; alternate way so don't have to use flag, numbers users enter will
        //always be in this range.
        boolean first = true;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                if(first){
                    first =  false;
                    max = number;
                    min = number;
                }
                else if (number > max) {
                    max = number;
                }
                else if (number < min) {
                    min = number;
                }

                scanner.nextLine();
            }
            else{
                break;
            }

        }
        scanner.close();
        System.out.println("The maximum number entered is " + max);
        System.out.print("The minimum number entered is " + min);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(count <= 10){
            System.out.println("Enter number " + count);
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int nextInt = scanner.nextInt();
                count++;
                sum += nextInt;

            }
            else{
                System.out.println("Invalid number");
            }
            scanner.nextLine();

        }
        System.out.println("The final sum is " + sum);
        scanner.close();
    }
}

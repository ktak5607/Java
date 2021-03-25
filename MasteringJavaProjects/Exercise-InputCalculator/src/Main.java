import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            //System.out.println();
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                count++;
            }
            else{
                break;
            }
        }
        scanner.close();
        avg = (int) Math.round((double)sum/count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}

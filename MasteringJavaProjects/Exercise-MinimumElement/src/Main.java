import java.util.Scanner;

public class Main {
    //private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("Enter the number of elements for the array.");
        int count  = readInteger();
        int [] array = readElements(count);
        System.out.println("min number is " + findMin(array));
    }
    private static int readInteger(){
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        //scanner.close();
        return number;
    }
    private static int[] readElements(int count){
        int[] array = new int[count];
        Scanner scanner2 =  new Scanner(System.in);

        for(int i = 0; i < count; i++){
            int num = scanner2.nextInt();
            scanner2.nextLine();
            array[i] = num;
        }
        scanner2.close();
        return array;
    }

    public static int findMin(int [] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}

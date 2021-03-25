import java.util.Scanner;

public class Main {
    private static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of elements for the array.");
	    int count  = scanner.nextInt();
	    int [] array = readIntegers(count);
        System.out.println("min number is " + findMin(array));
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count + " numbers.");
        for(int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
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

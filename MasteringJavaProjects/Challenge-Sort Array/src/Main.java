import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] array = getIntegers(5);
        //printArray(array);
        int [] sortedArray = sortIntegers(array);
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
    }
    public static int[] getIntegers(int size){
        int [] array = new int[size];
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter you numbers: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        //scanner.close();
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }

            }
        }

        return sortedArray;
    }
}

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println("The original array is " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("The reversed array is " + Arrays.toString(array));
    }

    public static void reverseArray(int [] array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array [array.length - 1 -i];
            array [array.length - 1 -i] = temp;
        }

    }
}

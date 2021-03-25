public class Main {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
                for (int j = 1; j < number - 1; j++) {
                    if (i == 0 || i == number - 1) {
                        System.out.print("*");
                    } else if (j == i) {
                        System.out.print("*");
                    } else if (j == ((number - 1) - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("*");
            }
        }
    }
}

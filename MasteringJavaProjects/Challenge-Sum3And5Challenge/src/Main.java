public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int numbersFound = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("The number " + i + " met the conditions");
                sum += i;
                numbersFound += 1;
                if(numbersFound == 5){
                    break;
                }
            }
        }
        System.out.println("The final sum was " + sum);
    }
}

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(66677777);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long years = minutes / (60 * 24 * 365);
            long remainingMin = minutes % (60 * 24 * 365);
            long days = remainingMin / (60 * 24);

            System.out.println(minutes + " min = " + years + " y and " + days + " d ");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(12, -5));
        System.out.println(calcFeetAndInchesToCentimeters(-12, 5));
        System.out.println(calcFeetAndInchesToCentimeters(12, 5));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet < 0 || inches < 0 || inches > 12){
            return -1;
        }
        return (inches * 2.54) + (feet * 12d * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches < 0){
            return -1;
        }
        return inches * 2.54;
    }
}

import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long lNum1 = (long) (num1 * 1000d);
        long lNum2 = (long) (num2 * 1000d);
        if(lNum1 == lNum2) {
            return true;
        }
        return false;
    }
}

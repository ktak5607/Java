public class Main {
    static final double ERROR = -1.0;
    public static void main(String[] args) {
	// write your code here
    }

    public static double area(double radius){
        if(radius < 0) {
            return ERROR;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0) {
            return ERROR;
        }
        return x * y;
    }

}

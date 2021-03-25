public class Main {

    public static void main(String[] args) {
	    Point one = new Point(6,5);
	    Point two = new Point(3, 1);
        System.out.println("Distance to point one is " + one.distance());
        System.out.println("Distance from point one to point two is " + one.distance(two));
        System.out.println("Distance from point one to coord 2,2 is " + one.distance(2,2));
        Point point = new Point();
        System.out.println("Distance to point is " + point.distance());
    }
}

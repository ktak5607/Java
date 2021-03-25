public class Main {

    public static void main(String[] args) {
	    Circle c = new Circle(3.75);
        System.out.println("The radius of c is " + c.getRadius());
        System.out.println("The area of c is " + c.getArea());

        Cylinder cy = new Cylinder(5.55, 7.25);
        System.out.println("The radius of cy is " + cy.getRadius());
        System.out.println("The height of cy is " + cy.getHeight());
        System.out.println("The area of cy is " + cy.getArea());
        System.out.println("The volume of cy is " + cy.getVolume());
    }
}
